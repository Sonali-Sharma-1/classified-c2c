package com.example.winwinapp.ui.seller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.winwinapp.R
import com.example.winwinapp.databinding.FragmentUploadProductBinding

class UploadProductFragment : Fragment(), RadioGroup.OnCheckedChangeListener {

    private lateinit var binding: FragmentUploadProductBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUploadProductBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    private fun setUpViews() {
        val name = binding.etProductName.text
        val sellType = binding.rgSellWay.checkedRadioButtonId
        val price = binding.etPurchase.text
        binding.btnContinue.setOnClickListener {
            if (name != null && sellType != 0 && price != null) {
               findNavController().navigate(R.id.action_product_to_home, bundleOf("isFromProduct" to true))
            }
        }
    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        val checkedRadioButton = group?.findViewById(group.checkedRadioButtonId) as? RadioButton
        checkedRadioButton?.let {
            Toast.makeText(
                context,
                "RadioGroup: ${group?.contentDescription} RadioButton: ${checkedRadioButton?.text}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}