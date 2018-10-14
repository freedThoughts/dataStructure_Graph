package problemSet_1;

/**
 * Created by Prakash on 05-10-2018.
 */
public class OperationDisjointSet {
    public static void main(String[] a){

        DisjointSet<Integer> disjointSet = new DisjointSet();
        disjointSet.makeSet(1);
        disjointSet.makeSet(2);
        disjointSet.makeSet(3);
        disjointSet.makeSet(4);
        disjointSet.makeSet(5);
        disjointSet.makeSet(6);
        disjointSet.makeSet(7);

        disjointSet.union(1, 2);
        disjointSet.union(2, 3);
        disjointSet.union(4, 5);
        disjointSet.union(6, 7);
        disjointSet.union(5, 6);
        disjointSet.union(3, 7);

        System.out.println(disjointSet.findSet_DataOfRootNode(1));
        System.out.println(disjointSet.findSet_DataOfRootNode(2));
        System.out.println(disjointSet.findSet_DataOfRootNode(3));
        System.out.println(disjointSet.findSet_DataOfRootNode(4));
        System.out.println(disjointSet.findSet_DataOfRootNode(5));
        System.out.println(disjointSet.findSet_DataOfRootNode(6));
        System.out.println(disjointSet.findSet_DataOfRootNode(7));
    }
}
