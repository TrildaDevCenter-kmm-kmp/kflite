package org.kmp.playground.kflite

import cocoapods.TFLTensorFlowLite.TFLTensor
import cocoapods.TFLTensorFlowLite.TFLInterpreter

import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
internal typealias PlatformInterpreter = TFLInterpreter
@OptIn(ExperimentalForeignApi::class)
internal typealias PlatformTensor = TFLTensor