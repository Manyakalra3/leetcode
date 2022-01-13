class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        boolean[][]visited= new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]!=true){
                    
                    floodfill(grid,i,j,visited);
                    count++;
                    
                }
            }
        }
        return count;
    }
    public void floodfill(char[][]grid,int i,int j,boolean[][]visited){
        if(i<0||j<0||i>=grid.length|| j>=grid[0].length||visited[i][j]==true||grid[i][j]=='0'){
            return;
        }
        visited[i][j]=true;
        //grid[i][j]='0';
        floodfill(grid,i-1,j,visited);
        floodfill(grid,i+1,j,visited);
        floodfill(grid,i,j-1,visited);
        floodfill(grid,i,j+1,visited);
    }
}