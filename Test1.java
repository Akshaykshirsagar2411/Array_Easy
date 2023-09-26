import java.util.*;

class Test1{

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


        int r=2;
        for(int i=0;i<r;i++){

            int first =arr[0];

            int j;
            for( j=0;j<arr.length-1;j++){

                arr[j]=arr[j+1];

            }

            arr[j]=first;
        }

         for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();



    }
}