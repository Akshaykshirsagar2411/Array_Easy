import java.util.*;

class Array24{

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
        System.out.println();



        //7,4,8,2,9
        int count=1;

        int curr_max = arr[0];


        for (int i = 1; i < arr.length; i++) {
            
          
            if (arr[i] > curr_max || arr[i] == curr_max) {
                count++;
                curr_max = arr[i];
            }
        }

        System.out.println(count+" people can see sunrise");
        


    }
}