package com.github.alondero.kodeindropwizard.kodein

import com.github.alondero.kodeindropwizard.ExampleConfiguration
import com.github.alondero.kodeindropwizard.ExampleResource
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.singleton

class ApplicationModule(configuration: ExampleConfiguration) {
    val objectGraph = Kodein {
        import(HelloWorldModule(configuration.message).module)

        bind<ExampleResource>() with singleton { ExampleResource(instance()) }
    }
}