import java.util.*;
public class Badger{
    public static main void(Strings [] args){
     
        Scanner sc = Scanner(System.in);
       
        int a =10, b=12;
      
      if( a > b){
        System.out.print("A is grater than B");
      }
      else{
        System.out.print("B is greater than A")
          }
        
      int c = 0;
        c = a+b;
        
     System.out.print("The sum of A and B is:" +c);
        
     int n = sc.nextInt;    
     System.out.print("enter the length of an array: ");
     int arr[] = new int[n];
     
     for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
     }
        
     for(int j =0; j<n; j++){
        System.out.print(arr[j]+" ");
     }
    }

}
