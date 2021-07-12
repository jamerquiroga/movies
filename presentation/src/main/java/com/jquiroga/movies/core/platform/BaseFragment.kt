package com.jquiroga.movies.core.platform

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
        initListeners()
        initObservers()
    }

    open fun initUI() = Unit

    open fun initListeners() = Unit

    open fun initObservers() = Unit
}