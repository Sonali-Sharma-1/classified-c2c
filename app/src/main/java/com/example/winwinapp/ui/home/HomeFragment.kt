package com.example.winwinapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.winwinapp.data.dataclasses.Bidding
import com.example.winwinapp.data.dataclasses.ProductX
import com.example.winwinapp.databinding.FragmentHomeBinding
import com.example.winwinapp.ui.RecyclerViewPaddingItemDecoration
import com.example.winwinapp.viewmodels.HomeViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by activityViewModels()
    private lateinit var productAdapter: ProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        setViews()
        setObservers()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setObservers() {
    }

    private fun setViews() {
        val mainList = mutableListOf<ProductX>()
        val bidding = Bidding("", 10)
        val biddingList = listOf(bidding)
        val imageList: List<String> = listOf(
            "https://falabella.scene7.com/is/image/Falabella/15276437_1?wid=1500&hei=1500&qlt=70",
            "https://falabella.scene7.com/is/image/Falabella/15319633_1?wid=1500&hei=1500&qlt=70"
        )
        val productX = ProductX(
            biddingList, 100, "abc", imageList, "item_desc",
            "Wallets", "sonali1.work@gmail.com", "8687676788687", 1000
        )


        val bidding1 = Bidding("", 10)
        val biddingList1 = listOf(bidding)
        val imageList1: List<String> = listOf(
            "https://falabella.scene7.com/is/image/Falabella/15276437_1?wid=1500&hei=1500&qlt=70",
            "https://falabella.scene7.com/is/image/Falabella/15319633_1?wid=1500&hei=1500&qlt=70"
        )
        val productY= ProductX(
            biddingList, 100, "abc", imageList, "item_desc",
            "Wallets", "sonali1.work@gmail.com", "8687676788687", 1000
        )

        mainList.add(productX)
        mainList.add(productY)

        setProductsAdapter(mainList)
        binding.productsRecyclerView.apply {
            val gridLayoutManager = GridLayoutManager(context, 2)
//            gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
//                override fun getSpanSize(position: Int): Int {
//                    TODO("Not yet implemented")
//                }
//            }

            layoutManager = gridLayoutManager
            adapter = productAdapter
            val itemDecoration = RecyclerViewPaddingItemDecoration(requireContext())
            if (itemDecorationCount == 0)
                addItemDecoration(itemDecoration)
        }

        binding.loaderLayout.loaderFrameLayout.visibility = View.GONE
        binding.loaderLayout.circularLoader.showAnimationBehavior
    }

    private fun setProductsAdapter(productsList: List<ProductX>?) {
        productAdapter = ProductAdapter(productsList ?: emptyList(), requireContext())
    }
}