import java.util.*;

class Array6{

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


        

         System.out.println("Unique array element");
       
         int max = 0;


         int count2 =0;
        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){


                if(arr[i]==arr[j]){
                    count++;
                }
              
            }
            if(count==1){
                System.out.println(arr[i]);
                 count2++;
            }


        }

        System.out.println(count2);

        int arr2[] = new int[count2];

        for(int i=0;i<arr2.length;i++){

            for(int j=i+1;j<arr2.length;j++){

                 int temp =arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
            }
        }

        
       

    }
}