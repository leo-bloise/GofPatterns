package gof.patterns.structural.adapter.domain

import java.time.Instant

data class CreditCard(
    val number: String,
    val expirationDate: Instant,
    val cardholderName: String
) {
}