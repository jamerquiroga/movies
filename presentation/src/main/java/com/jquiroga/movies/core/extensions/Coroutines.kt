package com.jquiroga.movies.core.extensions

import kotlinx.coroutines.*

fun globalLaunch(block: suspend () -> Unit) = GlobalScope.launch { block() }

fun CoroutineScope.safeLaunch(
    exception: Throwable.() -> Unit = {},
    bock: suspend CoroutineScope.() -> Unit
): Job {
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        exception(throwable)
    }
    return this.launch(exceptionHandler) { bock(this) }
}

suspend fun <T> CoroutineScope.with(
    dispatcher: CoroutineDispatcher,
    block: suspend CoroutineScope.() -> T
) = withContext(dispatcher) { block() }