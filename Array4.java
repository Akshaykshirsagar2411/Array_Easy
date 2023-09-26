import java.util.*;

class Array4{

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
          System.out.println("Enter the for pairs of element");
        
           int k = sc.nextInt();
           int count=0;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==k){


                    count++;
                }
            }
        }

        System.out.println("pairs of given number sum = "+count);
        
       

    }
}