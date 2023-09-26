import java.util.*;

class Array13{

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

        int num1 = sc.nextInt();
          int num2= sc.nextInt();
        int count=0;
         int index1 =0;
        int index2 =0;
        for(int i=0;i<arr.length;i++){

           

                if(arr[i]==num1){

                     index1=i+1;
                   
                    
                }
                

                if(arr[i]==num2){
                 index2 =i+1;
                 
                
                }
            
        }
        
          System.out.println("Minimum distence is "+(index2-index1));
        

        


    }
}