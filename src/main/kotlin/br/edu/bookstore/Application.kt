package br.edu.bookstore

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License

@OpenAPIDefinition(
    info = Info(
        title = "hello-world",
        version = "0.0",
        description = "My API",
        license = License(name = "Apache 2.0", url = "https://foo.bar"),
        contact = Contact(url = "https://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
    )
)
object Application {
}

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("br.edu.bookstore")
        .start()
}

