package com.example.gophysigitalassigne;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

@Root(name = "iTunes",strict = false)
public class iTunes {
    public ArrayList<com.example.gophysigitalassigne.itune> getItune() {
        return itune;
    }

    public void setItune(ArrayList<com.example.gophysigitalassigne.itune> itune) {
        this.itune = itune;
    }

    @ElementList( name = "itune",inline = true,required = false)
    public ArrayList<itune> itune;
}
