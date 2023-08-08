package com.reift.helloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform