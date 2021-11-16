package com.example.winwinapp.ui

import android.content.Context
import android.content.Intent
import com.example.winwinapp.MainActivity

internal fun launchHome(context: Context) {
    val intent = Intent(context, MainActivity::class.java)
    intent.apply {
        this.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        this.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        this.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}

enum class StoreDataStatus { LOADING, ERROR, DONE }
