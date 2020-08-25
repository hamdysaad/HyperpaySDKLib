package com.example.mylibrary

import android.content.Context
import android.content.Intent
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity

class TestFileClass {



    fun startActivity(context: Context){
        context.startActivity(Intent(context , CheckoutActivity::class.java))
    }

}