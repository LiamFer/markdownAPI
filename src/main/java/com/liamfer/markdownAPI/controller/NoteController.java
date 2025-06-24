package com.liamfer.markdownAPI.controller;

import com.liamfer.markdownAPI.DTO.markdownGrammarDTO;
import com.liamfer.markdownAPI.domain.NoteEntity;
import com.liamfer.markdownAPI.service.GrammarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private GrammarService grammarService;

    @PostMapping()
    public ResponseEntity<?> addNote(){
        return ResponseEntity.ok("");
    }

    @PostMapping("/grammar-check")
    public ResponseEntity<String> checkGrammar(@RequestBody markdownGrammarDTO markdown){
        return ResponseEntity.ok(grammarService.check(markdown.markdown()));
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
