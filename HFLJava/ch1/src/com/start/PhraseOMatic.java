package com.start;

public class PhraseOMatic {

    public void phraseBuilder(){
        //Selection of words to use
        String[] wordListOne = {"24/7", "Multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end",
                "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned", " networked", "focused", "targeted", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
        // Obtain number of words in each array
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        // Generate random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        // Make a new Phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        // Print the random Phrase
        System.out.println("What we need is " + phrase);
        // Note that Math.random gives a random number between 0 and 1 (eg. 0.5958677)
        System.out.println((float) (Math.random()));
    }

}
