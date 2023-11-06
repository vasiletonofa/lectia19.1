package org.example.person;

import java.util.Objects;

public class Person extends Object {

    private String name;
    private int age;

    private int idnp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdnp() {
        return idnp;
    }

    public void setIdnp(int idnp) {
        this.idnp = idnp;
    }


    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return this.idnp == person.idnp;
    }

    @Override
    public int hashCode() { // grupeaza
        return Objects.hash(idnp);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idnp=" + idnp +
                '}';
    }
}
