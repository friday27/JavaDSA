/*
    Cracking 4.1
    Route Between Nodes: 
    Given a directed graph, 
    design an algorithm to find out whether there is a route between two nodes.
*/

import java.util.*;

public class FindRoute {
    Graph<Integer> graph;

    FindRoute() {
        graph = new Graph<>();
        for(int i=1; i<=19; i++) {
            graph.add(i);
        }
        graph.addAdj(1, 2);
        graph.addAdj(1, 3);
        graph.addAdj(1, 4);
        graph.addAdj(3, 5);
        graph.addAdj(3, 6);
        graph.addAdj(4, 7);
        graph.addAdj(4, 8);
        graph.addAdj(5, 14);
        graph.addAdj(6, 12);
        graph.addAdj(6, 13);
        graph.addAdj(7, 10);
        graph.addAdj(7, 11);
        graph.addAdj(8, 9);
        graph.addAdj(14, 18);
        graph.addAdj(12, 17);
        graph.addAdj(10, 16);
        graph.addAdj(9, 15);
        graph.addAdj(16, 15);
        graph.addAdj(15, 17);
    }

    Node getNode(int n) {
        return graph.nodes.get(n-1);
    }

    boolean searchForRoute(Node a, Node b) {
        if(a == b)
            return true;
        Set<Node> visitedA = new HashSet<>();
        Set<Node> visitedB = new HashSet<>();
        Queue<Node> qab = new LinkedList<>();
        Queue<Node> qba = new LinkedList<>();
        qab.offer(a);
        qba.offer(b);
        while(!qab.isEmpty() || !qba.isEmpty()) {
            if(!qab.isEmpty()) {
                Node currentA = qab.poll();
                for(Node n: graph.getAdj(currentA)) {
                    System.out.println("loop1 search for "+currentA.data+" -> "+n.data);
                    if(n == b || visitedB.contains(n))
                        return true;
                    if(visitedA.add(n))
                        qab.offer(n);
                }
            }
            if(!qba.isEmpty()) {
                Node currentB = qba.poll();
                for(Node n: graph.getAdj(currentB)) {
                    System.out.println("loop1 search for "+currentB.data+" -> "+n.data);
                    if(n == a || visitedB.contains(n))
                        return true;
                    if(visitedB.add(n))
                        qba.offer(n);
                }
            }
        }
        while(!qab.isEmpty()) {
            Node currentA = qab.poll();
            for(Node n: graph.getAdj(currentA)) {
                System.out.println("loop2 search for "+currentA.data+" -> "+n.data);
                if(n == b|| visitedB.contains(n))
                    return true;
                if(visitedA.add(n))
                    qab.offer(n);
            }
        }
        while(!qba.isEmpty()) {
            Node currentB = qba.poll();
            for(Node n: graph.getAdj(currentB)) {
                System.out.println("loop2 search for "+currentB.data+" -> "+n.data);
                if(n == a || visitedB.contains(n))
                    return true;
                if(visitedA.add(n))
                    qba.offer(n);
            }
        }
        return false;
    }

    boolean searchForRoute2(Node a, Node b) {
        if(a == b)
            return true;
        Set<Node> visited = new HashSet<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(a);
        while(!q.isEmpty()) {
            Node current = q.poll();
            for(Node n: graph.getAdj(current)) {
                if(n == b)
                    return true;
                if(visited.add(n))
                    q.offer(n);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FindRoute test = new FindRoute();
        System.out.println(test.searchForRoute(test.getNode(1), test.getNode(17)));
        System.out.println(test.searchForRoute2(test.getNode(1), test.getNode(17)));
        System.out.println();
        System.out.println(test.searchForRoute(test.getNode(11), test.getNode(18)));
        System.out.println(test.searchForRoute2(test.getNode(11), test.getNode(18)));
        System.out.println();
        System.out.println(test.searchForRoute(test.getNode(1), test.getNode(19)));
        System.out.println(test.searchForRoute2(test.getNode(1), test.getNode(19)));
        System.out.println();
    }
}