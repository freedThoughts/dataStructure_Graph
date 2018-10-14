package problemSet_1;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prakash on 02-10-2018.
 */
public class Graph<T> {
    boolean isDirected;
    public List<Vertex<T>> vertexList = new ArrayList<Vertex<T>>();
    public List<Edge<T>> edgeList = new ArrayList<Edge<T>>();
    Graph(boolean isDirected){
        this.isDirected = isDirected;
        this.vertexList = new ArrayList<Vertex<T>>();
    }

    Graph(){
        this.vertexList = new ArrayList<Vertex<T>>();
    }

    public boolean addVertex(Vertex<T> vertex){
        return vertexList.add(vertex);
    }

    public boolean addVertexWithDisjointSet(Vertex<T> vertex, DisjointSet<T> disjointSet) {
        vertex.parent = vertex;
        disjointSet.dataNodeMap.put(vertex.value, vertex);
        return vertexList.add(vertex);
    }

    public boolean addEdge(Vertex<T> source, Vertex<T> destination) {
        if (!vertexList.contains(source) || !vertexList.contains(destination))
            try {
                throw new Exception("Vertex is not available");
            } catch (Exception e) {
                e.printStackTrace();
            }
        boolean result = source.neighbours.add(destination);
        if(!isDirected)
            return result && destination.neighbours.add(source);
        return result;
    }

    public boolean addEdge(Vertex<T> source, Vertex<T> destination, int weight){
        if (!vertexList.contains(source) || !vertexList.contains(destination))
            try {
                throw new Exception("Vertex is not available");
            } catch (Exception e) {
                e.printStackTrace();
            }

        Edge<T> edge = new Edge<T>(source, destination, weight);
        boolean result =  source.neighbours.add(destination) && source.edges.add(edge) && edgeList.add(edge);
        if (!isDirected) {
            edge = new Edge<T>(destination, source, weight);
            return result && destination.neighbours.add(source) && destination.edges.add(edge) && edgeList.add(edge);
        }
        return result;
    }


}
