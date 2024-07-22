package com.bb.noted.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
@Table(name = "Note")
public final class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private int noteId;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "deadline")
    private LocalDate deadline;

    @Column(name = "priority")
    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Column(name = "note_color")
    private String noteColor;

    public Note(String description, LocalDate createdAt, LocalDate deadline, Priority priority, String noteColor) {
        this.description = description;
        this.createdAt = createdAt;
        this.deadline = deadline;
        this.priority = priority;
        this.noteColor = noteColor;
    }

}
