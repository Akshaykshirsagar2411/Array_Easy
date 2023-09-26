import java.util.*;

class Array7{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();


        int arr[]= new int[size];
        int arr2[]= new int[size];

         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }


       
        System.out.println();

        for(int i=0;i<arr2.length;i++){

            arr2[i] = arr[i];
        }


        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){

                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }

            }
        }
         for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
         for(int i=0;i<arr2.length;i++){

            System.out.print(arr2[i]+" ");
        }
       System.out.println();

        int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==arr2[i]){


                count++;

                
              if(count==arr.length){

                System.out.println("Array is sorted");
                
            }
       
        
        }
        else{

                System.out.println("Array is not sorted");
            }




        
        

    }
    }
}