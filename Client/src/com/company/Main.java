package com.company;

import Remote.SiteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        SiteInterface siteInterface = (SiteInterface) Naming.lookup("//192.168.1.104/site");
        int menu;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("choose food: 1-pizza 2-burger 3-fries");
            menu=scanner.nextInt();
            try {
                System.out.println(siteInterface.choose(menu));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
