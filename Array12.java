import java.util.*;

class Array12{

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

         System.out.println("Enter number for find number if occurance");

        int num = sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){

           

                if(arr[i]==num){

                    count++;
                }
            
        }

        System.out.println(num+ " Occurs " +count+" times");

        


    }
}