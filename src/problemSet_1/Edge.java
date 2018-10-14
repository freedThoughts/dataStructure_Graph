package problemSet_1;

/**
 * Created by Prakash on 02-10-2018.
 */
public class Edge<T> {
    Vertex<T> source;
    Vertex<T> destination;
    int weight;
    Edge(){}
    Edge(Vertex<T> source, Vertex<T> destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

}
