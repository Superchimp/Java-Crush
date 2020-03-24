package com.start;

public class Shuffle1 {

    public void shuffle1method(){
        int x = 3;

        while (x > 0){
            if (x > 2){
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");

            if (x == 2){
                System.out.print("b c");
            }
            if (x == 1){
                System.out.print("d");
                x = x -1;
            }
        }
    }
}
