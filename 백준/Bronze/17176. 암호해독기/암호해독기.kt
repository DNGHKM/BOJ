import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    val st = StringTokenizer(br.readLine())
    val arr = IntArray(53)

    for (i in 1..n) {
        val idx = Integer.parseInt(st.nextToken())
        arr[idx]++
    }

    val s = br.readLine()

    for (c in s) {
        var num = 0

        if (c >= 'a') {
            num = c - 'a' + 27
        } else if (c >= 'A') {
            num = c - 'A' + 1
        }

        arr[num]--

        if (arr[num] < 0) {
            print("n")
            return
        }
    }
    print("y")
}