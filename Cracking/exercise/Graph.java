import java.util.*;

class Graph {
    Map<Integer, List<Integer>> map = new HashMap<>();

    Graph(int[] arr) {
        for(int i=0; i<arr.length; i+=2) {
            if(map.containsKey(arr[i]))
                map.get(arr[i]).add(arr[i+1]);
            else {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(arr[i+1]);
                map.put(arr[i], arr[i+1]);
            }
        }
    }

    void dfs(int head) {
        System.out.print(head+" ");
        List<Integer> adj = map.get(head);
        if(adj.size() != 0) {
            for(int i: adj)
                dfs(i);
        }
        System.out.println();
    }

    void bfs(int head) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(head);
        while(!q.isEmpty()) {
            int current = q.poll();
            System.out.print(current+" ");
            List<Integer> adj = map.get(current);
            if(adj.size() != 0) {
                for(int i: adj)
                    q.offer(i);
            }
        }
        System.out.println();
    }

}