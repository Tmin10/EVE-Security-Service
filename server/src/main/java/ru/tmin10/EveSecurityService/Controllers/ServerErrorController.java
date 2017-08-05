package ru.tmin10.EveSecurityService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import java.util.Map;

@RestController
public class ServerErrorController implements ErrorController
{
    private static final String PATH = "/error";

    @Autowired
    private ErrorAttributes errorAttributes;

    @RequestMapping(PATH)
    @NotNull
    ErrorJson error(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response)
    {
        return new ErrorJson(response.getStatus(), getErrorAttributes(request));
    }

    @Override
    public String getErrorPath()
    {
        return PATH;
    }

    @NotNull
    private Map<String, Object> getErrorAttributes(HttpServletRequest request)
    {
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        return errorAttributes.getErrorAttributes(requestAttributes, true);
    }

    public class ErrorJson
    {
        public final String type = "error";
        public Integer status;
        public String error;
        public String message;
        public String timeStamp;
        public String trace;

        public ErrorJson(int status, @NotNull Map<String, Object> errorAttributes)
        {
            this.status = status;
            this.error = (String) errorAttributes.get("error");
            this.message = (String) errorAttributes.get("message");
            this.timeStamp = errorAttributes.get("timestamp").toString();
            this.trace = (String) errorAttributes.get("trace");
        }

    }
}
