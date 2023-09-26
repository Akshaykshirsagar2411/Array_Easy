import java.util.*;

class Array15{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size for first array");
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

       
      

        

       
         

            // element
        int min = arr[0], min_index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        
           
         }

       
         System.out.println("total rotation of array is "+ min_index);


        


    }
}