package com.cybernetic;

public class Main {
    public static void main(String[] args) {
        System.out.println("IDK");
    }

    public int binToInt(String binarynum){
        return Integer.parseInt(binarynum,2);
    }

    public String intToHex(int num){
        return Integer.toHexString(num).toUpperCase();
    }
}