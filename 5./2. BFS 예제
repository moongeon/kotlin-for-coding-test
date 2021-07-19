import java.util.*


private fun bfs(graph: Array<Array<Int>>, start: Int, visited: Array<Boolean>) {
    /*코틀린은 jvm위에서 돌아가는 언어이기 때문에 자바에 존재하는 라이브러리를 가져다 사용할수 있음.
    * 자바에서 제공하는 큐는 클래스 형태가 아니라 인터페이스이며, 인터페이스를 구현하고 있는 여러 클래스들이 따로 존재
    * 따라서 자바의 큐를 사용하려면 큐 인터페이스를 구현하고 있는 클래스들의 인스턴스를 선언함으로 사용가능 ex) LinkedList,PriorityQueue etc
    * 
    * */

    var q = LinkedList<Int>()
    q.offer(start)
    // 현재 노드 방문 처리
    visited[start] = true
    // 큐가 빌때 까지 반복
    while (!q.isEmpty()) {
        var x = q.poll()
        println(x)
        for (i in graph[x]) {
            if (!visited[i]) {
                q.offer(i)
                visited[i] = true
            }
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

    bfs(graph, 1, visited)


}
