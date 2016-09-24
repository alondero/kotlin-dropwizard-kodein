package com.github.alondero.kodeindropwizard.kodein

import com.github.alondero.kodeindropwizard.ConstantMessageProvider
import com.github.alondero.kodeindropwizard.MessageProvider
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.provider

class HelloWorldModule(message: String) {
    val module = Kodein.Module {
        bind<MessageProvider>() with provider { ConstantMessageProvider(message) }
    }
}
