package com.anand.springboot.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {


    @RequestMapping(value = "/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<title>It's the title of page</title>");
        stringBuffer.append("</head>");
        stringBuffer.append("<body>");
        stringBuffer.append("<p> Just Text in the Body </p>");
        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        return stringBuffer.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }




}
