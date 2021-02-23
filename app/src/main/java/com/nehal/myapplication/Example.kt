package com.nehal.myapplication

import java.lang.Math.random

class Example { }

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val random = random()

    numbers.each { println(random * it) }
}

inline fun <T> Collection<T>.each(block: (T) -> Unit) {
    for (e in this) block(e)
}
