package com.example.winwinapp.ui.seller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.winwinapp.R
import com.example.winwinapp.databinding.FragmentBecameSellerBinding

class BecameSellerFragment : Fragment() {

    private lateinit var binding: FragmentBecameSellerBinding

    private val hashMap = HashMap<String, String>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBecameSellerBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    private fun setUpViews() {
        mockDataForSignup()
        val name = binding.etName.text
        val email = binding.etEmail.text
        binding.btnSend.setOnClickListener {
            if (hashMap.containsKey(name.toString()) && hashMap.containsValue(email.toString())) {
                findNavController().navigate(R.id.action_seller_to_product)
            }
        }
    }


    private fun mockDataForSignup() {
        hashMap["sonali"] = "sonali@gmail.com"
        hashMap["james"] = "james@gmail.com"
        hashMap["akshay"] = "akshay@gmail.com"
        hashMap["samuel"] = "samuel@gmail.com"
        println(hashMap)
    }

}