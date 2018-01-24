package com.ddf.wireless.apt.lab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ddf.wireless.app.annotation.AutoCreat

@AutoCreat
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
