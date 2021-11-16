package com.example.winwinapp

import android.app.Application
import com.example.winwinapp.data.ProductsRepoInterface

class WinWinApplication : Application() {

//    val productsRepository: ProductsRepoInterface
//        get() = ServiceLocator.provideProductsRepository(this)

    override fun onCreate() {
        super.onCreate()
    }

}