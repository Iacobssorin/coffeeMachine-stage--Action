import java.util.*
fun triangle(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) * 0.5
    val area = Math.sqrt(s * (s - a) * (s - b) * (s - c))
    return area
}
fun circle(r: Double): Double {
    return 3.14 * r * r
}
fun rectangle(a: Double, b: Double): Double {
    return a * b
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val model = scanner.nextLine()
    print(when (model) {
        "triangle" -> triangle(a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble())
        "rectangle" -> rectangle(a = scanner.nextDouble(), b = scanner.nextDouble())
        "circle" -> circle(r = scanner.nextDouble())
        else -> "error"
    })
    // write your code here
}
