package com.easy.springboot.demo_package_and_deploy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@SpringBootApplication
open class DemoPackageAndDeployApplication

fun main(args: Array<String>) {
    runApplication<DemoPackageAndDeployApplication>(*args)
}


@RestController
class HelloWorld {
    @GetMapping(value = ["", "/"])
    fun hello(): Map<String, Any> {
        val result = mutableMapOf<String, Any>()
        result["msg"] = "Hello,World"
        result["time"] = Date()
        return result
    }
}