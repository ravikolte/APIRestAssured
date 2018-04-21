package com.RestAssuredFramework;

public class MethodChaining {

public static void main(String[] args) {

    ExampleJavaArray mExampleJavaArray = new ExampleJavaArray();

    mExampleJavaArray.setName("chandru").getAge().displayValue();
    ExampleJavaArray b = new ExampleJavaArray();
    
    b.setName("Ravi").getAge().displayValue();
    b.setName("Sim").setAge(27).displayValue();
}

}