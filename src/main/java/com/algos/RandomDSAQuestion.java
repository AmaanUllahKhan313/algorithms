package com.algos;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomDSAQuestion {

    // Root package containing all DSA solutions
    private static final String ROOT_FOLDER =
            "E:/Amaan/office_office/freelancing workspace/algorithms/src/main/java/com";

    public static void main(String[] args) throws IOException {

        List<Path> javaFiles = getAllJavaFiles(ROOT_FOLDER);

        if (javaFiles.isEmpty()) {
            System.out.println("No DSA solutions found.");
            return;
        }

        Random random = new Random();

        Path selected = javaFiles.get(random.nextInt(javaFiles.size()));

        System.out.println("Today's Question");
        System.out.println("-------------------------");

        // Display package name
        Path relative = Paths.get(ROOT_FOLDER).relativize(selected);

        String packageName = relative.getParent() == null
                ? ""
                : relative.getParent().toString().replace("\\", ".");

        String className = selected.getFileName()
                .toString()
                .replace(".java", "");

        System.out.println("Package : " + packageName);
        System.out.println("Class   : " + className);
        System.out.println("File    : " + selected);

    }

    private static List<Path> getAllJavaFiles(String root)
            throws IOException {

        try (Stream<Path> stream = Files.walk(Paths.get(root))) {

            return stream
                    .filter(Files::isRegularFile)
                    .filter(f -> f.toString().endsWith(".java"))
                    .filter(f -> !f.getFileName().toString().equals("package-info.java"))
                    .filter(f -> !f.getFileName().toString().equals("module-info.java"))
                    .collect(Collectors.toList());
        }
    }
}