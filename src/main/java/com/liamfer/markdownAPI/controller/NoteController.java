package com.liamfer.markdownAPI.controller;

import com.liamfer.markdownAPI.domain.NoteEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @PostMapping()
    public ResponseEntity<?> addNote(){
        return ResponseEntity.ok("");
    }

    @PostMapping("/grammar-check")
    public ResponseEntity<?> checkGrammar(){
        return ResponseEntity.ok("");
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
