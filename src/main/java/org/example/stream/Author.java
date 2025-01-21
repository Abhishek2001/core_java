package org.example.stream;

import java.util.Objects;

public class Author {
   private String name;
   private String surName;
   private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return age == author.age && Objects.equals(name, author.name) &&
        Objects.equals(surName, author.surName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surName, age);
  }

  public Author(String name, String surName, int age) {
    this.name = name;
    this.surName = surName;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Author{" +
        "name='" + name + '\'' +
        ", surName='" + surName + '\'' +
        ", age=" + age +
        '}';
  }
}
