package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="events")
//@RequestMapping(value="events",method = {RequestMethod.GET})
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Independence Day Event");
        events.add("Ganesh Festival");
        events.add("Navrathri Dandiya");
        events.add("Easter Egg Hunt");
        events.add("Thanks Giving Dinner");
        events.add("Christmas Secret Santa");
        events.add("New Years Eve Party");
        model.addAttribute("events",events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

}
