package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticController
{
    @RequestMapping(value={"/sso"})
    public String getStatic()
    {
        return "index.html";
    }
}
