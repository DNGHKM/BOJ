import kotlin.math.abs

fun main() {
    val (x, m) = readln().split(" ").map { it.toInt() }
    val sum = divide(x, 0, m)
    print(sum)
}

fun divide(num: Int, count: Int, m: Int): Int {
    if (count == m) return num

    val next1 = abs(num / 2)
    val next2 = abs(num / 2) + if (num % 2 != 0) 1 else 0
    return num + divide(next1, count + 1, m) + divide(next2, count + 1, m)
}