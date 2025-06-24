package com.liamfer.markdownAPI.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

@Service
public class GrammarService {
    public String check(String markdown) {
        HttpClient client = HttpClient.newHttpClient();
        String language = "en-US";
        String body = "text=" + URLEncoder.encode(markdown, StandardCharsets.UTF_8) +
                "&language=" + URLEncoder.encode(language, StandardCharsets.UTF_8);
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://api.languagetool.org/v2/check"))
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(body))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            return "ERROR!";
        }
    }
}
