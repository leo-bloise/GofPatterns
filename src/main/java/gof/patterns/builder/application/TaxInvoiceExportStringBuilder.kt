package gof.patterns.builder.application

import gof.patterns.builder.domain.TaxInvoice


class TaxInvoiceExportStringBuilder(): TaxInvoiceExportBuilder<String> {
    private val stringBuilder = StringBuilder()
    private fun calculateTotal(invoice: TaxInvoice): Double {
        var total = 0.0
        invoice.orders.forEach {
            val price = it.product.price * it.quantity
            total += price
        }
        return total
    }
    override fun buildHeader(invoice: TaxInvoice): TaxInvoiceExportBuilder<String> {
        stringBuilder.appendLine("Store Name: ${invoice.storeName}")
        stringBuilder.appendLine("Creation Date: ${invoice.creationDate}")
        stringBuilder.appendLine("Client: ${invoice.clientName}")
        return this
    }
    override fun buildBody(invoice: TaxInvoice): TaxInvoiceExportBuilder<String> {
        invoice.orders.forEachIndexed { index, order ->
            val price = order.product.price * order.quantity
            stringBuilder.appendLine(
                "Product ${index + 1}: ${order.product.code} | ${order.product.name}   ${String.format("%.2f", price)} - ${order.owner}"
            )
        }
        return this
    }

    override fun buildFooter(invoice: TaxInvoice): TaxInvoiceExportBuilder<String> {
        val total = calculateTotal(invoice)
        val tax = total * 0.1
        val totalPlusTax = total + tax
        stringBuilder.appendLine("Total: ${String.format("%.2f", total)}")
        stringBuilder.appendLine("Tax: ${String.format("%.2f", tax)}")
        stringBuilder.appendLine("Total + Tax: ${String.format("%.2f", totalPlusTax)}")
        return this
    }

    override fun build(): String {
        return stringBuilder.toString()
    }

}