# Graphs

### Representation
#### Adjancency List

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
        }

#### Adjancency Matrix
* An adjacency matrix is an NxN boolean matrix (where N is the number of nodes), where a true value at matrix(i, j) indicates an edge from node i to node j. (You can also use an integer matrix with Os and 1s.)

### Search
#### DFS (Recursive)
* In depth-first search (DFS), we start at the rootand explore each branch completely before moving to the next branch.
* DFS is often preferred if we want to **visit every node in the graph**. Both will work just fine, but depth-first search is a bit simpler.
* Note that pre-order and other forms of tree traversal are a form of DFS. The key difference is that when implementing this algorithm for a graph, **we must check if the node has been visited**. If we don't, we risk getting stuck in an infinite loop.

        void DFSUtil(int v,boolean visited[]) 
        { 
            // Mark the current node as visited
            visited[v] = true; 

            // Recur for all the vertices adjacent to this vertex 
            Iterator<Integer> i = adj[v].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                    DFSUtil(n, visited); 
            } 
        } 

        // The function to do DFS traversal. It uses recursive DFSUtil() 
        void DFS(int v) 
        { 
            // Mark all the vertices as not visited(set as 
            // false by default in java) 
            boolean visited[] = new boolean[V]; 

            // Call the recursive helper function to print DFS traversal 
            DFSUtil(v, visited); 
        } 

#### BFS (Queue)
* In breadth-first search (BFS), we start at the root and explore each neighbor before going on to any of their children.
* If we want to find the shortest path (or **find any path**) between two nodes, 8FS is generally better.

        // prints BFS traversal from a given source s 
        void BFS(int s) { 
            // Mark all the vertices as not visited(By default 
            // set as false) 
            boolean visited[] = new boolean[V]; 

            // Create a queue for BFS 
            LinkedList<Integer> queue = new LinkedList<Integer>(); 

            // Mark the current node as visited and enqueue it 
            visited[s]=true; 
            queue.add(s); 

            while (queue.size() != 0) 
            { 
                // Dequeue a vertex from queue
                s = queue.poll(); 

                // Get all adjacent vertices of the dequeued vertex s 
                // If a adjacent has not been visited, then mark it 
                // visited and enqueue it 
                Iterator<Integer> i = adj[s].listIterator(); 
                while (i.hasNext()) 
                { 
                    int n = i.next(); 
                    if (!visited[n]) { 
                        visited[n] = true; 
                        queue.add(n); 
                    } 
                } 
            } 
        } 

* Bidirectional Search
    * Bidirectional search is used to **find the shortest path** between a source and destination node. It operates by essentially running **two simultaneous breadth-first searches**, one from each node. When their searches collide, we have found a path.
