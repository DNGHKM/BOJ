import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val m = sc.nextInt() * sc.nextInt()
    val p = sc.nextInt() * sc.nextInt()

    if (m > p) {
        print("M")
    } else if (m < p) {
        print("P")
    } else {
        print("E")
    }
}