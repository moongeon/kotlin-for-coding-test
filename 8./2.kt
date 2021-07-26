fun main() {
    var input = readLine()!!.toInt()
    var dy = Array(input){0}
    var inputList = readLine()!!.split(" ").map { it.toInt() }

    dy[0] = inputList[0]
    dy[1] = max(inputList[0],inputList[1])
    for (i in 2 until inputList.size){
        dy[i] = max(dy[i-1],dy[i-2]+inputList[i]) // 점화식
    }
    println(dy.last())

}
