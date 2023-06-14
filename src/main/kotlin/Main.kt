fun main(args: Array<String>) {
    val amount = 5500
    val minCommission = 35
    val commission = 0.75

    val calculation = (amount * commission)/100
    val result = if (calculation < minCommission) minCommission else calculation

    println("Комиссия с суммы $amount составит $result руб.")
}