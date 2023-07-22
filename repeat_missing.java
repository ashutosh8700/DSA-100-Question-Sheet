public class repeat_missing {
    public int[] repeatedNumber(final int[] arr) {
        // creating the result array of size 2;
        int result[] = new int [2];
        int origSum = 0;
        int currSum = 0;
      
        for(int i = 0;i<arr.length;i++){
            int origElement = Math.abs(arr[i]); // abs is used to avoid negative number
            int index = origElement - 1; 
            
            if(arr[index] < 0 ){
                result[0] = origElement;
            }
            arr[index] = -arr[index];
            origSum += (i+1);
            currSum += origElement; 
        }
        result[1] = origSum - (currSum - result[0]); 
        return result;
      }
}
