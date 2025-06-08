package org.kmp.playground.kflite

internal expect class Tensor {
    val dataType: TensorDataType
    val name: String
    val shape: IntArray
}