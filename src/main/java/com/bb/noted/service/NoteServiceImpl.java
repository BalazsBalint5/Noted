package com.bb.noted.service;

import com.bb.noted.domain.Note;
import com.bb.noted.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class NoteServiceImpl implements NoteService{

    private final NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note getById(Integer id) {
        return this.noteRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Note> getAll() {
        return this.noteRepository.findAll();
    }

    @Override
    public Note addNote(Note note) {
        return this.noteRepository.save(note);
    }

    @Override
    public void deleteNote(Note note) {
        this.noteRepository.delete(note);
    }

    @Override
    public void deleteNoteById(Integer id) {
        this.noteRepository.deleteById(id);
    }
}
