package br.edu.bookstore.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class TestController {

    @Get("/app")
    fun test() = "OK"

}