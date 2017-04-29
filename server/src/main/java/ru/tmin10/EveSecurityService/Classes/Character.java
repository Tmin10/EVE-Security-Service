package ru.tmin10.EveSecurityService.Classes;

public class Character
{
    private String characterName;
    private long characterID;
    private String corporationName;
    private long corporationID;
    private String allianceName;
    private long allianceID;

    public Character(String characterName, long characterID, String corporationName, long corporationID, String allianceName, long allianceID)
    {
        this.characterName = characterName;
        this.characterID = characterID;
        this.corporationName = corporationName;
        this.corporationID = corporationID;
        this.allianceName = allianceName;
        this.allianceID = allianceID;
    }

    public String getCharacterName()
    {
        return characterName;
    }

    public void setCharacterName(String characterName)
    {
        this.characterName = characterName;
    }

    public long getCharacterID()
    {
        return characterID;
    }

    public void setCharacterID(long characterID)
    {
        this.characterID = characterID;
    }

    public String getCorporationName()
    {
        return corporationName;
    }

    public void setCorporationName(String corporationName)
    {
        this.corporationName = corporationName;
    }

    public long getCorporationID()
    {
        return corporationID;
    }

    public void setCorporationID(long corporationID)
    {
        this.corporationID = corporationID;
    }

    public String getAllianceName()
    {
        return allianceName;
    }

    public void setAllianceName(String allianceName)
    {
        this.allianceName = allianceName;
    }

    public long getAllianceID()
    {
        return allianceID;
    }

    public void setAllianceID(long allianceID)
    {
        this.allianceID = allianceID;
    }
}
