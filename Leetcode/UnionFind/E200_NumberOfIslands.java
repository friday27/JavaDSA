class UnionFind {
    private int numBlocks;
    private int[] parents;
    
    UnionFind(int size) {
        this.numBlocks = size;
        this.parents = new int[numBlocks];
        for(int i=0; i<numBlocks; i++)
            parents[i] = i;
    }
    
    //find root node
    int find(int i) {
        int parent = parents[i];
        while(parent != parents[parent]) {
            parent = parents[parent];
        }
        return parent;
    }
    
    void union(int p, int q) {
        int root1 = find(p);
        int root2 = find(q);
        if(root1 == root2)
            return;
        parents[root2] = root1;
        numBlocks--;
    }
    
    int blocks() {
        return numBlocks;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        
        UnionFind uf = new UnionFind(grid.length*grid[0].length);
        
        // If there's a connected land, union 2 lands
        int numZero = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    int x = -1, y = -1;
                    if(i >= 1 && grid[i-1][j] == '1') {
                        x = i-1;
                        y = j;
                        uf.union(i*grid[i].length+j, x*grid[i].length+y);
                    }
                    if(j < grid[i].length-1 && grid[i][j+1] == '1') {
                        x = i;
                        y = j+1;
                        uf.union(i*grid[i].length+j, x*grid[i].length+y);
                    }
                    if(i < grid.length-1 && grid[i+1][j] == '1') {
                        x = i+1;
                        y = j;
                        uf.union(i*grid[i].length+j, x*grid[i].length+y);
                    }
                    if(j >= 1 && grid[i][j-1] == '1') {
                        x = i;
                        y = j-1;
                        uf.union(i*grid[i].length+j, x*grid[i].length+y);
                    }
                }else
                    numZero++;
            }
        }
        return uf.blocks() - numZero;
    }
}