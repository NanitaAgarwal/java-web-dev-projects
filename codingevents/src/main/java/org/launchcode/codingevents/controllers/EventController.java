package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value="events")
//@RequestMapping(value="events",method = {RequestMethod.GET})
public class EventController {

//    private static List<String> events = new ArrayList<>();
    private static HashMap<String,String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("events",events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, String eventDescription){
        events.put(eventName,eventDescription);
        return "redirect:/events";
    }
}
