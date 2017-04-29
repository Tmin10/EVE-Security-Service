package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tmin10.EveSecurityService.Classes.Key;
import ru.tmin10.EveSecurityService.Utils.EveApiRequest;

@RestController
public class KeyInfoController
{
    @RequestMapping("/keyInfo")
    @CrossOrigin    //TODO for development run only
    public Key characters(@RequestParam(value="keyID") String keyID,
                          @RequestParam(value="vCode") String vCode)
    {
        EveApiRequest api = new EveApiRequest(keyID, vCode);
        return api.account().APIKeyInfo();
    }
}
