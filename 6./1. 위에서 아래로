import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    var count = input.nextInt()

    var numbers = Array(count){}.map { readLine()}.toTypedArray()
    numbers.sortByDescending { it!!.first() }
    numbers.forEach {
        print("$it ")
    }
}
