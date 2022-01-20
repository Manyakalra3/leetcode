class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Arrays.sort(piles);
        // if(h==piles.length){
        //     return piles[piles.length-1];
        // }
        int left=1,right=1;
      //  int hr=0;
        for(int i:piles){
            right=Math.max(right,i);
        }
            while(left<right){
                int mid=(left+right)/2;
                int hr=0;
                for(int j:piles){
                    hr+=Math.ceil((double)j/mid);
                }
            
        // int speed=1;
        // while(true){
        //     int hours=0;
        //     for(int i:piles){
        //         hours+=Math.ceil((double)i/speed);
        //         if(hours>h){
        //             break;
        //         }
        //     }
            if(hr<=h){
                right=mid;
            }else{
               left=mid+1;
            }
        }
        return right;
    }
}