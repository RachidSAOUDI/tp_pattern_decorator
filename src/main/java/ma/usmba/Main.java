package ma.usmba;

import ma.usmba.composants.Boisson;
import ma.usmba.composants.Sumatra;
import ma.usmba.decorateurs.Caramel;
import ma.usmba.decorateurs.Chocolat;
import ma.usmba.decorateurs.Noisette;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------");
        boisson=new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------");
        boisson=new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------");
        boisson=new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------");
        boisson=new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
