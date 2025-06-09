package org.kmp.playground.kflite

import cocoapods.TFLTensorFlowLite.TFLInterpreterOptions
import kotlinx.cinterop.ExperimentalForeignApi

actual class InterpreterOptions actual constructor(numThreads: Int) {

    @OptIn(ExperimentalForeignApi::class)
    internal val tflInterpreterOptions = TFLInterpreterOptions().apply {
        setNumberOfThreads(numThreads.toULong())
    }
}