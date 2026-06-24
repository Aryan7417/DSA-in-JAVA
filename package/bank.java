package bank;

class Account{
    public String name;
    protected String email;
    private String pin;

    //getters and setters
    public String getpin(){
        return this.pin;
    }
    public void setpin(String pass){
        this.pin=pass;
    }

}

public class bank {
    public static void main(String[] args) {
        Account acc1= new Account();
        acc1.name="aryan";
        acc1.email="aryanb@gami.com";
        acc1.setpin("ksdj");
       System.out.println(acc1.getpin());
        
    }
    
}