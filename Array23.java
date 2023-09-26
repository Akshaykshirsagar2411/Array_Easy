import java.util.*;

class Array23{

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

       
          for(int j=i+1;j<arr.length;j++){

            if(arr[i]>arr[j]){

            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            }
          }

        }

        
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

        
        System.out.println("Great hiring = "+(arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]));


    }
}