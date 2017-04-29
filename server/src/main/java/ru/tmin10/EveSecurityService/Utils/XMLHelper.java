package ru.tmin10.EveSecurityService.Utils;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

public class XMLHelper
{
    private final String keyID;
    private final String vCode;

    private final String BASE_URI = "https://api.eveonline.com/";
    private final String EXTENSION = ".xml.aspx?";

    public XMLHelper(String keyID, String vCode)
    {
        this.keyID=keyID;
        this.vCode=vCode;
    }

    public Document getDocument(String path)
    {
        return getDocument(path, null);
    }

    public Document getDocument(String path, String additionalParameters)
    {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        String uri = BASE_URI + path + EXTENSION+ "keyID=" + keyID + "&vCode=" + vCode;
        Document doc = null;
        if (additionalParameters != null)
        {
            uri += "&" + additionalParameters;
        }
        try
        {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(uri);
            CloseableHttpResponse response = httpclient.execute(httpGet);
            String xmlText = EntityUtils.toString(response.getEntity());
            System.out.println(xmlText);
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(new InputSource(new StringReader(xmlText)));
            doc.getDocumentElement().normalize();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e)
        {
            e.printStackTrace();
        }
        finally
        {
            return doc;
        }
    }
}
