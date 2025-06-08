package org.kmp.playground.kflite


internal actual class Tensor(
    internal val platformTensor: PlatformTensor
) {
    actual val dataType: TensorDataType
        get() = platformTensor.dataType
    actual val name: String
        get() = platformTensor.name
    actual val shape: IntArray
        get() = platformTensor.shape
}
