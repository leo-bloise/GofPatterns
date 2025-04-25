package gof.patterns.creational.builder.application

import gof.patterns.creational.builder.domain.TaxInvoice

interface TaxInvoiceExportBuilder<T> {
    fun buildHeader(invoice: TaxInvoice): TaxInvoiceExportBuilder<T>;
    fun buildBody(invoice: TaxInvoice): TaxInvoiceExportBuilder<T>;
    fun buildFooter(invoice: TaxInvoice): TaxInvoiceExportBuilder<T>;
    fun build(): T
}