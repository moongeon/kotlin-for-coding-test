private fun dfs(graph: Array<Array<Int>>, start: Int, visited: Array<Boolean>) {
    visited[start] = true
    println(start)
    for(i in graph[start]){
        if(!visited[i]){
            dfs(graph, i, visited)
        }
    }
}


fun main() {
    var graph = arrayOf(
            arrayOf(),
            arrayOf(2, 3, 8),
            arrayOf(1, 7),
            arrayOf(1, 4, 5),
            arrayOf(3, 5),
            arrayOf(3, 4),
            arrayOf(7),
            arrayOf(2, 6, 8),
            arrayOf(1, 7),
    )

    var visited = Array(9) { false }

    dfs(graph, 1, visited)


}
