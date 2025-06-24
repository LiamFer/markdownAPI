package com.liamfer.markdownAPI.DTO;

import jakarta.validation.constraints.NotBlank;

public record markdownGrammarDTO (@NotBlank String markdown){
}
