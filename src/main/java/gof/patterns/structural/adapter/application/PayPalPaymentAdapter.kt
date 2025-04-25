package gof.patterns.structural.adapter.application

import gof.patterns.structural.adapter.domain.CreditCard
import gof.patterns.structural.adapter.external.PayPalPaymentAPI

class PayPalPaymentAdapter: PaymentAdapter {
    override fun pay(
        creditCard: CreditCard,
        value: Double
    ): Boolean {
        val payPalPaymentAPi = PayPalPaymentAPI()
        return payPalPaymentAPi.pay(creditCard, value)
    }
}