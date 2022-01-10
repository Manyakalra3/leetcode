class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color= image[sr][sc];
        if(color!=newColor)
            dfs(image,sr,sc,color,newColor);
        return image;
    }
    public void dfs (int[][]image,int r,int c,int color,int newcolor){
    if(image[r][c]==color){
        image[r][c]=newcolor;
       if(r+1<image.length) dfs(image,r+1,c,color,newcolor);
       if(r>0) dfs(image,r-1,c,color,newcolor);
        if(c+1<image[0].length)dfs(image,r,c+1,color,newcolor);
       if(c>0) dfs(image,r,c-1,color,newcolor);
        
    }
    }
}