package com.bb.noted.controllers;

import com.bb.noted.domain.Note;
import com.bb.noted.service.NoteService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Note> getAllNote() {
        return this.noteService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Note addNote(
            @RequestBody Note newNote) {
        return this.noteService.addNote(newNote);
    }
}
