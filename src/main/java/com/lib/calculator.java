package com.lib;

/**
 * Created by sergey on 10.02.14.
 */
public class Calculator {
    private String name;


    public void setName(String name){

        this.name = name;
    }

    // Use gitName class.
    public String getName(){
        return name;
    }

    public int getSum(int x, int y){
        return x+y;
    }

}

