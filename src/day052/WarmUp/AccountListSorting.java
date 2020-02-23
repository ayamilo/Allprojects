package day052.WarmUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {
        List<Account> accountList=new ArrayList<>();
        accountList.add( new Account("Kamil",100000));
        accountList.add( new Account("Ibrahim",90000));
        accountList.add( new Account("Hamza",90000));
        accountList.add( new Account("Rahim",90000));
        accountList.add( new Account("Salma",90000));
        accountList.add( new Account("Ismail",90000));

        System.out.println("accountlist Before = \n"+ accountList);
        Collections.sort(accountList);
        System.out.println("accountlist after = \n"+ accountList);

        // create another account with your name :
        // transfer everyone's money to your account
        Account myAccount = new Account("Husein",0);

        for (Account each: accountList) {
            each.transferAll(myAccount);
        }
        System.out.println("myAccount = " +myAccount );
        System.out.println("accountlist after transfer = \n"+ accountList);

        // What can be the data type of a1
        /*
         * Account a1 ;
         * Comparable a1 ;
         * Transferable a1 ;
         * Object a1
         *
         * An object can be referred by
         *       it's own type
         *       it's super class type
         *       interface type that it implemented
         *
         * */


        Account a1 = new Account("Polymorphism1", 10000);
        Transferable t1 = new Account("Polymorphism2", 10000);
        Comparable c1 = new Account("Polymorphism4", 10000);
        Object o1 = new Account("Polymorphism3", 10000);




    }
}
