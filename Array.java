class Main {
    public static void main(String[] args){
        int [] arr = {-8, 0, 6, 4, 2, -5};
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            if(i == arr.length - 1){
                System.out.println("Largest element is: " + max);
            }
            }
        }    
    }
}

// Given an array count no. of elements 
// having at least 1 element greater than itself --





