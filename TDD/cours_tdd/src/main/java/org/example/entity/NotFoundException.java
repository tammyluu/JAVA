package org.example.entity;

public class NotFoundException extends Exception{
    public NotFoundException(String s)  {
        throw  new RuntimeException(" City Not found");
    }



}
