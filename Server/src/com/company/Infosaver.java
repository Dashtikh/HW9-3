package com.company;

import Remote.SiteInterface;

import java.rmi.server.UnicastRemoteObject;

public class Infosaver extends UnicastRemoteObject implements SiteInterface {
    public Infosaver() throws Exception {
    }

    @Override
    public String choose(int menu) throws Exception {
        if (menu == 1) {
            return "shoma pizza khaste id v pardakht shod";

        } else if (menu == 2) {
            return "shoma pizza khaste id v pardakht shod";

        } else if (menu == 3) {
            return "shoma pizza khaste id v pardakht shod";

        } else return null;
    }
}
