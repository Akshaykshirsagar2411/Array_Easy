import java.util.*;

class Array20{

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

 int num =5;
        for(int i=0;i<arr.length;i++){

       
          if(arr[i]==num){

            System.out.println(i)
          }

           

           

        }

        


    }
}