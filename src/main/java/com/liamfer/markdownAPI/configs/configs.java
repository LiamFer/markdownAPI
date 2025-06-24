package com.liamfer.markdownAPI.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.MutableDataSet;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;

@Configuration
public class configs {
    @Bean
    public Parser parser (){
        return Parser.builder().build();
    }
    @Bean
    public HtmlRenderer renderer (){
        return HtmlRenderer.builder().build();
    }

}
