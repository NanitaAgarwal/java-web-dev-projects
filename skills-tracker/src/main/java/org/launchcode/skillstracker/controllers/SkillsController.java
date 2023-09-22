package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@ResponseBody

public class SkillsController {
    @GetMapping("/")
    public String skillsTracker(){
        return
                "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>" +
                            "<ol>" +
                                "<li>JavaScript</li>" +
                                "<li>Java</li>" +
                                "<li>SQL</li>" +
                            "</ol>" +
                        "</h2>" +
                    "</body>" +
                "</html>";

    }

    @GetMapping("/form")
    public String skillsForm(){
        return
            "<html>" +
                "<body>" +
                    "<form action='/answer' method='POST'>" +
                        "<label for='name'>Name:</label><br>" +
                        "<input type='text' id='name' name='name'><br>" +
                        "<label for='firstfav'>My favourite language:</label><br>" +
                        "<select name='firstfav' id='firstfav'>" +
                            "<option value='javascript'>JavaScript</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='sql'>SQL</option>" +
                        "</select><br>" +
                        "<label for='secondfav'>My second favourite language:</label><br>" +
                        "<select name='secondfav' id='secondfav'>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>JavaScript</option>" +
                            "<option value='sql'>SQL</option>" +
                        "</select><br>" +
                        "<label for='thirdfav'>My third favourite language:</label><br>" +
                        "<select name='thirdfav' id='thirdfav'>" +
                            "<option value='sql'>SQL</option>" +
                            "<option value='java'>Java</option>" +
                            "<option value='javascript'>JavaScript</option>" +
                        "</select><br>" +
                        "<button type='submit'>Submit</button>" +
                    "</form>" +
                "</body>" +
            "</html>";
    }

    @PostMapping("/answer")
    public String userSelectedValues(@RequestParam String name, String firstfav, String secondfav, String thirdfav){
        return
            "<html>" +
                "<body>" +
                    "<h1>" + name + "</h1>" +
                    "<h2>" +
                        "<ol>" +
                            "<li>" + firstfav + "</li>" +
                            "<li>" + secondfav + "</li>" +
                            "<li>" + thirdfav + "</li>" +
                        "</ol>" +
                    "</h2>" +
                    "<table>" +
                        "<tr>" +
                            "<th>First Favourite</th>" +
                            "<th>Second Favourite</th>" +
                            "<th>Third Favourite</th>" +
                        "</tr>" +
                        "<tr>" +
                            "<td>" + firstfav + "</td>" +
                            "<td>" + secondfav + "</td>" +
                            "<td>" + thirdfav + "</td>" +
                        "</tr>" +
                    "</table>" +
                "</body>" +
            "</html>";
    }

//    @PostMapping("/answer")
//    public String userSelectedValues(@RequestParam String name, String firstfav, String secondfav, String thirdfav){
//        return
//            "<html>" +
//                "<body>" +
//                    "<form action='/table' method='POST'>" +
//                    "<h1 name='name' id='name'>" + name + "</h1>" +
//                    "<h2>" +
//                        "<ol>" +
//                            "<li name='firstfav' id='firstfav'>" + firstfav + "</li>" +
//                            "<li name='secondfav' id='secondfav'>" + secondfav + "</li>" +
//                            "<li name='thirdfav' id='thirdfav'>" + thirdfav + "</li>" +
//                        "</ol>" +
//                    "</h2>" +
//                    "<button type='submit'>Table</button>" +
//                    "</form>" +
//                "</body>" +
//            "</html>";
//    }
//
//    @PostMapping("/table")
//    public String tableDisplay(@RequestParam String name, String firstfav, String secondfav, String thirdfav){
//        return
//                "<html>" +
//                    "<body>" +
//                        "<h1>" + name + "</h1>" +
//                        "<table>" +
//                            "<tr>" +
//                                "<th>First Favourite</th>" +
//                                "<th>Second Favourite</th>" +
//                                "<th>Third Favourite</th>" +
//                            "</tr>" +
//                            "<tr>" +
//                                "<td>" + firstfav + "</td>" +
//                                "<td>" + secondfav + "</td>" +
//                                "<td>" + thirdfav + "</td>" +
//                            "</tr>" +
//                        "</table>" +
//                    "</body>" +
//                "</html>";
//    }
}
