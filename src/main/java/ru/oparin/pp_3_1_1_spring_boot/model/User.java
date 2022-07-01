package ru.oparin.pp_3_1_1_spring_boot.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }

    public User() {

    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getLastName() {

        return lastName;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {
        return id +
                ", " + name +
                ", " + lastName +
                ", " + age;
    }
}
