package ru.tmin10.EveSecurityService.Utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.tmin10.EveSecurityService.Classes.Key;
import ru.tmin10.EveSecurityService.Classes.Character;

import java.util.ArrayList;

public class EveApiRequest
{
    private XMLHelper xmlHelper;

    public EveApiRequest(String keyID, String vCode)
    {
        this.xmlHelper = new XMLHelper(keyID, vCode);
    }

    public Account account()
    {
        return new Account();
    }

    public class Account
    {
        private final String TYPE = "account/";

        public Key APIKeyInfo()
        {
            Document doc = xmlHelper.getDocument(TYPE + "APIKeyInfo");
            Node keyNode = doc.getElementsByTagName("key").item(0);
            Element keyElement = (Element) keyNode;
            ArrayList<Character> characters = new ArrayList<Character>();
            NodeList charactersList = doc.getElementsByTagName("row");
            for (int n = 0; n < charactersList.getLength(); n++)
            {
                Node characterNode = charactersList.item(n);
                if (characterNode.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element chracterElement = (Element) characterNode;
                    Character character = new Character(
                            chracterElement.getAttribute("characterName"),
                            Long.parseLong(chracterElement.getAttribute("characterID")),
                            chracterElement.getAttribute("corporationName"),
                            Long.parseLong(chracterElement.getAttribute("corporationID")),
                            chracterElement.getAttribute("allianceName"),
                            Long.parseLong(chracterElement.getAttribute("allianceID"))
                    );
                    characters.add(character);
                }
            }
            Key key = new Key(
                    Long.parseLong(keyElement.getAttribute("accessMask")),
                    keyElement.getAttribute("type"),
                    keyElement.getAttribute("expires"),
                    characters
            );
            return key;
        }
    }
}
