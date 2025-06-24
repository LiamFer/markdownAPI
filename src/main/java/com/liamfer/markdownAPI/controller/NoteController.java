package com.liamfer.markdownAPI.controller;

import com.liamfer.markdownAPI.domain.NoteEntity;
import com.liamfer.markdownAPI.service.NoteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping()
    public ResponseEntity<NoteEntity> addNote(@RequestParam("title") @Valid String title,@RequestParam("markdown") @Valid MultipartFile file){
        return ResponseEntity.status(HttpStatus.CREATED).body(noteService.saveNote(title,file));
    }

    @PostMapping("/grammar-check")
    public ResponseEntity<String> checkGrammar(@RequestParam("markdown") @Valid MultipartFile file){
        return ResponseEntity.ok(noteService.checkGrammar(file));
    }

    @GetMapping
    public ResponseEntity<?> getNotes(){
        return ResponseEntity.ok("");
    }

    @GetMapping("/{id}/rendered")
    public ResponseEntity<?> getRenderedNote(@PathVariable("id") Long id){
        return ResponseEntity.ok("");
    }


}
