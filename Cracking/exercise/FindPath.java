/*
    Cracking 4.2
    Given a directed graph, 
    design an algorithm to find out whether there is a route between two nodes

    [self assumption]
    Map<Iteger, ArrayList<Integer>> graph = new HashMap<>();
*/

import java.util.*;


class FindPath {
    boolean findPath(Graph graph, int a, int b) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        ArrayList<Integer> adj;
        queue.offer(a);
        while(!queue.isEmpty()) {
            int current = queue.poll();
            if(current == b)
                return true;
            visited.add(current);
            adj = graph.get(current);
            if(adj.size() != 0) {
                for(int i: adj) {
                    if(visited.add(i))
                        queue.offer(i);
                }
            }
        }
        return false;
    }
}

