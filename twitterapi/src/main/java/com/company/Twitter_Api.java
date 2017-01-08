package com.company;

import twitter4j.*;

import java.io.IOException;

public class Twitter_Api {

    public void PostingToTwitter(String message) {
        Twitter twitter = TwitterFactory.getSingleton();

        try {
            Status status = twitter.updateStatus(message);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

    public void SearchTweet(String search) {
        Twitter twitter = TwitterFactory.getSingleton();

        Query query = new Query(search);
        try {
            QueryResult result = twitter.search(query);
            for (Status status : result.getTweets()) {
                System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            }
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }
}
