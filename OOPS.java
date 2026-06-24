












//------------------------Abestraction------------------------

/*
abstract class Anilmal{
    abstract void walk();
    Anilmal(){
        System.out.println("-------You are creating a animal");
    }
}

class Chiken extends Anilmal{
    Chiken(){
        System.out.println("now created a chiken for edting ");
    }
    
    public void walk(){
        System.out.println("Eat the chiken with delicios legs");
    }
}

class Chita extends Anilmal{
    public void walk(){
        System.out.println("chitaa is my fevtopit animal ");
        
    }
}
public class OOPS {
    
public static void main(String[] args) {
    
Chiken cheik= new Chiken();


}

}


*/

//-------------------------------------------------------------------










//--------------Package---------------------


/*

import bank;


public class OOPS {
    
public static void main(String[] args) {
    bank.Account Acc1= new bank.Account();
    Acc1.name="aryan"
    System.out.println(Acc1.name);
}

}

*/

//---------------------------------------------------------










/*
//---------------------------------------------------------------Inheritance---------------------------------
//------------single leve inheritance----------------
class Shape{
    public void diplay(){
        System.out.println("AREA OF A SHAPE");
    }
}

class Triange extends Shape{
    public void arae(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// ------------Multi level inheritance--------------------

class EquiotrialTriamgle extends Triange{
    public void area(int l ,int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//------------------hybride inheritance------------------

public class OOPS {
    
public static void main(String[] args) {
    Shape t1=new Shape();
    Triange t2=new Triange();
    Circle t3=new Circle();
    t1.diplay();
    t2.arae(33,58);
    t3.area(4);
    
    
}
}

*/








//-----------------compile - polymorphism-----------------------------
/*

class Student{
    String name;
    int age;
    
    public void info(String name){
        System.out.println(name);
    }
    public void info(int age){
        System.out.println(age);
    }
    
    public void info(String name , int age){
        System.out.println(name+" "+age);
    }
}


public class OOPS {
    
public static void main(String[] args) {
    Student s1 =new Student();
    s1.name="Aryan";
    s1.age=23;
    
    s1.info(s1.name,s1.age);
    }
}


*/


//----------------------------------------------------------------------------------------------------------
















/*   --------------------------CONSTRICTOR---------------------------
class Student{
    String name;
    int age ;
    String GirlFriend;
    
    
    public void info() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.GirlFriend);
        
    }
    
    //---------------CONSTRUCTOR PARAMATRIC-----------
    // Student(String name, int age , String  GirlFriend){
        //     this.name=name;
        //     this.age=age;
        //     this.GirlFriend=GirlFriend;
        // }
        
        
        //--------------------NON-PARAMERTRIC CONSTRUCTOR-------------------
        // Student(){
            //     System.out.println("constyructor called");
            // }
            
            
            //------------------COPY CONSTRUCTOR---------------
            Student(Student s2){
                this.name=s2.name;
                this.age=s2.age;
                this.GirlFriend=s2.GirlFriend;
            }
            Student(){

        }
    }
    
    public class OOPS {
        
    public static void main(String[] args) {
        Student s1 = new Student();           //  <= Studen()-> contructor 
        s1.name="aryan";
        s1.age=20;
        s1.GirlFriend="khushi";
        
        
        Student s2= new Student(s1);
        s2.info();
        
    }
}


*/

//--------------------------------------------------------------------------------------------

//object and class


/*class Pen{
    String color;
    String type;
    String barnd;
    
    public void write(){
        System.out.println("writing somethinfg");
        }
        public void coloring(){
            System.out.println(this.color);
            }
            }
            
            
            public class OOPS {
                
            public static void main(String[] args) {
                Pen pen1=new Pen();
                pen1.color="red";
                pen1.type="boolpen";
                pen1.barnd="lodabarand";
                
                Pen pen2 = new Pen();
                pen2.color="yellow";
                pen2.type="magic";
                pen2.barnd="chootbard";
                
                
                
                pen1.write();
                pen1.coloring();
                pen2.coloring();
                }
                }  */
               
//---------------------------------------------------------------


          
               
               

