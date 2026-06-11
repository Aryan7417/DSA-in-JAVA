// import java.util.Scanner;
// import java.util.Arrays;


// public class Array_question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 

//         System.out.println("Enter your string");
//         int num = sc.nextInt();
//         int mark[]=new int[num];

//         for(int i = 0 ; i<mark.length/2;i++){
//             int reverse = mark.length-1-i;

//             int temp=mark[i];
//             mark[i]=mark[reverse];
//             mark[reverse]  = temp;

//         }
//         System.out.println(Arrays.toString(mark));
    
    
//     }

// }

//----------------------------------------------------------------------------------------------

// public class Array_question {
//     public static void main(String[] args) {
        
//         float [] mark = {23.2f,63.44f,63.2f,254.2f,22.2f};
//         float sum = 0 ;
//         for(float element : mark){
//             sum= sum +element; 

//         }

//         System.out.println("the sum of the numbet is "+sum);
//     }
// }

//--------------------------------------------------------------------------------------------------

// public class Array_question {

//      public static void main(String[] args) {
//         float [] mark = {23.2f,63.44f,63.2f,254.2f,22.2f};
//         float num = 23.2f;
//         boolean isArray =false;      
        
        
//         for(float element:mark){
//             if(num == element){
//                 isArray = true;
//                 break;
                        
//             }
//         }
//         if(isArray){

//             System.out.println("Number presenty in the Array");
//         }
//         else{

//             System.err.println("Number uis not present ion the given Array");
//         }
//      }
// }


//---------------------------------------------------------------------------------------------------------------------------------------

// public class Array_question {

//      public static void main(String[] args) {
//         float [] marks = {83.3f,27.3f,53.3f,24.4f,33.3f};
//         float sum = 0 ;
//         for (float element:marks){
//             sum = sum+element;
//         }
//         System.out.println("The averavge marks of the student :"+sum/marks.length);
        
//      }
// }

//----------------------------------------------------------------------------------------------------------------------------------------



// public class Array_question {
//     public static void main(String[] args) {
        
//         int [][] mat1={{1,2,3,4},
//         {2,3,4,5} };

//         int [][] mat2 = {{6,4,5,34},
//         {5,7,6,3}};

//         int [][] result  = {{0,0,0,0},
//         {0,0,0,0}};


//         for(int i=0;i<mat1.length;i++){
//             for (int j = 0 ; j<=mat1[i].length;j++){
//                 System.out.format("sitting the value of  i=%d and j=%d \n",i,j);
//                 result[i][j]= mat1[i][j] +mat2[i][j];
//             }
//         }
//         for(int i = 0 ; i<mat1.length;i++){
//             for(int j = 0 ;j<mat1[i].length;j++){
//                 System.out.print(result[i][j]+" ");
//                 result[i][j] = mat1[i][j] + mat2[i][j];

//             }
//             System.out.println("");
//         }

         
//     }    
// }
//-------------------------------------------------------------------------------------------------------------------------------




// public class Array_question {

//     public static void main(String[] args) {

//         int [] arr  = {1,2,3,4,5};
//         int l = arr.length;
//      int n = Math.floorDiv(l, 2);
//      int temp ;

//      for(int i = 0 ; i <=n ;i++){
//         temp =arr[i];
//         arr[i]= arr[l-i-1];
//         arr[l-i-1] = temp;
//      }

//      for(int element :arr){
//         System.out.println(element);
//      }

//   --------------------------------------------------------------------------------------------------------------------------


// public class Array_question {

//      public static void main(String[] args) {
//         int [] arr = {1,2,53,543,6,7,3,4};
//         int max = 0;
//         for(int e:arr){
//             if(e>max){
//                 max= e;
//             }
//         }
//         System.out.println("the vlaue of the element of the array is :"+max);
        
//      }
// }

//------------------------------------------------------------------------------------------------------------------------------



//  public class Array_question {
 
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,45,6,7,4,23};
//         int min=Integer.MIN_VALUE;
//         for(int e:arr){
//             if(e<min){
//                 min = e;
//             }
//         }
//         System.out.println("the minimumnn number of the array : "+min);
//     }
//  }


//---------------------------------------------------------------------------------------------------------------------------


// public class Array_question {

//     public static void main(String[] args) {

//         boolean isSoted = true;
//         int [] arr= {1,2,3,5,8,9};
//         for(int i=0 ;i<arr.length-1;i++){
//             if(arr[i]>arr[i+1]){
//                 isSoted= false;
//                 break;
//             }
//         }

//         if(isSoted){
//             System.out.println("The array is stoted ");
//         }

//         else{
//             System.out.println("the array is not soted");
//         }
        
//     }
// }






















