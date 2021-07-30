package com.example.gophysigitalassigne;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;



@Root(name = "book",strict = false)
class book
{
    public String getThumbURL() {
        return ThumbURL;
    }

    public void setThumbURL(String thumbURL) {
        ThumbURL = thumbURL;
    }

    public book(String autorLName1, String type, String thumbURL, String title, String autorFName1, String uniqueID) {
        AutorLName1 = autorLName1;
        Type = type;
        ThumbURL = thumbURL;
        Title = title;
        AutorFName1 = autorFName1;
        this.uniqueID = uniqueID;
    }

    @Element(name = "AutorLName1")
public String AutorLName1;

    public String getAutorLName1() {
        return AutorLName1;
    }

    public void setAutorLName1(String autorLName1) {
        AutorLName1 = autorLName1;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Element(name = "Type")
    public String Type;
    @Element(name = "ThumbURL")
public String ThumbURL;
    @Element(name = "Title")
    public String Title;

    public String getUniqueID() {
        return uniqueID;
    }
  public   book(){

    }

    public String getAutorFName1() {
        return AutorFName1;
    }

    public void setAutorFName1(String autorFName1) {
        AutorFName1 = autorFName1;
    }

    @Element(name = "AutorFName1")
    public String AutorFName1;

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    @Element(name = "uniqueID")
public String uniqueID;
    public book (String title) {

        Title = title;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

}
