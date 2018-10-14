package problemSet_1;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Prakash on 01-10-2018.
 */
public class Vertex<T> {
    public T value;
    public boolean isVisited;
    public List<Vertex<T>> neighbours = new ArrayList<>();
    public List<Edge<T>> edges = new ArrayList<>();

    // Disjoint set attributes
    public Vertex<T> parent;
    public int rank;

    Vertex(){}
    Vertex(T value){
        this.value = value;
    }
    Vertex(T value, boolean isVisited){
        this.value = value;
        this.isVisited = isVisited;
    }

    public Vertex(T value, int rank) {
        this.value = value;
        this.rank = rank;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;

        Vertex<?> vertex = (Vertex<?>) o;

        return value.equals(vertex.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
