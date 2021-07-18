import java.util.*

data class node(
        val y: Int,
        val x: Int,
)


private fun bfs(graph: Array<Array<Int>>, y: Int, x: Int, visited: Array<Array<Boolean>>) {
    var q = LinkedList<node>()
    q.offer(node(y, x))
    visited[y][x] = true
    var direction = listOf(node(0, 1), node(0, -1), node(1, 0), node(-1, 0))    // 동서남북
    while (!q.isEmpty()) {
        var q_list = q.poll()
        var now_y = q_list.y
        var now_x = q_list.x
        for (j in direction) {
            var dy = j.y
            var dx = j.x
            var next_y = now_y + dy
            var next_x = now_x + dx
            if (next_y in 0 until 4 && next_x in 0 until 5) {
                if (!visited[next_y][next_x] && graph[next_y][next_x] == 0) {
                    q.offer(node(next_y, next_x))
                    visited[next_y][next_x] = true
                }

            }


        }
    }


}

fun main() {

    var input = Scanner(System.`in`)

    var row = 4
    var col = 5
    var graph = Array(row) { Array(col) { 0 } }
    var visited = Array(row) { Array(col) { false } }


    for (j in 0 until 4) {
        var str = input.nextLine().map { it.toInt() - 48 }.toIntArray()
        for (i in 0 until 5) {
            graph[j][i] = str[i]
        }
    }

    var result = 0
    for (j in 0 until 4) {
        for (i in 0 until 5) {
            if (!visited[j][i] && graph[j][i] == 0) {
                result += 1
                bfs(graph, j, i, visited)
            }
        }
    }
    println(result)


}
