package gof.patterns.abstractFactory.domain

import kotlinx.serialization.Serializable

@Serializable
data class Product(val code: String, val name: String) {}