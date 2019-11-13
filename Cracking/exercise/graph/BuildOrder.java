import java.util.*;

public class BuildOrder {

    List<Character> buildInOrder(char[][] projects, char[] list) {
        List<Character> res = new ArrayList<>();
        HashMap<Character, ArrayList<Character>> map = new HashMap<Character, ArrayList<Character>>();
        Set<Character> heads = new HashSet<>();
        for(int i=0; i<list.length; i++) {
            heads.add(list[i]);
        }

        // build map
        for(int i=0; i<projects.length; i++) {
            char a = projects[i][0], b = projects[i][1];
            if(!map.containsKey(a)) {
                ArrayList<Character> tmp = new ArrayList<>();
                tmp.add(b);
                map.put(a, tmp);
            }else {
                map.get(a).add(b);
            }
            if(heads.contains(b))
                heads.remove(b);
        }

        // print single nodes and find a head
        char head = ' ';
        int headCount = 0;
        for(char h: heads) {
            if(!map.containsKey(h)) {
                res.add(h);
                System.out.println("single: "+h);
            }
            else {
                if(map.get(h).size() > headCount) {
                    head = h;
                    headCount = map.get(h).size();
                }
            }
        }
        System.out.println("head: "+head);

        // bfs
        bfs(map, head, res);
        return res;
    }

    void bfs(HashMap<Character, ArrayList<Character>> map, char start, List<Character> res) {
        Queue<Character> q = new LinkedList<Character>();
        Set<Character> visited = new HashSet<>();
        q.offer(start);
        while(!q.isEmpty()) {
            char current = q.poll();
            visited.add(current);
            res.add(current);
            if(!map.containsKey(current))
                continue;
            for(char sub: map.get(current)) {
                if(visited.add(sub))
                    q.offer(sub);
            }
        }
    }

    public static void main(String[] args) {
        BuildOrder test = new BuildOrder();
        char[][] input = {{'a','d'}, {'f','b'}, {'b','d'}, {'f','a'}, {'d','c'}};
        char[] list = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(test.buildInOrder(input, list));
    }
}