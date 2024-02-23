package Database

import Model.Order

trait OrderRepository {
  def create(order: Order): Unit
}
