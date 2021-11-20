package com.company;

public class Enterprise extends Account{

    public Enterprise(User user){
        super(user);

    }

    @Override
    public boolean addInsurance(Insurance insurance) {
        return false;
    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }
}
