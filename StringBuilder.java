public class Stringbuilder {
    public static void main(String[] args) {
        
        // StringBuilder ab = new StringBuilder("H");
        

        //----------------------------------------------------------------------------
    //     System.out.println(ab);

    //     System.out.println(ab.charAt(2));

    //     //ab.setCharAt(0,'p');

    //     ab.insert(2,'n');

    //    // ab.delete(2,3);

    //     System.out.println(ab);

    //------------------------------------------------------------------------------------

    // ab.append("e");
    // ab.append("l");
    // ab.append("l");
    // ab.append("o");



    // System.out.printlm(ab);
    //  System.out.print(ab.length());

//-----------------------------------------------------------------------------------------------------------------------------------------


StringBuilder A = new StringBuilder("hello");

for(int i =0 ;i<A.length()/2;i++){
    int start = i ;
    int end =  A.length()-1-i;

    char frontChar = A.charAt(start);
    char backeChat = A.charAt(end);
    A.setCharAt(start,backeChat);
    A.setCharAt(end,frontChar);

}
System.out.print(A);
 



}
    
}
