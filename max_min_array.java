class max_min{
public static void main(String args[]){
 int arr[] = {5,3,9,2,3};
 System.out.println("minimum is"+min(arr));
 System.out.println("minimum is"+max(arr));
}

static int min(int arr[]){
    int min = arr[0];

    for(int i = 0;i<arr.length; i++){
        if(arr[i] < min ){
            min = arr[i];
        }
    }
    return min;
}

static int max(int arr[]){
    int max = arr[0];

    for(int i = 0;i<arr.length; i++){
        if(arr[i] > max ){
            max = arr[i];
        }
    }
    return max;
}
}

// optimized approach in the registor
