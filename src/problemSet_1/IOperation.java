package problemSet_1;

import java.util.List;
import java.util.Stack;

/**
 * Created by Prakash on 01-10-2018.
 */
public interface IOperation<T> {
    List<Vertex<T>> dfs();
    List<Vertex<T>> bfs();
    Stack<Vertex<T>> topologySort();
    Stack<Vertex<T>> topologySort2();
    void dijkstraShortestPath();
    void kruskalMinimumSpanningTree();
    void prismMinimumSpanningTree();
    void bellmanFordSingleSourceShortestPath();
}
