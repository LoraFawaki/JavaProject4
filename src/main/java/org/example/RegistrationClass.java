package org.example;

public class RegistrationClass {
    private String userName;

    public RegistrationClass (){
            this.userName = userName;
            this.email = email;
            this.password=password;

    }

    public void setUserName (String userName){
        this.userName = userName;
        if (userName.isEmpty() || userName.length()<6){
                System.out.println("UserName not Valid, has to be more than 6 Characters");
            }
    }
    public String getUserName(){
        return userName;
    }
    private String password;
    public void setPassword (String password){
        this.password = password;
        if (password.isEmpty() || password.length()<6 || password.contains(userName)){
            System.out.println("Password not valid, should be more than 6 characters and doesn't contain userName");
        }
    }
    public String getPassword (){
        return password;
    }
    private String email;
    public void setEmail(String email){
        this.email = email;
        if (!email.equals("yahoo")){
            System.out.println("email not valid, please create a yahoo email");
        }
    }
    public String getEmail(){
        return email;

    }

}

