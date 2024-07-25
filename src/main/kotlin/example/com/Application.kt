package example.com

import example.com.plugins.configureDatabases
import example.com.plugins.configureHTTP
import example.com.plugins.configureMonitoring
import example.com.plugins.configureRouting
import example.com.plugins.configureSerialization
import example.com.plugins.configureSockets
import io.ktor.server.application.Application

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain
        .main(args)
}

fun Application.module() {
    configureSockets()
    configureSerialization()
    configureDatabases()
    configureMonitoring()
    configureHTTP()
    configureRouting()
}
