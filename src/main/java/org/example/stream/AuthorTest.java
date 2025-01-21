package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorTest {
// get any 15 authors with unique surname in uppercase
// and age above 50(Provided Author class with some fields)
  public static void main(String[] args) {
    List<Author> authorList = Arrays.asList(
        new Author("John", "Doe", 45),
        new Author("Jane", "Smith", 55),
        new Author("Bob", "Johnson", 60),
        new Author("Alice", "Jones", 50),
        new Author("Eve", "Smith", 65),
        new Author("Charlie", "Brown", 40)
    );

    List<Author> collect = authorList.stream()
        .filter(author -> author.getAge() > 50)
        .map(author -> new Author(author.getName(), author.getSurName().toUpperCase(),
            author.getAge()))
        .distinct()
        .limit(15)
        .collect(Collectors.toList());
    System.out.println(collect);
  }
}
