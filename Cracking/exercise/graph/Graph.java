import java.util.*;

class Node<T> {
    T data;
    List<Node> adj;

    Node(T d) {
        this.data = d;
        this.adj = new ArrayList<>();
    }
}

class Graph<T> {
    List<Node> nodes;

    Graph() {
        nodes = new ArrayList<>();
    }

    void add(T val) {
        nodes.add(new Node(val));
    }

    void addAdj(int m, int n) {
        Node a = nodes.get(m-1);
        Node b = nodes.get(n-1);
        a.adj.add(b);
        b.adj.add(a);
    }

    void addSingleAdj(Node a, Node b) {
        a.adj.add(b);
    }

    void addAdj(Node a, Node b) {
        a.adj.add(b);
        b.adj.add(a);
    }

    List<Node> getAdj(Node n) {
        return n.adj;
    }
}

