package com.example.gophysigitalassigne;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "game",strict = false)
public class game
{

    public game(){

    }
    @Element(name = "ThumbURL")
    public String ThumbURL;
    @Element(name = "Title")
    public String Title;
    @Element(name = "Entwickler")
    public String Entwickler;
    @Element(name = "Platform")
    public String Platform;

    public game(String thumbURL, String title, String entwickler, String platform) {
        ThumbURL = thumbURL;
        Title = title;
        Entwickler = entwickler;
        Platform = platform;
    }

    public String getThumbURL() {
        return ThumbURL;
    }

    public void setThumbURL(String thumbURL) {
        ThumbURL = thumbURL;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getEntwickler() {
        return Entwickler;
    }

    public void setEntwickler(String entwickler) {
        Entwickler = entwickler;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }
}
