/*
 * Copyright (C) 2021 Image Picker
 * Author: Nguyen Hoang Lam <hoanglamvn90@gmail.com>
 */

package com.nguyenhoanglam.imagepicker.helper

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast

class ToastHelper {
    companion object {
        @SuppressLint("ShowToast")
        fun show(context: Context, text: String, duration: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(context.applicationContext, text, duration).show()
        }
    }
}