import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    var n = input.nextInt()
    var k = input.nextInt()

    var a = readLine()!!.split(" ").map { it.toInt()}.sorted().toMutableList()

    var b = readLine()!!.split(" ").map { it.toInt()}.sortedDescending().toMutableList()

    for(i in 0 until k){
        if(a[i] < b[i]) {  
            var temp = a[i]
            a[i] = b[i]
            b[i] = temp
        }
        else{
            break
        }
    }

    println(a.sum())






}
