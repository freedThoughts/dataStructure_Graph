package problemSet_1;

import java.util.*;

/**
 * Created by Prakash on 01-10-2018.
 */
public class OperationImpl<T> implements IOperation {
    Graph<T> graph;
    DisjointSet<T> disjointSet;

    OperationImpl() {
/*

        // Test data for bellmanFordSingleSourceShortestPath
        graph = new Graph<T>(true);
        Vertex<T> v0 = new Vertex<T>((T) new Integer(0));
        Vertex<T> v1 = new Vertex<T>((T) new Integer(1));
        Vertex<T> v2 = new Vertex<T>((T) new Integer(2));
        Vertex<T> v3 = new Vertex<T>((T) new Integer(3));
        Vertex<T> v4 = new Vertex<T>((T) new Integer(4));

        graph.addVertex(v0);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);

        graph.addEdge(v0, v1, 4);
        graph.addEdge(v0, v2, 5);
        graph.addEdge(v1, v2, -3);
        graph.addEdge(v0, v3, 8);
        graph.addEdge(v2, v4, 4);
        graph.addEdge(v3, v4, 2);
        graph.addEdge(v4, v3, 1);

*/

/*
        // Prism's Minimum Spanning Tree -- test data
        graph = new Graph<T>(false);
        Vertex<T> A = new Vertex<T>((T) new Character('A'));
        Vertex<T> B = new Vertex<T>((T) new Character('B'));
        Vertex<T> C = new Vertex<T>((T) new Character('C'));
        Vertex<T> D = new Vertex<T>((T) new Character('D'));
        Vertex<T> E = new Vertex<T>((T) new Character('E'));
        Vertex<T> F = new Vertex<T>((T) new Character('F'));

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        graph.addVertex(F);

        graph.addEdge(A, B, 3);
        graph.addEdge(B, C, 1);
        graph.addEdge(C, D, 1);
        graph.addEdge(A, D, 1);
        graph.addEdge(B, D, 3);
        graph.addEdge(D, E, 6);
        graph.addEdge(E, F, 2);
        graph.addEdge(C, F, 4);
        graph.addEdge(C, E, 5);*/

/*
        // Test data for kruskal's MinimumSpanningTree
        graph = new Graph<T>(true);  // keeping isDirected "true" as argument to avoid creation of duplicate edges
        Vertex<T> A = new Vertex<T>((T) new Character('A'), 0);
        Vertex<T> B = new Vertex<T>((T) new Character('B'), 0);
        Vertex<T> C = new Vertex<T>((T) new Character('C'), 0);
        Vertex<T> D = new Vertex<T>((T) new Character('D'), 0);
        Vertex<T> E = new Vertex<T>((T) new Character('E'), 0);
        Vertex<T> F = new Vertex<T>((T) new Character('F'), 0);

        disjointSet = new DisjointSet<T>();
        graph.addVertexWithDisjointSet(A, disjointSet);
        graph.addVertexWithDisjointSet(B, disjointSet);
        graph.addVertexWithDisjointSet(C, disjointSet);
        graph.addVertexWithDisjointSet(D, disjointSet);
        graph.addVertexWithDisjointSet(E, disjointSet);
        graph.addVertexWithDisjointSet(F, disjointSet);

        graph.addEdge(A, B, 3);
        graph.addEdge(A, D, 1);
        graph.addEdge(B, D, 3);
        graph.addEdge(B, C, 1);
        graph.addEdge(C, D, 1);
        graph.addEdge(D, E, 6);
        graph.addEdge(C, E, 5);
        graph.addEdge(C, F, 4);
        graph.addEdge(E, F, 2);*/

/*
        // Test data for Dijkstra Shortest Path
        graph = new Graph<T>(false);
        Vertex<T> A = new Vertex<T>((T) new Character('A'));
        Vertex<T> B = new Vertex<T>((T) new Character('B'));
        Vertex<T> C = new Vertex<T>((T) new Character('C'));
        Vertex<T> D = new Vertex<T>((T) new Character('D'));
        Vertex<T> E = new Vertex<T>((T) new Character('E'));
        Vertex<T> F = new Vertex<T>((T) new Character('F'));

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        graph.addVertex(F);

        graph.addEdge(A, B, 5);
        graph.addEdge(B, C, 2);
        graph.addEdge(C, D, 3);
        graph.addEdge(A, D, 9);
        graph.addEdge(A, E, 2);
        graph.addEdge(E, F, 3);
        graph.addEdge(D, F, 2);*/
/*

        //For BFS/ DFS  -- test data
        graph = new Graph<T>();
        Vertex<T> A = new Vertex<T>((T) new Character('A'));
        Vertex<T> B = new Vertex<T>((T) new Character('B'));
        Vertex<T> C = new Vertex<T>((T) new Character('C'));
        Vertex<T> D = new Vertex<T>((T) new Character('D'));
        Vertex<T> E = new Vertex<T>((T) new Character('E'));
        Vertex<T> F = new Vertex<T>((T) new Character('F'));
        Vertex<T> G = new Vertex<T>((T) new Character('G'));
        Vertex<T> H = new Vertex<T>((T) new Character('H'));

        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        graph.addVertex(F);
        graph.addVertex(G);
        graph.addVertex(H);

        A.neighbours.add(B);
        B.neighbours.add(A);
        B.neighbours.add(C);
        B.neighbours.add(H);
        C.neighbours.add(B);
        C.neighbours.add(D);
        C.neighbours.add(E);
        D.neighbours.add(C);
        D.neighbours.add(F);
        E.neighbours.add(C);
        E.neighbours.add(F);
        E.neighbours.add(G);
        E.neighbours.add(H);
        F.neighbours.add(E);
        G.neighbours.add(E);
        H.neighbours.add(B);
        H.neighbours.add(E);
*/

        // For TopologySort   -- test Data
        graph = new Graph<T>(true);
        Vertex<T> A = new Vertex<T>((T) new Character('A'));
        Vertex<T> B = new Vertex<T>((T) new Character('B'));
        Vertex<T> C = new Vertex<T>((T) new Character('C'));
        Vertex<T> D = new Vertex<T>((T) new Character('D'));
        Vertex<T> E = new Vertex<T>((T) new Character('E'));
        Vertex<T> F = new Vertex<T>((T) new Character('F'));
        Vertex<T> G = new Vertex<T>((T) new Character('G'));
        Vertex<T> H = new Vertex<T>((T) new Character('H'));
        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        graph.addVertex(F);
        graph.addVertex(G);
        graph.addVertex(H);

        graph.addEdge(A, C);
        graph.addEdge(B, C);
        graph.addEdge(C, E);
        graph.addEdge(B, D);
        graph.addEdge(D, F);
        graph.addEdge(E, F);
        graph.addEdge(F, G);
        graph.addEdge(E, H);

    }


