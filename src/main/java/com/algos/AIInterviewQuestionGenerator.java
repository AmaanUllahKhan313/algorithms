package com.algos;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AIInterviewQuestionGenerator {
    private static final String DSA_FOLDER =
            "E:/Amaan/office_office/freelancing workspace/algorithms/src/main/java/com";
    public static void main(String[] args) throws Exception {
        List<Path> javaFiles = scanJavaFiles();
        Random random = new Random();
        Path selected = javaFiles.get(random.nextInt(javaFiles.size()));
        String sourceCode =
                Files.readString(selected, StandardCharsets.UTF_8);
        String prompt = "You are a senior FAANG interviewer. I will provide ONLY the Java solution. Your task is to reconstruct the DSA interview problem similar asked in companies interview. Return in this format TITLE DIFFICULTY PROBLEM CONSTRAINTS SAMPLE INPUT SAMPLE OUTPUT TOPICS FOLLOW UPS Here is the Java solution '"+sourceCode+"'";
        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(new StringSelection(prompt), null);
        Thread.sleep(1000);
        Desktop.getDesktop().browse(new URI("https://chatgpt.com"));
        Thread.sleep(5000);
        Robot robot = new Robot();
        robot.setAutoDelay(50);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
     private static List<Path> scanJavaFiles()
            throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(AIInterviewQuestionGenerator.DSA_FOLDER))) {
            return stream
                    .filter(Files::isRegularFile)
                    .filter(f -> f.toString().endsWith(".java"))
                    .collect(Collectors.toList());
        }
    }
}