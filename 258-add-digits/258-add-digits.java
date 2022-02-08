class Solution {
    public int addDigits(int num) {
        int result=0;
    
        while(num>0){
            result+=num%10;
            num=num/10;
             if(num==0 && result>9){
                 num=result;
                 result=0;
             }   
        }
        return result;
    }
}