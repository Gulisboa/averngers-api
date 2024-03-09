package br.com.guplisboa.avengers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AverngersApiApplication

fun main(args: Array<String>) {
	runApplication<AverngersApiApplication>(*args)
}