    public Stack<Vertex<T>> topologySort1() {
        Stack<Vertex<T>> outputStack = new Stack<>();
        Set<Vertex<T>> visitedVertices = new HashSet<>();
        Stack<Vertex<T>> currentStack = new Stack<>();

        for (Vertex<T> v : graph.vertexList) {
            if (visitedVertices.contains(v))
                continue;
            visitedVertices.add(v);
            currentStack.push(v);
            while (!currentStack.isEmpty()) {
                Optional<Vertex<T>> neighbourOptional = currentStack.peek().neighbours.stream().filter(v1 -> !visitedVertices.contains(v1)).findFirst();
                if (neighbourOptional.isPresent()) {
                    Vertex<T> innerVertex = neighbourOptional.get();
                    visitedVertices.add(innerVertex);
                    currentStack.push(innerVertex);
                    continue;
                }
                outputStack.push(currentStack.pop());
            }
        }
        return outputStack;
    }

    List<Vertex<T>> bfs1() {
        List<Vertex<T>> output = new ArrayList<>(graph.vertexList.size());
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visitedVertices = new HashSet<>(graph.vertexList.size() * 2);

        Vertex vertex = graph.vertexList.get(0);
        queue.add(vertex);
        visitedVertices.add(vertex);
        output.add(vertex);


        while (!queue.isEmpty()) {
            List<Vertex> neighbours = queue.poll().neighbours;
            for (Vertex neighbour : neighbours) {
                if (visitedVertices.contains(neighbour))
                    continue;
                visitedVertices.add(neighbour);
                queue.add(neighbour);
                output.add(neighbour);
            }
        }

        return output;
    }

