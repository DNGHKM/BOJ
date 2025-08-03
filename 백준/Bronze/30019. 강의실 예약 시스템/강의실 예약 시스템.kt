import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val list: MutableList<MutableList<IntArray>> = mutableListOf()

    for (i in 0..<n) {
        list.add(mutableListOf())
    }

    val sb = StringBuilder()
    for (i in 0..<m) {
        st = StringTokenizer(br.readLine())
        val room = st.nextToken().toInt() - 1
        val s = st.nextToken().toInt()
        val e = st.nextToken().toInt()

        if (list[room].size > 0) {
            if (list[room][list[room].size-1][1] > s) {
                sb.append("NO\n")
                continue
            }
        }
        list[room].add(intArrayOf(s, e))
        sb.append("YES\n")
    }
    println(sb)
}