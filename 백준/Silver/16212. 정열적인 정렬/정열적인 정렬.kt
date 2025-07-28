import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    sc.nextLine()
    val split = sc.nextLine().split(" ").map { it.toInt() }.toIntArray()
    split.sort()
    val sb = StringBuilder()
    for (i in split) {
        sb.append("$i ")
    }
    println(sb)
}