package com.example.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.swagger.v3.oas.annotations.Operation

@Controller("/example")
class ExampleController {
    @Get("/")
    @Operation(
        summary = "Get example",
        description = """Returns a simple string""",
    )
    fun index(
        @QueryValue("word") word: List<String>
    ): HttpResponse<String> {
        return HttpResponse.ok(
            "Hello World " + word.joinToString(", "),
        )
    }
}