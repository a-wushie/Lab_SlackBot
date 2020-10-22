package com.floreo.bbah;

import com.floreo.bbah.model.Channel;
import com.floreo.bbah.model.Message;
import com.floreo.bbah.network.Slack;
import com.floreo.bbah.network.responses.*;

import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Bot {

    // TODO: implement your bot logic!

    public Bot() {
            String[] nbaFacts = new String[]{"Stephen Curry is the first unanimous mvp", "Shaquille O’Neal made only one three-point shot ever", "Air Jordans were once banned from the NBA", "Kobe Bryant’s first NBA contract was co-signed by his parents", "The shortest player and the tallest player in NBA history played once for the same team", "LeBron James eats and writes with his left hand", "60% of NBA players become broke after 5 years of retirement", "There has never been a quintuple-double in NBA", "Shaq challenged Hakeem to a one-on-one", "The shortest player in NBA history blocked 39 shots", "Paul Pierce was stabbed 11 times and still played every game in the 2000-01 season"};
            int minutes = 1;
            Random random = new Random();
            Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run() {
                    int randomNumber=random.nextInt(nbaFacts.length);
                    System.out.print(nbaFacts[randomNumber]+"\n");
                }
            }, 0, 1000 * 60 * minutes);

    }

    public String nbaFacts(){

        String[] nbaFacts = new String[]{
                "Stephen Curry is the first unanimous mvp",
                "Shaquille O'Neal made only one three-point shot ever",
                "Air Jordans were once banned from the NBA",
                "Kobe Bryant's first NBA contract was co-signed by his parents",
                "The shortest player and the tallest player in NBA history played once for the same team",
                "LeBron James eats and writes with his left hand",
                "60% of NBA players become broke after 5 years of retirement",
                "There has never been a quintuple-double in NBA",
                "Shaq challenged Hakeem to a one-on-one",
                "The shortest player in NBA history blocked 39 shots",
                "Paul Pierce was stabbed 11 times and still played every game in the 2000-01 season"};

        Random r = new Random();
        int randomNumber=r.nextInt(nbaFacts.length);
        Slack.sendMessage(nbaFacts[randomNumber]);

        return nbaFacts[randomNumber];

    }



    /**
     * Sample method: tests the Slack API. Prints a message indicating success or failure.
     */
    public void testApi() {
        Response apiTest = Slack.testApi();
        System.out.println("API OK: " +apiTest.isOk() + "\n");
    }

    /**
     * Sample method: prints all public AccessCode3-3 channel names and ids. Prints an error message on failure.
     */
    public void listChannels() {
        ListChannelsResponse listChannelsResponse = Slack.listChannels();

        if (listChannelsResponse.isOk()) {
            List<Channel> channels = listChannelsResponse.getChannels();

            System.out.println("\nChannels: ");
            for (Channel channel : channels) {
                System.out.println("name: " + channel.getName() + ", id:" + channel.getId());
            }
        } else {
            System.err.print("Error listing channels: " + listChannelsResponse.getError());
        }
    }

    /**
     * Sample method: prints up to the last 100 messages from a given channel. Prints an error message on failure.
     * or failure.
     *
     * @param channelId id of the given channel.
     */
    public void listMessages(String channelId) {
        ListMessagesResponse listMessagesResponse = Slack.listMessages(channelId);

        if (listMessagesResponse.isOk()) {
            List<Message> messages = listMessagesResponse.getMessages();

            System.out.println("\nMessages: ");
            for (Message message : messages) {
                System.out.println();
                System.out.println("Timestamp: " + message.getTs());
                System.out.println("Message: " + message.getText());
            }
        } else {
            System.err.print("Error listing messages: " + listMessagesResponse.getError());
        }
    }

    /**
     * Sample method: sends a plain text message to the #bots channel. Prints a message indicating success or failure.
     *
     * @param text message text.
     */
    public void sendMessageToBotsChannel(String text) {
        SendMessageResponse sendMessageResponse = Slack.sendMessage(text);

        if (sendMessageResponse.isOk()) {
            System.out.println("Message sent successfully!");
        } else {
            System.err.print("Error sending message: " + sendMessageResponse.getError());
        }
    }

    /**
     * Sample method: deletes a message from the #bots channel. Prints a message indicating success or failure.
     *
     * @param messageTs unique timestamp of the message to be deleted.
     */
    public void deleteMessageInBotsChannel(String messageTs) {
        DeleteMessageResponse deleteMessageResponse = Slack.deleteMessage(messageTs);

        if (deleteMessageResponse.isOk()) {
            System.out.println("Message deleted successfully!");
        } else {
            System.err.print("Error sending message: " + deleteMessageResponse.getError());
        }
    }

}
