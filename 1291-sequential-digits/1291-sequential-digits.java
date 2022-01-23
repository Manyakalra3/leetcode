class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
    
        List<Integer> list =  new ArrayList<>();
        int number = 12;  // Initial smallest valid number
        int nextdigit=3;   // next digit of the valid number eg 123
        while(number<90){
            int counter = number;  // counter number for computation
            int counterdigit = nextdigit;
            while(counter <= high && counterdigit < 11){
                if(counter >= low) list.add(counter);
                counter = counter*10 + counterdigit;
                counterdigit++;
            }
            number+=11;  // every valid number will start with 12,23,34,45 and so on, the difference is always 11.
            nextdigit++;
        }
        Collections.sort(list);
        return list;
    }
}
   