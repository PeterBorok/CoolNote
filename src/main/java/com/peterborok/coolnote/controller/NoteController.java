package com.peterborok.coolnote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class NoteController {

    @GetMapping(value = "note")
    public String displayAddNoteForm() {
        return "note";
    }

    @PostMapping(value = "note")
    public String processAddNoteForm(@RequestParam String newNote){
        return "note";
    }

}
