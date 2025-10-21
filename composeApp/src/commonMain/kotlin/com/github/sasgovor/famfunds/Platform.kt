package com.github.sasgovor.famfunds

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform