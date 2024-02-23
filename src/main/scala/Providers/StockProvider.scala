package Providers

trait StockProvider {
  def getStock(productId: Int): Int
}
