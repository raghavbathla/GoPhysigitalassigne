package com.example.gophysigitalassigne;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

@Root(name = "GamesData",strict = false)
public class GamesData
{
    public ArrayList<com.example.gophysigitalassigne.game> getGame() {
        return game;
    }

    public void setGame(ArrayList<com.example.gophysigitalassigne.game> game) {
        this.game = game;
    }

    @ElementList( name = "game",inline = true,required = false)
    public ArrayList<game> game;

}