    List<Vertex<T>> dfs1() {
        Stack<Vertex> stack =  new Stack<>();
        List<Vertex<T>> output = new ArrayList<>();
        Set<Vertex<T>> visitedVertices = new HashSet<>();

        Vertex<T> vertex = graph.vertexList.get(0);
        output.add(vertex);
        visitedVertices.add(vertex);
        stack.push(null);
        stack.push(vertex);


        while (!stack.isEmpty()) {
            Optional<Vertex<T>> optional = vertex.neighbours.stream().filter(v -> !visitedVertices.contains(v)).findFirst();

            if (optional.isPresent()) {
                Vertex neighbour = optional.get();
                visitedVertices.add(neighbour);
                stack.push(neighbour);
                output.add(neighbour);
                vertex = neighbour;
                continue;
            }

            vertex = stack.pop();
        }

        return output;
    }


    public List<Vertex<T>> dfs2() {
        List<Vertex<T>> dfs =  new ArrayList<>(graph.vertexList.size());
        Stack<Vertex<T>> stack = new Stack();
        Vertex<T> vertex = graph.vertexList.get(0);
        Set<Vertex<T>> visitedSet = new HashSet<>();

        while (vertex != null || !stack.isEmpty()) {
            if (vertex == null) {
                // Remove from stack only when no neighbour of stack top left to explore. Otherwise just peek.
                vertex = stack.peek();
            }
            if (!visitedSet.contains(vertex)) {
                dfs.add(vertex);
                visitedSet.add(vertex);
                stack.push(vertex);
            }

            vertex = vertex.neighbours.stream()
                    .filter(vertex1 -> !visitedSet.contains(vertex1))
                    .findFirst()
                    .orElseGet( ()-> {
                        // Remove from stack only when no neighbour of stack top left to explore
                        stack.pop();
                        return null;
                    });
        }

        return dfs;
    }

    @Override
    public List<Vertex<T>> dfs(){
        List<Vertex<T>> dfs =  new ArrayList<>(graph.vertexList.size());
        Stack<Vertex<T>> stack = new Stack<Vertex<T>>();
        Vertex<T> vertex = graph.vertexList.get(0);
        vertex.isVisited = true;
        stack.add(vertex);
        dfs.add(vertex);
        while (!stack.isEmpty()) {
            Optional<Vertex<T>> optional = stack.peek().neighbours.stream().filter(v -> !v.isVisited).findFirst();
            if (!optional.isPresent()) {
                stack.pop();
                continue;
            }
            vertex = optional.get();
            vertex.isVisited = true;
            stack.push(vertex);
            dfs.add(vertex);
        }
        return dfs;
    }
    // O(V + E) where V is number of Vertices
    //                E is total number of edges across graph
    /*  E is not the number of edges adjacent to each vertex - its actually the total number of edges in the graph.
    Defining it this way is useful because you don't necessarily have the same number of edges on every single vertex.

    Since each edge gets visited once by the time the DFS ends, you get O(E) complexity from that part.
    Then you add the O(V) for visiting each vertex once and get O(V + E) on total.
    */

    @Override
    public List<Vertex<T>> bfs(){
        List<Vertex<T>> bfs =  new ArrayList<>(graph.vertexList.size());
        Queue<Vertex<T>> queue = new LinkedList<Vertex<T>>();
        Vertex<T> currentVisitingVertex = graph.vertexList.get(0);
        queue.offer(currentVisitingVertex);
        currentVisitingVertex.isVisited = true;
        while (!queue.isEmpty()) {
            currentVisitingVertex = queue.poll();
            bfs.add(currentVisitingVertex);
            currentVisitingVertex.neighbours.stream().filter(v -> !v.isVisited)
                    .forEach(v -> {v.isVisited = true;
                                    queue.offer(v);});
        }
        return bfs;
    }

