package com.company;

import java.text.SimpleDateFormat;

public abstract class Account implements Comparable<Account> {
    private User use;
    private AuthenticationStatus authStatus = AuthenticationStatus.Fail;

    public abstract boolean addInsurance(Insurance insurance);

    public Account(User use) {
        this.use = use;
    }

    public User getUser() {
        return use;
    }


    public void login(String userEmail,String userPassword)throws InvalidAuthenticationException{
        if ((use.getUserEmail().equals(userEmail)) && (use.getUserPassword().equals(userPassword))){
            authStatus = AuthenticationStatus.Success;
        }else throw  new InvalidAuthenticationException("Incorrect email or password");
    }

    public final void showUserInfo(){
        SimpleDateFormat format = new SimpleDateFormat("hh:mm dd/MM/yyy");
        System.out.println("First Name: " + use.getUserName());
        System.out.println("Last Name: " + use.getUserLastName());
        System.out.println("Email: " + use.getUserEmail());
        System.out.println("Career: " + use.getUserCareer());
        System.out.println("Age: " + use.getUserAge());
        System.out.println("Last Login: " + format.format(use.getLastLoginDate()));
        System.out.println("Addresses: ");
        use.getAddressList().stream().forEach(address -> {
            System.out.println(address);
        });
    }

    public void addAddress(Address address){
        use.getAddressList().add(address.getAddress());
    }

    public boolean deleteAddress(Address address){
        return use.getAddressList().remove(address);
    }

}
