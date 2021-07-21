private fun recursion_fibo(x: Int): Int {
    if (x == 1 || x == 2) return 1
    return recursion_fibo(x - 1) + recursion_fibo(x - 2)
}


object Dy_recursion_fibo {

    lateinit var dyList: IntArray

    fun dy_recursion_fibo(x: Int): Int {
        if (x == 1 || x == 2) return 1

        if (dyList[x] != 0) return dyList[x]
        dyList[x] = recursion_fibo(x - 1) + recursion_fibo(x - 2)
        return dyList[x]
    }

    fun dy_repeat_fibo(x: Int): Int {
        dyList[1] = 1
        dyList[2] = 1
        for (i in 3 until dyList.size) {
            dyList[i] = dyList[i - 2] + dyList[i - 1]
        }
        return dyList.last()
    }


}


fun main() {
    var input = readLine()!!.toInt()
    // 1. 재귀를 통한 피보나치
    println(recursion_fibo(input))
    // 2. 탑다운방식
    Dy_recursion_fibo.dyList = IntArray(input + 1) { 0 }
    println(Dy_recursion_fibo.dy_recursion_fibo(input))
    // 3. 바텀업방식
    Dy_recursion_fibo.dyList = IntArray(input + 1) { 0 }
    println(Dy_recursion_fibo.dy_repeat_fibo(input))


}
