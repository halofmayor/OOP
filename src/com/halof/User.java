package com.halof;

public class User {
    private boolean isLogged; //Não consigo mudar este estado fora do objeto
    public String firstName;
    public String lastName;
    private String fullName;
    public Address adress;
   public String getFullName() {
        return firstName + lastName;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }
}
