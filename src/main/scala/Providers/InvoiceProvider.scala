package Providers

import Model.Order

trait InvoiceProvider {
  def sendInvoice(order: Order, emailAddress: String): Unit
}
