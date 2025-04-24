package gof.patterns.abstractFactory.domain

import kotlinx.serialization.Serializable
import java.time.Instant

@Serializable
data class Invoice(val order: Order) {
    val id = Instant.now().toEpochMilli()
}