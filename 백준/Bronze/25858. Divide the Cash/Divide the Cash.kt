import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()
    val sb = StringBuilder()
    var total = 0
    val arr = Array(n) { 0 }

    for (i in 1..n) {
        val num = sc.nextInt()
        total += num
        arr[i - 1] = num
    }

    for (i in arr) {
        sb.append("${d / total * i} \n")
    }
    println(sb)
}
