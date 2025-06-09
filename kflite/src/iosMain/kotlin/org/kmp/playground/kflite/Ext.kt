package org.kmp.playground.kflite

import cocoapods.TFLTensorFlowLite.TFLTensor
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSNumber

@OptIn(ExperimentalForeignApi::class)
internal fun TFLTensor.toTensor() = Tensor(this)

internal fun TensorShape.getNSNumberDimensionList() = dimensions.map(::NSNumber)