package org.example;

public class App {

    public static void main(String[] args) {

        AppInfo info = new AppInfo();

        System.out.println("====================================");
        System.out.println("   CODEALPHA STUDENT MANAGEMENT");
        System.out.println("====================================");

        System.out.println("Application: " + info.getApplicationName());
        System.out.println("Technology: " + info.getTechnology());
        System.out.println("Build Tool: " + info.getBuildTool());
        System.out.println("Status: " + info.getStatus());

        System.out.println("------------------------------------");
        System.out.println("Welcome to the Student Management System!");
        System.out.println("====================================");
    }
}