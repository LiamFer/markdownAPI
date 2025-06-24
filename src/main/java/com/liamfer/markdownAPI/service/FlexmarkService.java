package com.liamfer.markdownAPI.service;

import com.vladsch.flexmark.util.ast.Node;
import org.springframework.stereotype.Service;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;

@Service
public class FlexmarkService {
    private final Parser parser;
    private final HtmlRenderer renderer;

    public FlexmarkService(Parser parser, HtmlRenderer renderer) {
        this.parser = parser;
        this.renderer = renderer;
    }

    public String renderHtml(String markdown){
        Node document = parser.parse(markdown);
        return renderer.render(document);
    }


}
