import java.util.Scanner;

class Equillibrium {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.print("Enter number of elements:");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++){
            System.out.print("This is the prefix: " + a[i]);
            System.out.println();
        }
        int c = 0;
        int left_sum = 0;
        int right_sum = 0;
        for(int i=0; i<a.length; i++){
            if(i == 0){
                left_sum = 0;
            }else{
                for(int j=0; j<i; j++){
                    left_sum += a[j];
                }
            }
            
            right_sum = 0;
            for(int j=i+1; j<a.length; j++){
                right_sum += a[j];
            }
            
            if(left_sum == right_sum){
                System.out.println("Equilibrium index found at: " + i);
                c++;
            }
        }
        
        if(c == 0){
            System.out.println("No equilibrium index found");
        }
        
        sc.close();
    }
}