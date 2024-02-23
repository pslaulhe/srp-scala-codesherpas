package Providers

trait PricingProvider {
  def getPrice(productId: Int): Double
}
