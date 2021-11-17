package com.example.winwinapp.ui.home

import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.winwinapp.data.dataclasses.ProductX
import com.example.winwinapp.databinding.ItemProductCatalogBinding
import com.example.winwinapp.databinding.ProductsListItemBinding

class ProductAdapter(list: List<ProductX>, private val context: Context,isFromProduct:Boolean) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var productList = list
    var productFlow = isFromProduct
    lateinit var onClickListener: OnClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewType1 = ItemViewHolder(
            ItemProductCatalogBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ),
                parent,
                false
            )
        )

        return viewType1
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val proData = productList[position]) {
            is ProductX -> (holder as ItemViewHolder).bind(proData)
        }
    }

    override fun getItemCount(): Int = productList.size

    inner class ItemViewHolder(binding: ItemProductCatalogBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val productDiscount = binding.tvProductDiscount
        private val productTitle = binding.tvBrand
        private val productDetails = binding.tvProductDetails
        private val productPrice = binding.tvPrice
        private val productDescription = binding.tvProductDescriptionDetails
        private val sellerRating = binding.rbSellerBid
        private val comments = binding.tvComments
        private val buttonBuy = binding.btnBuy
        private val totalRating = binding.tvTotalRating
        private val btn = binding.btnBuy

        private val productImage = binding.imgProduct

        fun bind(productData: ProductX) {

            buttonBuy.setOnClickListener {
                onClickListener.onClick(productData)
            }

            Glide.with(context)
                .load(Uri.parse(productData.images[0]))
                .into(productImage)
            productTitle.text = productData.name
            productDescription.text = productData.item_description
            sellerRating.rating = productData.rating.toFloat()
            totalRating.text = productData.rating.toString() + "/5"
            productPrice.text = "$" + " " + productData.price.toString()
            comments.text = productData.commentCount.toString() + " " + " Comments"
            if(productFlow){
                btn.text = "Review & Confirm"
            }
            else{
                btn.text = "Buy"
            }

        }
    }

    interface OnClickListener {
        fun onClick(productData: ProductX)
    }
}