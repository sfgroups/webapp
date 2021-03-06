package webapp

import io.micronaut.http.client.annotation.Client
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Client("book")
interface BookClient {

    @Get("/")
    HttpStatus index()
}