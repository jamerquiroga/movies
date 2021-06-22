package com.jquiroga.movies.core.platform

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUI()
        initObservers()
    }

    open fun initUI() = Unit

    open fun initObservers() = Unit

}