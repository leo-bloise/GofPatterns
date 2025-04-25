package gof.patterns.structural.adapter.application

import gof.patterns.structural.adapter.domain.CreditCard
import gof.patterns.structural.adapter.external.MercadoLivrePaymentAPI

class MercadoLivrePaymentAdapter: PaymentAdapter {
    override fun pay(
        creditCard: CreditCard,
        value: Double
    ): Boolean {
        val paymentApi = MercadoLivrePaymentAPI()
        return paymentApi.pay(
            cardholder = creditCard.cardholderName,
            number = creditCard.number,
            value = value
        )
    }
}