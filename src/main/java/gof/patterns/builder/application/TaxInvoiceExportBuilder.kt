package gof.patterns.builder.application

import gof.patterns.builder.domain.TaxInvoice

interface TaxInvoiceExportBuilder<T> {
    fun buildHeader(invoice: TaxInvoice): TaxInvoiceExportBuilder<T>;
    fun buildBody(invoice: TaxInvoice): TaxInvoiceExportBuilder<T>;
    fun buildFooter(invoice: TaxInvoice): TaxInvoiceExportBuilder<T>;
    fun build(): T
}