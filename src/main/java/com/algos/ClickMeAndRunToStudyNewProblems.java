package com.algos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class ClickMeAndRunToStudyNewProblems {

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
        String body = response.body();

        int random2 = r.nextInt(body.split("https://leetcode.com/problems/").length) ;
        String url = "https://leetcode.com/problems/"+body.split("https://leetcode.com/problems/")[random2].split("</span>")[0];
//        System.out.println(url);
        if(!url.contains("<!DOCTYPE html>")){
            String path = "../alreadySolvedProblems.txt";
            boolean isAlreadyStudied = isPresent(path,url);
            if(isAlreadyStudied){
                System.out.println("Already studied problem. Please rerun the program!");
                return;
            }
            markAsAlreadyGenerated(path,url,client,body);
            Runtime rt = Runtime.getRuntime();
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        }else{
            System.out.println("INVALID URL GENERATED..\nPlease rerun the program...");
        }
    }

    private static boolean isPresent(String path,String url) {
        Set<String> cache = new HashSet<String>();
        try
        { File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("File has been created.");
            }
            FileInputStream fis=new FileInputStream(path);
            Scanner sc=new Scanner(fis);
            while(sc.hasNextLine()){
                cache.add(sc.nextLine());
            }
            sc.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        if(cache.contains(url))return true;
        return false;
    }

    public static void markAsAlreadyGenerated(String filename, String data, HttpClient client, String body) throws InterruptedException {
        try {
            String[] java= body.split(data)[0].split(".java");
            String javaLink = java[java.length-2];
            String href = "https://github.com/"+javaLink.split("href=\"")[1]+".java";
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(href))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            String problemBody = response.body();
            String[] names = {"https://leetcode.com/problems/",
                    "https://www.geeksforgeeks.org/",
                    "https://www.interviewbit.com/problems/",
                    "https://practice.geeksforgeeks.org/problems/"};
           List<String> sites =  Arrays.asList(names);

            FileWriter fw = new FileWriter(filename, true);
            System.out.println("You are studying the following generated problem:");
            for(String site:sites){
                String[] spittedURL = problemBody.split(site);
                if(spittedURL.length>1){
                    site = site + problemBody.split(site)[1].split("</span>")[0];
                    fw.write("\n"+site);
                    System.out.println(site);
                }
            }
            System.out.println("Loading the problem. Opening in default browser...");
            System.out.println("NOTE: Solved problems are present inside the file: src\\main\\resources\\alreadySolvedProblems.txt");
            fw.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}