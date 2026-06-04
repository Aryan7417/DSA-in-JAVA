import java.util.Scanner;

public class functionpracticsquestion {


// average OF  3 number ------------------------------------

//     public static int avg(int a , int b , int c){
//         int avg = (a+b+c)/3;

//         System.out.println("average of theee number:"+avg);

//         return avg;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         avg(a, b, c);
        
// }
//------------------------------------------------------------

// public static int sumODD(int n){
//     int odd=0;
//     for(int a = 1;a<=n;a++){
//         if(a%2!=0){
//             odd= odd+a;
//         }
//     }
//     System.out.println("The total odd number of sum is : "+odd);
//     return odd;
// }

// public static void main(String[] args) {
    
//     Scanner sc= new Scanner(System.in);
//     int ADDODD= sc.nextInt();
//     sumODD(ADDODD); 

//}

//----------------------------------------------------------------------

//----------------Circurferance of circle-------------------------------------

// public static double radious(double a){
    
//     double pi = 3.14;
//     double  radious = 2*pi*a;

//     return radious;
    
// }

// public static void main(String[] args) {

//     Scanner sc  = new Scanner(System.in);
//     double rad=sc.nextInt();
//     System.out.println(radious(rad));

// }

public static int agee(int age){
    if(age>=18){
        System.out.println("eELigible to Vote");
    }
    else{
        System.out.println("NOT ELIGIBLE TO VOTE");
    }
    return age;
}
 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter YOUR AGE");
    int age = sc.nextInt();
    System.out.println(agee(age)); 



}












}
