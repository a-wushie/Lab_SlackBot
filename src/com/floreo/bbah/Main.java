package com.floreo.bbah;

import com.floreo.bbah.network.Slack;

import java.util.Timer;

public class Main {


    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

         //Post "Hello, world!" to the #bots channel
        myBot.sendMessageToBotsChannel("Hello, world!");

         //Post a pineapple photo to the #bots channel
        myBot.sendMessageToBotsChannel("https://www.gannett-cdn.com/-mm-/5af65baa0a70a9741f6b872381028b5d0651db74/c=0-71-3164-1859/local/-/media/2016/05/10/USATODAY/USATODAY/635985036876795120-USATSI-9289181.jpg?width=3164&height=1788&fit=crop&format=pjpg&auto=webp");

        //myBot.sendMessageToBotsChannel(nbaFacts);

        myBot.nbaFacts();

    }
}
