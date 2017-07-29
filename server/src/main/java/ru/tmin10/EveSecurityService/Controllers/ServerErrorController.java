package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ServerErrorController implements ErrorController
{
    @RequestMapping("/error")
    public String error(HttpServletRequest request)
    {
        return "Error handling";
    }

    @Override
    public String getErrorPath()
    {
        return "/error";
    }
}
