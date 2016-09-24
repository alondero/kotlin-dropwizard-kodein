package com.github.alondero.kodeindropwizard

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class ExampleResource(val messageProvider: MessageProvider) {

    @GET
    fun happyMessage() = messageProvider.provide()
}
