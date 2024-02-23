package Providers

import Model.Order

trait ShippingProvider {
  def ship(order: Order): Unit
}
