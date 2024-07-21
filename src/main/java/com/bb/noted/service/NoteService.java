package com.bb.noted.service;

import com.bb.noted.domain.Note;

import java.util.List;

public interface NoteService {

    Note getById(Integer id);
    List<Note> getAll();
    void addNote(Note note);
    void deleteNote(Note note);
    void deleteNoteById(Integer id);
}
