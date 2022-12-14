package bmstu.ru

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import bmstu.ru.plugins.*

fun main() {
    embeddedServer(Netty, port = 8081, host = "0.0.0.0") {
        configureSockets()
    }.start(wait = true)
}
