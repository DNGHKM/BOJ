import java.util.*

val arr = arrayOf(4, 11, 23, 40, 60, 77, 89, 96, 100)
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val sb = StringBuilder()
    for (i in 1..k) {
        val num = sc.nextInt() * 100 / n
        sb.append("${findRank(num)} ")
    }
    println(sb)
}

fun findRank(num: Int): Int {
    for ((i, v) in arr.withIndex()) {
        if (num <= v) {
            return i + 1
        }
    }
    return 9
}
