package org.kmp.playground.kflite

actual class InterpreterOptions(
    numThreads: Int,
    useNNAPI: Boolean = false,
    allowFp16PrecisionForFp32: Boolean = false,
    allowBufferHandleOutput: Boolean = false,
    delegates: List<Delegate> = emptyList()
) {
    actual constructor(numThreads: Int) : this(numThreads, false)

    internal val tensorFlowInterpreterOptions = PlatformInterpreterOptions()
        .setNumThreads(numThreads)
        .setAllowBufferHandleOutput(allowBufferHandleOutput)
        .setAllowFp16PrecisionForFp32(allowFp16PrecisionForFp32)
        .setUseNNAPI(useNNAPI)
        .apply {
            delegates.forEach {
                addDelegate(PlatformTensorFlowDelegate { it.getNativeHandle() })
            }
        }
}
