package gof.patterns.structural.adapter.application

import gof.patterns.structural.adapter.domain.CreditCard

class PaymentService(private val paymentAdapter: PaymentAdapter) {
    fun pay(creditCard: CreditCard, value: Double): Boolean {
        return paymentAdapter.pay(creditCard, value)
    }
}