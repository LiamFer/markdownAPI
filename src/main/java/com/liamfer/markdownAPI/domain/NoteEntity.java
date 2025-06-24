package com.liamfer.markdownAPI.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "note_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public String markdown;
    public String html;

    public NoteEntity(String title, String markdown, String html) {
        this.title = title;
        this.markdown = markdown;
        this.html = html;
    }
}
