package com.github.alondero.kodeindropwizard

import kotlin.system.measureNanoTime

class ConstantMessageProvider(val message: String) : MessageProvider {
    override fun provide() = message
}
