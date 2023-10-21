package org.launchcode.skillstracker2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@ResponseBody
public class SkillsController2 {


    @GetMapping(value="")
    public String welcome(){
        return "<html>" +
                "<body>" +
                "<h1>Welcome</h1>" +
                "<form action='form' method='GET'>" +
                "<input type='submit' value='Form'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping(value="form")
    public String form (){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker 2</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>HTML</li>" +
                "<li>CSS</li>" +
                "</ol>" +
                "<form action='update' method='GET'>" +
                "<input type='submit' value='Update List'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping(value="update")
    public String update(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker 2</h1>" +
                "<h2>Update Favourite Programming Language List</h2>" +
                "<form action='updatedList' method='POST'>" +
                "Name: " +
                "<br><input type='text' name='name'/><br>" +
                "First Choice: " +
                "<br><select name='firstChoice'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "<option value='CSS'>CSS</option>" +
                "</select><br>" +
                "Second Choice: " +
                "<br><select name='secondChoice'>" +
                "<option value='HTML'>HTML</option>" +
                "<option value='CSS'>CSS</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "</select><br>" +
                "Third Choice: " +
                "<br><select name='thirdChoice'>" +
                "<option value='CSS'>CSS</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "</select><br>" +
                "<input type='submit' value='Update'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping(value="updatedList")
    public String updatedList(@RequestParam String name,@RequestParam String firstChoice,@RequestParam String secondChoice,@RequestParam String thirdChoice){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker 2</h1>" +
                "<h3>Updated Favourite Programming Language List For " + name + "</h2>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
