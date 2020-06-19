package machine
import java.util.Scanner

val scanner = Scanner(System.`in`)
val water = 400
val milk = 540
val beans = 120
val cups = 9
val money = 550
val choice = scanner.next()
fun showCoffeeMachineBalance() {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$beans of coffee beans")
    println("$cups of disposable cups")
    println("$money of money")
    println("")
}
fun fill() {
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    println("Write how many ml of water do you want to add: > $a")
    println("Write how many ml of milk do you want to add: > $b")
    println("Write how many grams of coffee beans do you want to add: > $c")
    println("Write how many disposable cups of coffee do you want to add: > $d")
    println("")
    println("The coffee machine has:")
    println("${water + a} of water")
    println("${milk + b} of milk")
    println("${beans + c} of coffee beans")
    println("${cups + d} of disposable cups")
    println("$money of money")


}
fun makeCoffee(waterC: Int, milkC: Int, beansC: Int, cupsC: Int, moneyC: Int) {
    println("The coffee machine has:")
    println("${water - waterC} of water")
    println("${milk - milkC} of milk")
    println("${beans - beansC} of coffee beans")
    println("${cups - cupsC} of disposable cups")
    println("${money + moneyC} of money")
}
fun buy() {
    val buy = scanner.nextInt()
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > $buy")
    when (buy) {
        1 -> makeCoffee(250, 0, 16, 1, 4)
        2 -> makeCoffee(350, 75, 20, 1, 7)
        3 -> makeCoffee(200, 100, 12, 1, 6)
    }
}
fun take() {
    val take  = choice
    println("Write action (buy, fill, take) : > $take ")
    println("I gave you $$money")
    println("The coffee machine has:")
    println("$water of water")
    println("")
    println("$milk of milk")
    println("$beans of coffee beans")
    println("$cups of disposable cups")
    println("${money - money} of money")
}
fun main() {
    showCoffeeMachineBalance()
    when (choice) {
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()
    }
}
