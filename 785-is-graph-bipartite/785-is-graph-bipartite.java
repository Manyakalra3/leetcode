class Solution {
    public boolean isBipartite(int[][] graph) {
       int[]color= new int[graph.length];
        Arrays.fill(color,-1);
    for(int i=0;i<color.length;i++){
     //   if(color[i]==-1){
        if(!dfs(color.length,i,color,graph))
            return false;
       // }
    }
        return true;
    }
    public boolean dfs(int V,int i,int[]color,int[][]graph){
        if(color[i]==-1){
            color[i]=1;
        }
        for(int it:graph[i]){
            if(color[it]==-1){
               color[it]=1-color[i];
            
             if(!dfs(V,it,color,graph))return false;
            } 
           else if(color[it]==color[i])return false;
            
        }
        return true;
    }
}