package com.start;

public class BeerSong {

    public void beerSong (){


        int bottleNum = 99;
        String word = "bottles";

        while (bottleNum > 0) {
            System.out.println(bottleNum + " green " + word + " standing on the wall");
            System.out.println(bottleNum + " green " + word + " standing on the wall.");
            System.out.println("And if one green bottle should accidently fall");
            bottleNum = bottleNum - 1;
            if (bottleNum == 1){
                word = "bottle";
            }

            if (bottleNum > 0) {
                System.out.println("There'll be " + bottleNum + " green " + word + " standing on the wall");
            } else{
                System.out.println("There'll be no more bottles standing on the wall.");
            }

        }

    }

}
