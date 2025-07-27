import java.time.*
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val split = sc.nextLine().split(" ")
    print(LocalDate.parse(split[0]).plusDays(split[1].toLong()).minusDays(1L))
}