package com.example.gophysigitalassigne;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "itune",strict = false)
public class itune
{
    public  itune()
    {

    }


    @Element(name = "Artist")
    public String Artist;
    @Element(name = "Title")
    public String Title;
    @Element(name = "ThumbURL")
    public String ThumbURL;
    @Element(name = "Cover")
    public String Cover;

    public itune(String artist, String title, String thumbURL, String cover) {
        Artist = artist;
        Title = title;
        ThumbURL = thumbURL;
        Cover = cover;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getThumbURL() {
        return ThumbURL;
    }

    public void setThumbURL(String thumbURL) {
        ThumbURL = thumbURL;
    }

    public String getCover() {
        return Cover;
    }

    public void setCover(String cover) {
        Cover = cover;
    }
}
