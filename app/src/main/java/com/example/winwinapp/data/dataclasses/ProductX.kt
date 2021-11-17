package com.example.winwinapp.data.dataclasses

data class ProductX(
    val bidding: List<Bidding>,
    val highest_bid: Int,
    val id: String,
    val images: List<String>,
    val item_description: String,
    val name: String,
    val ownerEmail_id: String,
    val owner_contact: String,
    val price: Double,
    val rating : Float,
    val commentCount: Int,
)