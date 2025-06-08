package org.kmp.playground.kflite

import org.tensorflow.lite.DataType

internal fun PlatformTensor.toTensor() = Tensor(this)

internal fun TensorDataType.toTensorDataType() = when(this){
    TensorDataType.FLOAT32 -> DataType.FLOAT32
    TensorDataType.INT32 -> DataType.INT32
    TensorDataType.UINT8 -> DataType.UINT8
    TensorDataType.INT64 -> DataType.INT64
}
