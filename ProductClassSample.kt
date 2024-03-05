
fun main() {
    val iphone12 = Product(
        id = 1,
        name = "iphone 12",
        price = 3_000_000,
        taxPercent = 0.9f,
        commissionPercent = 0.1f
    )

    val iphone13 = Product(
        id = 2,
        name = "iphone 13",
        price = 3_600_000,
        taxPercent = 0.9f,
        commissionPercent = 0.15f
    )

    val iphone12TotalPrice = iphone12.getTotalPrice()
    println("${iphone12.name} total price is: $iphone12TotalPrice")

    println("${iphone13.id} tax price is: ${iphone13.getTaxPrice()}")
    println("${iphone13.name} total price is: ${iphone13.getTotalPrice()}")

}


class Product(
    val id: Int,
    val name: String,
    val price: Int,
    val taxPercent: Float,
    val commissionPercent: Float
) {
    fun getTaxPrice(): Float {
        return price * taxPercent
    }

    private fun getCommissionPrice(): Float {
        return price * commissionPercent
    }

    fun getTotalPrice(): Float {
        return price + getTaxPrice() + getCommissionPrice()
    }
}