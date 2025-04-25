package gof.patterns.structural.adapter.application

import gof.patterns.structural.adapter.domain.CreditCard

interface PaymentAdapter {
    /**
     * Adapter method that our service will be using.
     * It must be implemented by all adapters.
     * */
    fun pay(creditCard: CreditCard, value: Double): Boolean
}