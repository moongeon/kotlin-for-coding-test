import java.util.*

data class Node(
    val index : Int,
    val distance : Int
):Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return this.distance - other.distance
    }
}


fun main() {

    var row = 3
    var graph = MutableList(row){
        PriorityQueue<Node>()
    }

    // 노드 0에 연결된 노드 정보
    graph[0].add(Node(1,7))
    graph[0].add(Node(2,5))
    // 노드 1에 연결된 노드 정보
    graph[1].add(Node(0,7))
    // 노드 2에 연결된 노드 정보
    graph[2].add(Node(0,5))


    println(graph)

}
