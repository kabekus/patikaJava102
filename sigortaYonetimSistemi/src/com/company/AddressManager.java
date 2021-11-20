package com.company;

public class AddressManager {
    public static void addAddress(Account account, Address address)  {
        account.addAddress(address);
    }

    public static void removeAddress(Account account, Address address) {
        account.deleteAddress(address);
    }

}
