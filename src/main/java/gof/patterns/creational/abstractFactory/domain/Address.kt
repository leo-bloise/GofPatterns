package gof.patterns.creational.abstractFactory.domain

import kotlinx.serialization.Serializable

@Serializable
data class Address(val latitude: Int, val longitude: Int) {
}