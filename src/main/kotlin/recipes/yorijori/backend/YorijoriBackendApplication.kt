package recipes.yorijori.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YorijoriBackendApplication

fun main(args: Array<String>) {
    runApplication<YorijoriBackendApplication>(*args)
}
