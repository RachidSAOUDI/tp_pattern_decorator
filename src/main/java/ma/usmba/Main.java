package ma.usmba;

import ma.usmba.composants.Boisson;
import ma.usmba.composants.Espresso;
import ma.usmba.composants.Sumatra;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson=new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
