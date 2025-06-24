package com.liamfer.markdownAPI.service;

import com.liamfer.markdownAPI.domain.NoteEntity;
import com.liamfer.markdownAPI.repository.NoteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;

@Service
public class NoteService {
    private final NoteRepository noteRepository;
    private final GrammarService grammarService;
    private final FlexmarkService flexmarkService;

    public NoteService(NoteRepository noteRepository, GrammarService grammarService, FlexmarkService flexmarkService) {
        this.noteRepository = noteRepository;
        this.grammarService = grammarService;
        this.flexmarkService = flexmarkService;
    }

    public String checkGrammar(MultipartFile file){
        return grammarService.check(this.getMarkdownFileText(file));
    }

    public NoteEntity saveNote(String title,MultipartFile file){
        String note = this.getMarkdownFileText(file);
        String html = flexmarkService.renderHtml(note);
        return noteRepository.save(new NoteEntity(title,note,html));
    }

    private String getMarkdownFileText(MultipartFile file){
        try{
            return new String(file.getBytes(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao ler o arquivo");
        }
    }

}
