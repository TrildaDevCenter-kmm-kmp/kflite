package org.kmp.playground.kflite

import org.tensorflow.lite.Delegate
import org.tensorflow.lite.Interpreter
import org.tensorflow.lite.Tensor

internal typealias PlatformInterpreter = Interpreter
internal typealias PlatformInterpreterOptions = Interpreter.Options
internal typealias PlatformTensorFlowDelegate = Delegate
internal typealias PlatformTensor = Tensor