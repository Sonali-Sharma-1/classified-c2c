package com.example.winwinapp.ui.home

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.winwinapp.data.dataclasses.ProductX
import com.example.winwinapp.databinding.ProductsListItemBinding

class ProductAdapter(list: List<ProductX>, private val context: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var productList = list
    lateinit var onClickListener: OnClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewType1 = ItemViewHolder(
            ProductsListItemBinding.inflate(
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

    inner class ItemViewHolder(binding: ProductsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val productImage = binding.productImageView
        private val productTitle = binding.productNameTv
        private val productDesc = binding.productDesc
        private val productPrice = binding.productPriceTv
        private val productCard = binding.productCard

        fun bind(productData: ProductX) {

            productCard.setOnClickListener {
                onClickListener.onClick(productData)
            }

            Glide.with(context)
                .load(Uri.parse(productData.images[0]))
                .into(productImage)
            productTitle.text = productData.name
            productDesc.text = productData.item_description
            productPrice.text = productData.price.toString()
        }
    }

    interface OnClickListener {
        fun onClick(productData: ProductX)
    }
}