    @Override
    public Stack<Vertex<T>> topologySort(){
        // Set contains() method - time complexity is O(1)
        Set<Vertex<T>> visitedVertices = new HashSet<Vertex<T>>(graph.vertexList.size() * 4/3 +1);
        Stack<Vertex<T>> internalStack = new Stack<Vertex<T>>();
        Stack<Vertex<T>> resultStack = new Stack<Vertex<T>>();
        for (Vertex<T> vertex : graph.vertexList){
            if (visitedVertices.contains(vertex))
                continue;
            visitedVertices.add(vertex);
            internalStack.push(vertex);
            while (!internalStack.isEmpty()) {
                Optional<Vertex<T>> optional = internalStack.peek().neighbours.stream().filter(v -> !visitedVertices.contains(v)).findFirst();
                if (!optional.isPresent()){
                    resultStack.push(internalStack.pop());
                    continue;
                }
                Vertex<T> vertex1 = optional.get();
                visitedVertices.add(vertex1);
                internalStack.push(vertex1);
            }
        }
        return resultStack;
    }

    @Override
    public Stack<Vertex<T>> topologySort2(){
        // Set contains() method - time complexity is O(1)
        Set<Vertex<T>> visitedVertices = new HashSet<Vertex<T>>(graph.vertexList.size() * 4/3 +1);
        Stack<Vertex<T>> resultStack = new Stack<Vertex<T>>();
        graph.vertexList.stream().filter(vertex -> !visitedVertices.contains(vertex)).forEach(vertex -> {
            visitedVertices.add(vertex);
            topologySortMethod(vertex, resultStack, visitedVertices);
        });
        return resultStack;
    }

    private void topologySortMethod(Vertex<T> vertex, Stack resultStack, Set<Vertex<T>> visitedVertices) {
        vertex.neighbours.stream().filter(v -> !visitedVertices.contains(v)).forEach(v -> {
            visitedVertices.add(v);
            topologySortMethod(v, resultStack, visitedVertices);});
        resultStack.push(vertex);
    }


    @Override
    public void minStepTopoSort() {

        Map<Vertex<T>, Integer> vertexHeightMap = new HashMap<>(graph.vertexList.size() * 2);
        graph.vertexList.stream()
                .filter(v -> !vertexHeightMap.containsKey(v))
                .forEach(v -> minTopoSort(v, vertexHeightMap));

        Map<Integer, Set<T>> heightDataMap = new TreeMap<>((Integer::compareTo));

        vertexHeightMap.entrySet()
                .forEach(e -> {
                    Set<T> vertexSet = heightDataMap.get(e.getValue());
                    if (vertexSet == null) {
                        vertexSet = new HashSet<>();
                        heightDataMap.put(e.getValue(), vertexSet);
                    }
                    vertexSet.add(e.getKey().value);
                });

        heightDataMap.entrySet().forEach(
                e -> System.out.println(e.getValue().toString())
        );
    }

    private int minTopoSort(Vertex<T> vertex, Map<Vertex<T>, Integer> vertexHeightMap) {
        if (vertexHeightMap.containsKey(vertex)) {
            return vertexHeightMap.get(vertex);
        }
        int height = 0;
        for (Vertex<T> v : vertex.neighbours){
            height = Math.max(height, minTopoSort(v, vertexHeightMap));
        }
        height++;
        vertexHeightMap.put(vertex, height);
        return height;
    }


