package com.company;

public class Main {

    public static void main(String[] args) {
        Twitter_Api twitter = new Twitter_Api();

        twitter.SearchTweet("epitech");
        twitter.PostingToTwitter("Yolo tweet test");
    }
}
