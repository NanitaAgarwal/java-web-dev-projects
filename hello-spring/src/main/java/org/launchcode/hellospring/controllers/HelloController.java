package org.launchcode.hellospring.controllers;

//import ch.qos.logback.core.model.Model;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST},value="hello2")
//    @GetMapping("hello2")
    @ResponseBody
    public String helloWithQuery(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
        return greetMessage(name, language);
    }

    public static String greetMessage(String n,String l) {
        String greeting = "";
        if(l.equals("fr")){
            greeting = "Bonjour";
        } else if (l.equals("spa")) {
            greeting = "Hola";
        } else if (l.equals("hin")) {
            greeting = "Namaste";
        } else if (l.equals("tel")) {
            greeting = "Namaskaram";
        } else {
            greeting = "Hello";
        }
        return "<html>" +
                "<body>" +
                "<h1 style='color:blue;'>"+greeting + ", " + n + "!</h1>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloWithPath(@PathVariable String name) {
//        return "Hello, " + name + "!";
    public String helloWithPath(@PathVariable String name,Model model) {
        model.addAttribute("greeting","Hello, " + name + "!");
        return "hello";
    }

    @GetMapping("re-direct")
//    public String redirect() {
//        return "redirect:/helloStatic";
    public String redirect(@RequestParam String name) {
        return "redirect:/goodbye?name="+name;
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @RequestMapping (value="hello",method={RequestMethod.GET,RequestMethod.POST})
//    @ResponseBody
//    public String hello(@RequestParam String name) {
//        return "Hello, " + name + "!";
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, "+name+"!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }

    @RequestMapping (value="hello-list",method={RequestMethod.GET,RequestMethod.POST})
    public String helloList(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names",names);
        return "hello-list";
    }

    @RequestMapping (value="hello-num",method={RequestMethod.GET,RequestMethod.POST})
    public String helloNum(Model model) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(0);
        numbers.add(1);
        model.addAttribute("numbers",numbers);
        return "hello-num";
//        List<Integer> numbers2 = new ArrayList<>();
//        model.addAttribute("numbers",numbers2);
//        return "hello-num";
    }
}
