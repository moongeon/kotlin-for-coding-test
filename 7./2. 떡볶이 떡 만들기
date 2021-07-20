// 이진탐색으로 문제 해결 시간복잡도 O(logN)


fun main() {
    var case = readLine()!!.split(" ").map { it.toInt() }

    var n = case[0]
    var m = case[1]

    var riceList = readLine()!!.split(" ").map { it.toInt() }
    riceList.sorted()
    var minValue = riceList.minOrNull()
    var maxValue = riceList.maxOrNull()
    var midValue = ((minValue!! + maxValue!!)/ 2)

    while (true){
        var result = 0
        for (i in riceList){
            if(i - midValue > 0){
                result += (i - midValue)
            }
        }
        if(m == result){
            println(minValue)
            break
        }
        else if(m > result ){
            maxValue = midValue - 1
            midValue = ((minValue!! + maxValue!!) / 2)
        }else{
            minValue = midValue + 1
            midValue = ((minValue!! + maxValue!!) / 2)
        }



    }





}
