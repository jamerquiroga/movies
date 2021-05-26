package com.jquiroga.data.core.mapper

abstract class SingleMapper<in T, out R> {
    abstract fun map(value: T): R
    fun map(values: List<T>): List<R> = values.map(::map)
}