class Graph[T, U] extends GraphBase[T, U] {
  def minimalSpanningTree(implicit f: (U) => Ordered[U]): Graph[T,U] = {
    def minimalSpanningTreeR(graphEdges: List[Edge], graphNodes: List[Node], treeEdges: List[Edge]): Graph[T,U] =
      if (graphNodes == Nil) Graph.termLabel(nodes.keys.toList, treeEdges.map(_.toTuple))
      else {
        val nextEdge = graphEdges.filter(edgeConnectsToGraph(_, graphNodes)).reduceLeft((r, e) => if (r.value < e.value) r else e)
        minimalSpanningTreeR(graphEdges - nextEdge, 
                             graphNodes.filter(edgeTarget(nextEdge, _) == None),
                             nextEdge :: treeEdges)
      }
    minimalSpanningTreeR(edges, nodes.values.toList.tail, Nil)
  }
}
