import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val d1 = sc.nextInt()
    val d2 = sc.nextInt()
    val d3 = sc.nextInt()

    val a = ((d1 + d2 - d3).toDouble() / 2)
    val b = ((d1 - d2 + d3).toDouble() / 2)
    val c = ((-d1 + d2 + d3).toDouble() / 2)

    if (a <= 0 || b <= 0 || c <= 0) {
        println(-1)
        return
    }

    println("1\n$a $b $c")
}