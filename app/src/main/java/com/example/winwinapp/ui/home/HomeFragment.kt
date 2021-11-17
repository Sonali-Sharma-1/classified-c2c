package com.example.winwinapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.winwinapp.R
import com.example.winwinapp.data.dataclasses.Bidding
import com.example.winwinapp.data.dataclasses.MockData
import com.example.winwinapp.data.dataclasses.ProductX
import com.example.winwinapp.databinding.FragmentHomeBinding
import com.example.winwinapp.databinding.FragmentProductCatalogBinding
import com.example.winwinapp.ui.RecyclerViewPaddingItemDecoration
import com.example.winwinapp.viewmodels.HomeViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentProductCatalogBinding
    private val viewModel: HomeViewModel by activityViewModels()
    private lateinit var productAdapter: ProductAdapter
    private var mainList = mutableListOf<ProductX>()
    private val filterBy by lazy { listOf("All", "Fixed Price", "Auction") }
    private val categoriesList by lazy {
        listOf(
            "All",
            "Cars",
            "Home Appliances",
            "Hot Sales",
            "New Products"
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductCatalogBinding.inflate(layoutInflater)
        setViews()
        setObservers()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.actionBar?.hide()
    }

    private fun setObservers() {

    }


    private fun setViews() {
        binding.spnFilterBy
            .findViewById<TextView>(R.id.spn_filter_by)
        mainList = MockData.dataForForProductCatalog() as MutableList<ProductX>
        setProductsAdapter(mainList)
        binding.productsRecyclerView.apply {

//            this.layoutManager = LinearLayoutManager
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