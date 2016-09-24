package com.github.alondero.kodeindropwizard

import com.github.alondero.kodeindropwizard.kodein.ApplicationModule
import com.github.salomonbrys.kodein.instance
import io.dropwizard.Application
import io.dropwizard.setup.Environment

class ExampleApplication: Application<ExampleConfiguration>() {
    override fun run(configuration: ExampleConfiguration?, environment: Environment?) {
        configuration?.let {
            val kodein = ApplicationModule(configuration)

            environment?.let {
                it.jersey().register(kodein.objectGraph.instance<ExampleResource>())
            }
        }
    }
}

fun main(args: Array<String>) {
    ExampleApplication().run(*args)
}

