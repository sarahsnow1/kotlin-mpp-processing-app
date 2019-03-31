package sample

import com.processing.Processing
import com.processing.ProcessingPlatform

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

fun hello(): String = "Hello from ${Platform.name}"

fun processingName(): String{
    return ProcessingPlatform.name
}

fun processingVersion(): Int {
    return Processing().version()
}

class Proxy {
    fun proxyHello() = hello()
}

fun main(args: Array<String>) {
    println(hello())
}