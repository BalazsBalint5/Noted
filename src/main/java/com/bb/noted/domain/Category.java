package com.bb.noted.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Category")
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "notes")
    private List<Note> notes;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.notes = new ArrayList<>();
    }
}
