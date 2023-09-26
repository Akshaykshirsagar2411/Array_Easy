import java.util.*;

class Array10{

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


        int i=0,j;
       int  count=0;

        for(i=0;i<arr.length;i++){

            for(j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){

                    System.out.println("First repeating index is "+(i+1));
                    count++;
                    break;
                }
            }
            if(count<=1){
                break;
            }
           
        }

    }
}