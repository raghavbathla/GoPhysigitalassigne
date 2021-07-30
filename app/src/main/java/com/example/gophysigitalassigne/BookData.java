package com.example.gophysigitalassigne;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

@Root(name = "BookData",strict = false)
public class BookData {

    @ElementList( name = "book",inline = true,required = false)
    public ArrayList<book> book;

    public ArrayList<book> getBooks() {
        return book;
    }

    public void setBooks(ArrayList<book> books) {
        this.book = books;
    }





}
