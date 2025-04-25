package gof.patterns.structural.adapter.external

import gof.patterns.structural.adapter.domain.CreditCard

class PayPalPaymentAPI {
    fun pay(creditCard: CreditCard, value: Double): Boolean {
        println("Paying $value with $creditCard")
        return true
    }
}