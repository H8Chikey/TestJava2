package ru.sapteh;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws Exception {
        var buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя:");
        String name = buf.readLine();
        System.out.println("Введите возраст:");
        int age = Integer.parseInt(buf.readLine());
        System.out.println("Введите дату:");
        int date = Integer.parseInt(buf.readLine());

        Person person = new Person(name,age,date);

        System.out.println(personIsEmpty(person));

    }
    public static String personIsEmpty(Person p){
        String err = "";
        if (p.getName().isEmpty()) err += "Имя не заполнено\n";{
            if (p.getAge() == 0) err += "Возвраст не заполнен\n";{
                if (p.getDate() == 0) err +="Дата не заполнена"; {
            if (!err.isEmpty()) return err;

            return  "Объект" + p.getClass() +
                    "Иницилизирован\n" + p.toString();
        }
    }
        }
    }
}