package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {

    // TODO: implement private fields for each of the following attachment JSON keys:
    private String fallback;
    private String color;
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;
    private String fields;
    private String image_url;
    private String thumb_url;
    private String footer;
    private String footer_icon;
    private String ts;



    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json
        if(fallback != null){
            this.fallback = fallback;
        }
        if(color != null){
            this.color = color;
        }
        if(pretext != null){
            this.pretext = pretext;
        }
        if(author_name != null) {
            this.author_name = author_name;
        }
        if(author_link != null) {
            this.author_link = author_link;
        }
        if(author_icon != null) {
            this.author_icon = author_icon;
        }
        if(title != null) {
            this.title = title;
        }
        if(title_link != null) {
            this.title_link = title_link;
        }
        if(text != null) {
            this.text = text;
        }
        if(fields != null) {
            this.fields = fields;
        }
        if(image_url != null) {
            this.image_url = image_url;
        }
        if(thumb_url != null) {
            this.thumb_url = thumb_url;
        }
        if(footer != null) {
            this.footer = footer;
        }
        if(footer_icon != null) {
            this.footer_icon = footer_icon;
        }
        if(ts != null) {
            this.ts = ts;
        }
       
    }

    // TODO add getters to access private fields
    public String getFallback() {
        return fallback;
    }
    public String getColor() {
        return color;
    }
    public String getPretext() {
        return pretext;
    }
    public String getAuthor_name() {
        return author_name;
    }
    public String getAuthor_link() {
        return author_link;
    }
    public String getAuthor_icon() {
        return author_icon;
    }
    public String getTitle() {
        return title;
    }
    public String getTitle_link() { return title_link; }
    public String getText() {
        return text;
    }
    public String getFields() {
        return fields;
    }
    public String getImage_url() {
        return image_url;
    }
    public String getThumb_url() {
        return thumb_url;
    }
    public String getFooter() {
        return footer;
    }
    public String getFooter_icon() {
        return footer_icon;
    }
    public String getTs() {
        return ts;
    }

}
