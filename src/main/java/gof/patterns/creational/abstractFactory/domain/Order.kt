package gof.patterns.creational.abstractFactory.domain

import kotlinx.serialization.Serializable

@Serializable
data class Order(val client: Client, val product: Product) {
}