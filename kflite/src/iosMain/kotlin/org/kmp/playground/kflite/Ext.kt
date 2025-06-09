package org.kmp.playground.kflite

import cocoapods.TFLTensorFlowLite.TFLTensor
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSNumber
import kotlinx.cinterop.*
import platform.Foundation.*

@OptIn(ExperimentalForeignApi::class)
internal fun TFLTensor.toTensor() = Tensor(this)

internal fun TensorShape.getNSNumberDimensionList() = dimensions.map(::NSNumber)

internal fun ByteArray.writeToTempFile(prefix: String = "model", suffix: String = ".tflite"): String {
    val tempDir = NSTemporaryDirectory()
    val filePath = "$tempDir/$prefix$suffix"
    val nsData = this.toNSData()
    nsData.writeToFile(filePath, true)
    return filePath
}


@OptIn(ExperimentalForeignApi::class)
internal fun ByteArray.toNSData(): NSData = memScoped {
    NSData.dataWithBytes(
        bytes = allocArray<ByteVar>(this@toNSData.size).also {
            this@toNSData.forEachIndexed { index, byte ->
                it[index] = byte
            }
        },
        length = this@toNSData.size.toULong()
    )
}