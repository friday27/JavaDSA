
public class Graph {    
    private final int V;
    private int[] adj; //adjanency list

    public Graph(int V) {
        this.V = V;
        adj = new int[V];
        for(int i=0; i<V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
    }

    public addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}