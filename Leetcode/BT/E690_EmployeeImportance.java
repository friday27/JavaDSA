/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, List<Integer>> subs = new HashMap<>();
        HashMap<Integer, Integer> im = new HashMap<>();
        for(Employee e: employees) {
            subs.put(e.id, e.subordinates);
            im.put(e.id, e.importance);
        }
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(id);
        int sum = 0;
        while(!q.isEmpty()) {
            int current = q.poll();
            sum += im.get(current);
            for(int i: subs.get(current))
                q.offer(i);
        }
        return sum;
    }
}