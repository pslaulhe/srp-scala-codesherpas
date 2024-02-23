package Providers

import Model.CreditCardInfo

trait PaymentProvider {
  def charge(creditCardInfo: CreditCardInfo, amount: Double): Boolean
}
