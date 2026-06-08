// public class Array7 {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 12;
//         marks[1] = 32;
//         marks[2] = 23;

//         System.out.println(marks[0]+" this is a normal print startment");

//         for(int i = 0 ; i<3;i++){
//             System.out.println(marks[i] +"  and this is used for loop to print all array");
//         }
        
//     }
    
// }

//--------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class Array7 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int ma[]= new int[number];

//         for(int i =0 ;i<number;i++){
//             ma[i]=sc.nextInt();
//         }


//         for(int i =0 ; i<number;i++){
//             System.out.println(ma[i]);
//         }

        
//     }
// }




//---------------------------------------------------------------------------------------------------

import java.util.Scanner;

 

public class Array7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] =new int[a];

        for(int i = 0 ;i<a;i++){
            arr[i]=sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i =0 ;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println("X is found a index :"+ i);
            }
        }






    }
}






