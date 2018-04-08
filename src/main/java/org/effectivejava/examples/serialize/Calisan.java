package org.effectivejava.examples.serialize;


public class Calisan  {

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String gender;

    Calisan() {
    };

    Calisan(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
    }
}
