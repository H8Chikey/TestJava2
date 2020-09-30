package ru.sapteh;


import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException{


        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int  age = scanner.nextInt();
        System.out.println("Введите дтау рождения: ");
        int date = scanner.nextInt();
        Person person = new Person(name,age, date );

        File listD = new File("C:/java_42/1/o");
        listD.mkdir();
        File list = new File("C:/java_42/1/o/"+person.getName()+".txt");
        FileWriter writer = new FileWriter(list);
        writer.write(person.toString());
        writer.close();
    }

    public static String personIsEmpty(Person p){
        String err = "";
        if(p.getName().isEmpty()) err += "NoName";
        if(p.getAge() ==0) err += "NoAge";
        if(p.getDate() ==0) err += "NoDate";
        if(err.isEmpty()) return err;
        return "объект" + p.getClass() + "инициализирован\n" + p.toString();


    }
}