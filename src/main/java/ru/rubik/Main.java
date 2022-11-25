package ru.rubik;

public class Main {
    public static void main(String[] args) {
        R30 r30 = new R30();
        System.out.println("message: avalanche\nhash: " + r30.digest("avalanche"));
        System.out.println("message: avAlanche\nhash: " + r30.digest("avAlanche"));
    }
}