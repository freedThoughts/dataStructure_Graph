package problemSet_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prakash on 05-10-2018.
 *
 * Space complexity - O(n)
 * Time complexity - O( m * f(n)) ~ O(m * 4) ~ O(m)
 *              where
 *              m is number of operation
 *              f(n) is a very slow function whose value is less than 4
 */
public class DisjointSet<T> {
    // Holds data and corresponding Node
    public Map<T, Vertex<T>> dataNodeMap = new HashMap<T, Vertex<T>>();

    public void makeSet(T data) {
        Vertex<T> node = new Vertex<T>(data,0);
        node.parent = node;
        dataNodeMap.put(data, node);
    }

    public T findSet_DataOfRootNode(T data){
        return findSet_RootNode(this.dataNodeMap.get(data)).value;
    }

    public Vertex<T> findSet_RootNode(Vertex<T> node){
        if (node == node.parent)
            return node;
        node.parent = findSet_RootNode(node.parent);
        return node.parent;
    }

    public boolean union(T data1, T data2){
        Vertex<T> node1 = dataNodeMap.get(data1);
        Vertex<T> node2 = dataNodeMap.get(data2);

        Vertex<T> parent1 = findSet_RootNode(node1);
        Vertex<T> parent2 = findSet_RootNode(node2);

        if (parent1 == parent2)
            return false;

        if (parent1.rank == parent2.rank) {
            parent1.rank += 1;
            parent2.parent = parent1;
            return true;
        }
        if (parent1.rank > parent2.rank) {
            parent2.parent = parent1;
            return true;
        }
        parent1.parent = parent2;
        return true;
    }
}
