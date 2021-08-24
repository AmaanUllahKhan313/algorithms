package com.algos;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;

public class ReadWebPage {

    public static void main(String[] args) throws IOException, InterruptedException {
        Random r = new Random();
        int random = r.nextInt(40) + 1;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://github.com/FarheenB/Data-Structures-and-Algorithms/search?p="+random+"&q=author+Farheen+Bano"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        int random2 = r.nextInt(response.body().split("https://leetcode.com/problems/").length) ;
        String url = "https://leetcode.com/problems/"+response.body().split("https://leetcode.com/problems/")[random2].split("</span>")[0];
        System.out.println(url);
        Runtime rt = Runtime.getRuntime();
        rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
    }
}