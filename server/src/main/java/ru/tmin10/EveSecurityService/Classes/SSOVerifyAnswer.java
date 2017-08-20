package ru.tmin10.EveSecurityService.Classes;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;

public class SSOVerifyAnswer
{
    @SerializedName("CharacterID")
    private String characterID;
    @SerializedName("CharacterName")
    private String characterName;
    @SerializedName("ExpiresOn")
    private String expiresOn;
    @SerializedName("Scopes")
    private String scopes;
    @SerializedName("TokenType")
    private String tokenType;
    @SerializedName("CharacterOwnerHash")
    private String characterOwnerHash;

    public SSOVerifyAnswer(
            @Nonnull String characterID,
            @Nonnull String characterName,
            @Nonnull String expiresOn,
            @Nonnull String scopes,
            @Nonnull String tokenType,
            @Nonnull String characterOwnerHash)
    {
        this.characterID = characterID;
        this.characterName = characterName;
        this.expiresOn = expiresOn;
        this.scopes = scopes;
        this.tokenType = tokenType;
        this.characterOwnerHash = characterOwnerHash;
    }

    @Nonnull
    public String getCharacterID()
    {
        return characterID;
    }

    @Nonnull
    public String getCharacterName()
    {
        return characterName;
    }

    @Nonnull
    public String getExpiresOn()
    {
        return expiresOn;
    }

    @Nonnull
    public String getScopes()
    {
        return scopes;
    }

    @Nonnull
    public String getTokenType()
    {
        return tokenType;
    }

    @Nonnull
    public String getCharacterOwnerHash()
    {
        return characterOwnerHash;
    }

    @Override
    public String toString()
    {
        return "SSOVerifyAnswer{" +
                "characterID='" + characterID + '\'' +
                ", characterName='" + characterName + '\'' +
                ", expiresOn='" + expiresOn + '\'' +
                ", scopes='" + scopes + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", characterOwnerHash='" + characterOwnerHash + '\'' +
                '}';
    }
}
