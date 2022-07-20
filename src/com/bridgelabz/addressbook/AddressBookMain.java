package com.bridgelabz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program!");

        AddressBook addressBook=new AddressBook();
        Contact contact=new Contact();

        addressBook.addContact();
        System.out.print(addressBook.showInfo());
        System.out.println();

        addressBook.editContact();
        System.out.print(addressBook.showInfo());

        addressBook.deleteContact();
        System.out.print(addressBook.showInfo());

    }
}
