import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    var count = input.nextInt()

    var numbers = Array(count){}.map {it ->
      var readData = readLine()!!.split(" ")
        Pair(readData[0], readData[1])
    }.toTypedArray()

    numbers.sortWith(compareBy({it.second}))

    numbers.forEach {
        print("${it.first} ")
    }

}
