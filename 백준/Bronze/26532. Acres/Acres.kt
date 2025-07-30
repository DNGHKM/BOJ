fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val y = if (a * b % 24200 == 0) {
        a * b / 24200
    } else {
        a * b / 24200 + 1
    }
    println(y)
}