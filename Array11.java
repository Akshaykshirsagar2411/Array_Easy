import java.util.*;

class Array11{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();


        int arr[]= new int[size];

         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

// Array sorted
int num=1;

        for(int i=0;i<arr.length;i++){

            int count=0;
            for(int j=0;j<arr.length;j++){

                
                if((i+1)==arr[j]){


                    count++;
                    
                } 
                

                
                
            }
            System.out.print(count+" ");   
        }

       


        
    }
}