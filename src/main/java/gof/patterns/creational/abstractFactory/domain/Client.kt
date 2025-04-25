package gof.patterns.creational.abstractFactory.domain

import kotlinx.serialization.Serializable

@Serializable
data class Client(val name: String, val billingAddress: Address) {
}