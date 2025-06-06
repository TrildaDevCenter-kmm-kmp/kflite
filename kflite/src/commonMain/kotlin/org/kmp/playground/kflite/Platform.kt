package org.kmp.playground.kflite

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform