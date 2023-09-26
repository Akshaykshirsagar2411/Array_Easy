import java.util.*;

class Array19{

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
        for(int i=1;i<arr.length;i++){

           

                if(arr[i-1] < arr[i] && arr[i+1]>arr[i]){

                    
                System.out.println(arr[i]);
            }
        }

        


    }
}