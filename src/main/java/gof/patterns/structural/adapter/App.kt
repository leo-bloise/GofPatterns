package gof.patterns.structural.adapter

import gof.patterns.structural.adapter.application.MercadoLivrePaymentAdapter
import gof.patterns.structural.adapter.application.PayPalPaymentAdapter
import gof.patterns.structural.adapter.application.PaymentService
import gof.patterns.structural.adapter.domain.CreditCard
import java.time.Instant

fun main() {
    val payPalPaymentAdapter = PayPalPaymentAdapter()
    val mercadoLivrePaymentAdapter = MercadoLivrePaymentAdapter()
    val mercadoLivreService = PaymentService(
        mercadoLivrePaymentAdapter
    )
    val paypalService = PaymentService(
        payPalPaymentAdapter
    )
    val creditCard = CreditCard(
        "123",
        Instant.now(),
        "Leonardo Bloise"
    )
    paypalService.pay(creditCard, 100.0)
    mercadoLivreService.pay(creditCard, 100.0)
}