    @Override
    public void dijkstraShortestPath(){
        // source can be taken from input
        Vertex<T> source = graph.vertexList.get(0);
        // Holds distance as key and Vertex as value, sorted in ascending order of distance
        Map<Integer, Vertex<T>> mapSortedByDistance = new TreeMap<Integer, Vertex<T>>((Integer o1, Integer o2) -> {
            int result = o1.compareTo(o2);
            return result == 0 ? 1: result;
        });

        // Holds final result-  vertex as key  and distance as distance
        Map<Vertex<T>, Integer> distanceMap = new HashMap<Vertex<T>, Integer>(graph.vertexList.size() * 4/3 +1);
        // Holds final result - Destination vertex as key and immediate parent as value
        Map<Vertex<T>, Vertex<T>> parentMap = new HashMap<Vertex<T>, Vertex<T>>(graph.vertexList.size() * 4/3 +1);
        // Source's immediate parent would be always null
        parentMap.put(source, null);
        // source distance is always 0
        mapSortedByDistance.put(0, source);
        // taking Integer.MAX_VALUE distance for rest of the vertex
        graph.vertexList.stream().filter(vertex -> vertex.value != source.value).forEach(vertex ->  mapSortedByDistance.put(Integer.MAX_VALUE, vertex));

        while (mapSortedByDistance.size() > 0){
            Iterator<Map.Entry<Integer, Vertex<T>>> itr = mapSortedByDistance.entrySet().iterator();
            Map.Entry<Integer, Vertex<T>> entry = itr.next();
            Vertex<T> vertex = entry.getValue();
            Integer distance = entry.getKey();
            itr.remove();
            distanceMap.put(vertex, distance);
            Map<Integer, Vertex<T>> tempMap = new HashMap<Integer, Vertex<T>>(vertex.neighbours.size() * 4/3+1);
            while (itr.hasNext()){
                Map.Entry<Integer, Vertex<T>> entry1 = itr.next();
                if (vertex.neighbours.contains(entry1.getValue())) {
                    Vertex<T> vertex1 = entry1.getValue();
                    Integer dis = entry1.getKey();
                    int distanceFromNeighbour = vertex.edges.stream().filter( edge -> edge.destination.value == vertex1.value).findFirst().get().weight;
                    if (dis > distance + distanceFromNeighbour){
                        itr.remove();
                        tempMap.put(distance + distanceFromNeighbour, vertex1);
                        parentMap.put(vertex1, vertex);
                    }
                }
            }
            mapSortedByDistance.putAll(tempMap);
        }

        showVertexDistanceFromSource(distanceMap);
        showPathDestinationToSource(parentMap);
    }

    private void showVertexDistanceFromSource(Map<Vertex<T>, Integer> distanceMap){
        System.out.println();
        for (Map.Entry<Vertex<T>, Integer> entry : distanceMap.entrySet())
            System.out.println(entry.getKey().value + " : "+ entry.getValue());
    }

    private void showPathDestinationToSource(Map<Vertex<T>, Vertex<T>> parentMap) {
        System.out.println();
        for (Map.Entry<Vertex<T>, Vertex<T>> entry : parentMap.entrySet()){
            System.out.println();
            System.out.print(entry.getKey().value + " : - ");
            Vertex<T> vertex = entry.getValue();
            while (vertex != null) {
                System.out.print(vertex.value + " >> ");
                vertex = parentMap.get(vertex);
            }
            System.out.print("Source");
        }
    }

