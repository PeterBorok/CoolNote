package com.peterborok.coolnote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class NoteController {

    static String note;
    static int editCount = 0;

    @GetMapping(value = "note")
    public String displayAddNoteForm(Model model) {
        model.addAttribute("title", editCount == 0 ? "Add Note" : "Edit Note");
        model.addAttribute("note", note);
        ++editCount;

        return "note";
    }

    @PostMapping(value = "note")
    public String processAddNoteForm(@RequestParam String newNote){
        note = newNote;

        // Redirect to "/"
        return "redirect:";
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("note", note);
        model.addAttribute("editCount", editCount);

        return "index";
    }

}
