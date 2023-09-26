import java.util.*;

class Array1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();


        int arr[]= new int[size-1];

         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

// Array sorted
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }

        int sum1=0;
        int sum2=0;

        for(int i=0;i<arr.length;i++){

            sum1= sum1 +arr[i];


        }
        System.out.println(sum1);

        for(int i=1;i<=arr.length+1;i++){

            sum2 = sum2+i;
        }
          System.out.println(sum2);

        System.out.println("Missing number is = " + (sum2-sum1));


    }
}