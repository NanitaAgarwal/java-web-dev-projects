package org.launchcode.hellospring.controllers;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("helloStatic")
    @ResponseBody
    public String helloStatic() {
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(@RequestParam String name) {
        return "Goodbye, "+name+"!";
    }

    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST},value="hello")
//    @GetMapping("hello")
    @ResponseBody
    public String helloWithQuery(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
        return greetMessage(name, language);
    }

    public static String greetMessage(String n,String l) {
        String greeting = "";
        if(l.equals("eng")){
            greeting = "Hello";
        } else if (l.equals("spa")) {
            greeting = "Hola";
        } else if (l.equals("hin")) {
            greeting = "Namaste";
        } else if (l.equals("tel")) {
            greeting = "Namaskaram";
        } else {
            greeting = "Bonjour";
        }
        return "<html>" +
                "<body>" +
                "<h1>"+greeting + ", " + n + "!</h1>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPath(@PathVariable String name) {
        return "Hello, " + name + "!";
//        return "redirect:/helloStatic";
    }

    @GetMapping("re-direct")
//    public String redirect() {
//        return "redirect:/helloStatic";
    public String redirect(@RequestParam String name) {
        return "redirect:/goodbye?name="+name;
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
//                "<form action='hello'>" + //submit a request to /hello - Default is "GET"
                "<form action='hello' method='POST'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language'>" +
                "<option value='eng'>English</option>" +
                "<option value='spa'>Spanish</option>" +
                "<option value='fr'>French</option>" +
                "<option value='hin'>Hindi</option>" +
                "<option value='tel'>Telugu</option>" +
                "</select>" +
                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