    @Override
    public void kruskalMinimumSpanningTree(){
        Map<Integer, Edge<T>> weightEdgeMap = new TreeMap<Integer, Edge<T>>((Integer o1, Integer o2) -> {
                int result = o1.compareTo(o2);
                return result == 0 ? 1: result;
            });
        graph.edgeList.stream().forEach(edge -> weightEdgeMap.put(edge.weight, edge));
        List<Edge<T>> resultList = new ArrayList<Edge<T>>(graph.vertexList.size() - 1);

        Iterator<Map.Entry<Integer, Edge<T>>> iterator = weightEdgeMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Edge<T>> entry = iterator.next();
            Edge<T> edge = entry.getValue();
            Vertex<T> vertex1 = edge.source;
            Vertex<T> vertex2 = edge.destination;
            Vertex<T> parent1 = disjointSet.findSet_RootNode(vertex1);
            Vertex<T> parent2 = disjointSet.findSet_RootNode(vertex2);
            if (parent1 != parent2) {
                disjointSet.union(vertex1.value, vertex2.value);
                resultList.add(edge);
            }
            iterator.remove();
        }
        showMST(resultList);
    }

    private void showMST(List<Edge<T>> resultList){
        resultList.stream().forEach( edge -> System.out.println( "Edge between " + edge.source.value + " TO " + edge.destination.value));
    }

    @Override
    public void prismMinimumSpanningTree(){
        Vertex<T> source = graph.vertexList.get(0);
        Map<Integer, Vertex<T>> weightVertexMap = new TreeMap<>((Integer o1, Integer o2) -> {
            int result = o1.compareTo(o2);
            return result == 0 ? 1 : result;
        });
        weightVertexMap.put(0, source);
        graph.vertexList.stream().filter(vertex -> vertex != source).forEach(vertex -> weightVertexMap.put(Integer.MAX_VALUE, vertex));
        List<Edge<T>> resultEdges = new ArrayList<>(graph.vertexList.size() -1);
        Map<Vertex<T>, Edge<T>> vertexIntroducedByEdgeMap = new HashMap<>(graph.vertexList.size() * 4/3 +1);
        while (weightVertexMap.size() > 0) {
            Iterator<Map.Entry<Integer, Vertex<T>>> iterator = weightVertexMap.entrySet().iterator();
            Map.Entry<Integer, Vertex<T>> entry = iterator.next();
            Vertex<T> vertex = entry.getValue();
            if (vertexIntroducedByEdgeMap.containsKey(vertex))
                resultEdges.add(vertexIntroducedByEdgeMap.get(vertex));
            iterator.remove();
            Map<Integer, Vertex<T>> tempMap = new HashMap<>(weightVertexMap.size() * 4/3 +1);
            while (iterator.hasNext()) {
                Map.Entry<Integer, Vertex<T>> entry1 = iterator.next();
                Vertex<T> vertex1 = entry1.getValue();
                vertex.edges.stream().filter(edge -> edge.destination == vertex1 && edge.weight < entry1.getKey()).forEach(edge -> {
                    tempMap.put(edge.weight, vertex1);
                    vertexIntroducedByEdgeMap.put(vertex1, edge);
                    iterator.remove();
                });
            }
            weightVertexMap.putAll(tempMap);
        }
        showMST(resultEdges);
    }

    @Override
    public void bellmanFordSingleSourceShortestPath(){
        final Integer largeValue = 999999;
        Vertex<T> source = graph.vertexList.get(0);
        // Holds Vertex as Key and Object[] array as value. Object[] have distance at index 0 and parentVertex at index 1
        Map<Vertex<T>, Object[]> map = new HashMap<>(graph.vertexList.size() * 4/3 +1);
        Object[] objects = {0, null};
        map.put(source, objects);
        graph.vertexList.stream().filter(vertex -> vertex != source).forEach(vertex ->  {
            Object[] obj = {largeValue, null};
            map.put(vertex, obj);
        });
        for (int i = 0; i < graph.vertexList.size()-1; i++){
            graph.edgeList.stream().filter(edge -> (Integer)map.get(edge.source)[0] + edge.weight < (Integer)map.get(edge.destination)[0])
                    .forEachOrdered(edge -> {
                        Object[] ob = {(Integer)map.get(edge.source)[0] + edge.weight, edge.source};
                        map.put(edge.destination, ob);
                    });
        }
        showPath(map);
    }

    private void showPath(Map<Vertex<T>, Object[]> map) {
        map.entrySet().stream().forEach(vertexEntry -> {
            Vertex<T> vertex = (Vertex<T>) vertexEntry.getValue()[1];
            System.out.print(vertexEntry.getKey().value);
            while (vertex != null) {
                System.out.print(" << " + vertex.value);
                vertex = (Vertex<T>) map.get(vertex)[1];
            }
            System.out.println();
        });
    }

    // Time Complexity -- O(n ^ 4)
    @Override
    public void travelingSalesManProblem_HeldKarp(){
        int[][] weightMatrix = {
                {0, 1, 15, 6},
                {2, 0, 7, 3},
                {9, 6, 0, 12},
                {10, 4, 8, 0}
        };

        List<Set<Integer>> subSetsList = new ArrayList<>();
        subSetsList.add(new HashSet<>()); // EmptySet
        // Time complexity -- O(n ^ 3)
        for (int len = 1; len < weightMatrix.length-1; len++) {
            for (int i = 1; i < weightMatrix.length; i++) {
                Set<Integer> set = new HashSet<>();
                for (int j = i; j < i+len; j++) set.add(j < weightMatrix.length ? j :  j % weightMatrix.length +1);
                subSetsList.add(set);
            }
        }
        // Include all values except 0
        Set<Integer> set = new HashSet<>(weightMatrix.length-1);
        for (int i = 1; i < weightMatrix.length; i++) set.add(i);
        subSetsList.add(set);

        // Value of Map ~~ index 0 holds cost and index 1 holds parentIndex
        Map<Cell, int[]> map = new HashMap<>();
        ListIterator<Set<Integer>> iterator = subSetsList.listIterator();
        // Time complexity -- O(n ^ 4)
        while (iterator.hasNext()) {
            Set<Integer> currentSet = iterator.next();
            // Time Complexity -- O(n ^ 2)
            for (int i = 0; i < weightMatrix.length; i++) {
                if (currentSet.contains(i)) continue;
                // i == 0 is only valid for set having all rest of the indexes
                if (i == 0 && currentSet.size() < weightMatrix.length-1) continue;
                if (currentSet.isEmpty()) {
                    map.put(new Cell(i, currentSet), new int[]{weightMatrix[0][i], 0});
                    continue;
                }

                int cost = Integer.MAX_VALUE;
                int parent = -1;
                for (Integer k : currentSet) {
                    Set<Integer> newSet = new HashSet<>(currentSet.size() * 4/3);
                    newSet.addAll(currentSet);
                    newSet.remove(k);
                    int newCost = map.get(new Cell(k, newSet))[0] + weightMatrix[k][i];
                    if (newCost < cost) {
                        cost = newCost;
                        parent = k;
                    }
                }

                map.put(new Cell(i, currentSet), new int[]{cost, parent});
            }
        }

        System.out.println("Min Cost : " + map.get(new Cell(0, set))[0]);
        printPath(map, set, 0);
    }

    // Time Complexity -- O(n)
    private void printPath(Map<Cell, int[]> map, Set<Integer> set, int parent) {
        int[] ar = map.get(new Cell(parent, set));
        if (ar == null) return;
        int currentParent = ar[1];
        if (currentParent != 0) {
            set.remove(currentParent);
            printPath(map, set, currentParent);
        }
        set.add(parent);
        System.out.print(" >> " + parent + " ");
    }

    private static class Cell {
        private Integer destinationIndex;
        private Set<Integer> pathSet;

        Cell(){}
        Cell(Integer destinationIndex, Set pathSet) {
            this.destinationIndex = destinationIndex;
            this.pathSet = pathSet;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cell)) return false;

            Cell cell = (Cell) o;

            if (!destinationIndex.equals(cell.destinationIndex)) return false;
            return pathSet != null ? pathSet.equals(cell.pathSet) : cell.pathSet == null;
        }

        @Override
        public int hashCode() {
            int result = destinationIndex.hashCode();
            result = 31 * result + (pathSet != null ? pathSet.hashCode() : 0);
            return result;
        }
    }

    public static void main(String[] a){
        OperationImpl<Character> operation = new OperationImpl<Character>();
        operation.minStepTopoSort();
        //Stack<Vertex<Character>> output = operation.topologySort1();
        //while (!output.isEmpty())
        //    System.out.println(output.pop().value);

/*        List<Vertex<Character>> vertices = operation.dfs();
        ListIterator<Vertex<Character>> listIterator = vertices.listIterator();
        while (listIterator.hasNext())
            System.out.println(listIterator.next().value);*/

/*        Stack<Vertex<Character>> stack = operation.topologySort2();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().value);
        }*/

        //operation.travelingSalesManProblem_HeldKarp();

        //operation.test();

    }

    public void test(){
        for(Vertex<T> vertex : this.graph.vertexList){
            System.out.print(vertex.value + " :- ");
            for (Vertex<T> v : vertex.neighbours)
                System.out.print(v.value + ", ");
            System.out.println();
        }
    }


}
