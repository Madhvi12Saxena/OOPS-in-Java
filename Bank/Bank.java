package Bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // getters & setters

    // getters
    public String getPassword() {
        return this.password;
    }

    // setters
    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Madhvi Saxena";
        account1.email = "madhvisaxena@gmail.com";
        // account1.password = "abcd";    => Not Possible because password is private 
        // after getter and setter function

        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
