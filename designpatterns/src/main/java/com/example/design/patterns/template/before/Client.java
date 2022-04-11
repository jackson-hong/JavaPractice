package com.example.design.patterns.template.before;

public class Client {
    public static void main(String[] args) {
        com.example.design.patterns.template.before.FileProcessor fileProcessor = new com.example.design.patterns.template.before.FileProcessor("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);
    }
}
