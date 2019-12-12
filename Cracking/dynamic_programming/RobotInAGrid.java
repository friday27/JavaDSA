/*
    Cracking 8.2 Robot in a Grid:
    Imagine a robot sitting on the upper left corner of grid with r rows and c columns. 
    The robot can only move in two directions, right and down, 
    but certain cells are "off limits" such that the robot cannot step on them. 
    Design an algorithm to find a path for the robot from the top left to the bottom right.
*/

import java.util.*;

public class RobotInAGrid {
    Set<Integer> visited = new HashSet<>();

    Stack<int[]> dfs(int[][] mat) {
        Stack<int[]> s = new Stack<>();
        int i = 0, j = 0;
        s.push(new int[]{i,j});
        while(!s.isEmpty()) {
            if(i == mat.length-1 && j == mat[0].length-1)
                return s;
            //is right available?
            if(j+1 < mat[0].length && mat[i][j+1] == 0 && visited.add(i*mat[0].length+j)) {
                s.push(new int[]{i, ++j});
            //is down available?
            }else if(i+1 < mat.length && mat[i+1][j] == 0 && visited.add(i*mat[0].length+j)) {
                s.push(new int[]{++i, j});
            }else {
                int[] back = s.pop();
                i = back[0];
                j = back[1];
            }
        } 
        return s;
    }

    public static void main(String[] args) {
        RobotInAGrid test = new RobotInAGrid();
        int[][] mat = {{0,1,1,1,1},
                       {0,1,1,1,1},
                       {0,1,1,1,1},
                       {0,0,0,0,0}};
        Stack<int[]> res = test.dfs(mat);
        for(int[] p: res) {
            System.out.println(p[0]+", "+p[1]);
        }
    }
}