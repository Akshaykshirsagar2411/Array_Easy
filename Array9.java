import java.util.*;

class Array9{

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


        for(int i=0;i<arr.length-1;i++){

            // for 0's

            if(arr[i]==0){

                if(arr[i+1]==1){
                    
                    System.out.println("Transition index is "+i);
                    break;
                }

                else{
                  System.out.println("Transition index is not found ");  
                  break;
                }
            
            }

    }









    }
}