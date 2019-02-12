package com.twu.biblioteca;

public class UserProfile {
    private User user;

    public UserProfile(User user) {
        this.user = user;
    }

    public void printDetails() {
        PrintMessage.print("Hello " + user.getName());
        PrintMessage.print("------------------------------------------------");
        PrintMessage.print("Email: " + user.getEmail());
        PrintMessage.print("Phone Number: " + user.getPhoneNumber());
        Menu.launchMenu();
    }
}
