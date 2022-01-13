class Solution {
// class Pair {
//     int x;
//     int y;
  
// public Pair(int x, int y)
//     {
//         this.x = x;
//         this.y = y;
//     }
// }
//    Arrays.sort(arr, new Comparator<Pair>() {
//             @Override public int compare(Pair p1, Pair p2)
//             {
//                 return p1.y - p2.y;
//             }
//         });
    public int findMinArrowShots(int[][] points) {
         Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrow=1;
        int start=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>start){
                
                arrow++;
           start =points[i][1];
            }
        }
        
        return arrow;
    }
}