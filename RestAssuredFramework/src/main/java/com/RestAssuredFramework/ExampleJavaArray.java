package com.RestAssuredFramework;

public class ExampleJavaArray {

int age;
String name;

public ExampleJavaArray getAge() {
    this.age = 25;
    return this;
}

public ExampleJavaArray setName(String name) {
    this.name = name;
    return this;
}

public ExampleJavaArray setAge(int age1) {
    this.age = age1;
    return this;
}

public void displayValue() {
    System.out.println("Name:" + name + "\n\n" + "Age:" + age);
}


}