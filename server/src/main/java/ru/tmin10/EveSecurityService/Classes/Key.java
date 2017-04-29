package ru.tmin10.EveSecurityService.Classes;

import java.util.ArrayList;

public class Key
{
    private long accessMask;
    private String type;
    private String expires;
    private ArrayList<Character> characters;

    public Key(long accessMask, String type, String expires, ArrayList<Character> characters)
    {
        this.accessMask = accessMask;
        this.type = type;
        this.expires = expires;
        this.characters = characters;
    }

    public long getAccessMask()
    {
        return accessMask;
    }

    public void setAccessMask(long accessMask)
    {
        this.accessMask = accessMask;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getExpires()
    {
        return expires;
    }

    public void setExpires(String expires)
    {
        this.expires = expires;
    }

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters)
    {
        this.characters = characters;
    }
}
