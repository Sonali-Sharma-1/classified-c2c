package com.example.winwinapp.ui.seller

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.winwinapp.data.dataclasses.Bidding
import com.example.winwinapp.data.dataclasses.MockData
import com.example.winwinapp.data.dataclasses.ProductX
import com.example.winwinapp.databinding.FragmentCheckoutBinding

class CheckoutFragment : Fragment() {

    private var mainList = mutableListOf<ProductX>()
    private lateinit var binding: FragmentCheckoutBinding
    private val hashMap = HashMap<String, String>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCheckoutBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainList = MockData.dataForForProductCatalog() as MutableList<ProductX>
        val product = mainList[0]
        context?.let {
            Glide.with(it)
                .load(Uri.parse(product.images[0]))
                .into(binding.imgProduct)
        }

        binding.tvName.text =  product.name
        val biddingList = Bidding("sonali", 290000)
        binding.tvBidPrice.text = "Your Bid"
        binding.tvSubtotal.text = "$500.00"
        binding.tvTotal.text = "$500.000"
        binding.totalCmr.text = "$460.00"
    }


}