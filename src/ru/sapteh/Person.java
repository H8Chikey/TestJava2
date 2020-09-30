package ru.sapteh;

public class Person {

    private String name = "ivan" ;
    private int age = 20 ;
    private int date = 2000;


        public  Person (String name, int age, int date){
            this .name = name;
            this .age = age;
            this .date = date;
        }
        public  Person (String name, int age){
            this .name = name;
            this .age = age;
        }
         public Person (String name) {
             this.name = name;
         }

         public String getName(){
        return name;
         }
         public int getAge (){
        return age;
         }
        public int getDate (){
        return date;
         }

    @Override
        public String toString() {
             return "Name: " + getName() +"\n" +
                    "Age: " + getAge() + "\n" +
                    "Date: " + getDate() ;
        }
}




