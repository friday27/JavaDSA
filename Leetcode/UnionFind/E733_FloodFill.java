class Solution {
    private int[][] image;
    private int target;
    private Queue<Integer> q;
    
    private void findNeighbors(int i, int j) {
        if(i > 0 && image[i-1][j] == target) {
            q.offer(i-1);
            q.offer(j);        
        }
        if(j < image[i].length-1 && image[i][j+1] == target) {
            q.offer(i);
            q.offer(j+1);
        }
        if(i < image.length-1 && image[i+1][j] == target) {
            q.offer(i+1);
            q.offer(j);
        }
        if(j > 0 && image[i][j-1] == target) {
            q.offer(i);
            q.offer(j-1);
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image.length == 0 || image[0].length == 0 || image[sr][sc] == newColor)
            return image;
        this.image = image;
        this.target = image[sr][sc];
        this.q = new LinkedList<Integer>();
        q.offer(sr);
        q.offer(sc);
        while(!q.isEmpty()) {
            int x = q.poll(), y = q.poll();
            image[x][y] = newColor;
            findNeighbors(x, y);
        }
        return image;
    }
}