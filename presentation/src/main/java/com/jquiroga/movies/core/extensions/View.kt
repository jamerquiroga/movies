package com.jquiroga.movies.core.extensions

import android.view.View
import android.view.inputmethod.InputMethodManager

fun View?.visible(value: Boolean = true) = apply {
    this?.visibility = if (value) View.VISIBLE else View.GONE
}

fun View?.gone() = apply {
    this?.visibility = View.GONE
}

fun View?.invisible() = apply {
    this?.visibility = View.INVISIBLE
}

fun View?.enable(value: Boolean = true) = apply {
    this?.isEnabled = value
}

fun View?.disable() = apply {
    this?.isEnabled = false
}

fun View.showKeyboard() {
    val inputMethodManager =
            context.getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
}


fun View.hideKeyboard() {
    val inputMethodManager =
            context.getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}