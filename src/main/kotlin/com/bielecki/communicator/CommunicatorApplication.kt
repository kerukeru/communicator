package com.bielecki.communicator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommunicatorApplication

fun main(args: Array<String>) {
	runApplication<CommunicatorApplication>(*args)
}
