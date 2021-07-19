import java.util.*

data class Node(
        val y: Int,
        val x: Int,
        val d: Int
)

data class Direction(
        val y: Int,
        val x: Int,
)


fun bfs(graph: Array<Array<Int>>, y: Int, x: Int, visited: Array<Array<Boolean>>, row: Int, col: Int) {
    var q = LinkedList<Node>()
    q.offer(Node(y, x, 1))
    var dirs = listOf(Direction(0, 1), Direction(0, -1), Direction(1, 0), Direction(-1, 0)) // 동서남북
    var now_d = 0

    visited[y][x] = true

    while (!q.isEmpty()) {
        var qList = q.poll()
        var now_y = qList.y
        var now_x = qList.x
        now_d = qList.d
        for (dir in dirs) {
            var dy = dir.y
            var dx = dir.x
            var next_y = now_y + dy
            var next_x = now_x + dx
            if (next_y == row - 1 && next_x == col - 1) {
                println(now_d+1)
                return
            }
            if (next_y in 0 until row && next_x in 0 until col) {
                if (!visited[next_y][next_x] && graph[next_y][next_x] == 1) {
                    visited[next_y][next_x] = true
                    q.offer(Node(next_y, next_x, now_d + 1))
                }
            }
        }
    }

}


fun main() {

    var input = Scanner(System.`in`)
    var row = input.nextInt()
    var col = input.nextInt()

    var graph = Array(row){Array(col){0}}.map {
        readLine()!!.map { it.toInt() - 48 }.toTypedArray()
    }.toTypedArray()
    var visited = Array(row) { Array(col) { false } }
    input.reset()
//    for (j in 0 until row) {
//        var str = readLine()!!.map { it.toInt() - 48 }.toIntArray()
//        for (i in 0 until col) {
//            graph[j][i] = str[i]
//        }
//    }

    bfs(graph, 0, 0, visited, row, col)


}
