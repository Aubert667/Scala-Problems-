# Scala-Problems-

 (*) Create a list containing all integers within a given range.
//     Example:
//     scala> range(4, 9)
//     res0: List[Int] = List(4, 5, 6, 7, 8, 9)


//  (**) Construct the minimal spanning tree.
//     Write a method minimalSpanningTree to construct the minimal spanning tree
//     of a given labeled graph.  Hint: Use Prim's Algorithm.  A small
//     modification of the solution of P83 does the trick.  The data of the
//     example graph to the right can be found below.
//
//     Graph:
//     Graph.termLabel(
//       List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'),
//            List(('a', 'b', 5), ('a', 'd', 3), ('b', 'c', 2), ('b', 'e', 4),
//                 ('c', 'e', 6), ('d', 'e', 7), ('d', 'f', 4), ('d', 'g', 3),
//                 ('e', 'h', 5), ('f', 'g', 4), ('g', 'h', 1)))
//
//     scala> Graph.fromStringLabel("[a-b/1, b-c/2, a-c/3]").minimalSpanningTree
//     res0: Graph[String,Int] = [a-b/1, b-c/2]
