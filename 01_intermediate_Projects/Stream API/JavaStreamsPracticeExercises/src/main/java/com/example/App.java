package com.example;

import java.util.*;

/**
 * Entry point for the application.
 * Demo Class
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\n\uD83D\uDC83 Java Streams Practice Day! \uD83D\uDC83\n" );


        // ------------------------------------------------
        // Exercise 2: Group Products by Category
        // ------------------------------------------------
        List<Product> products = DummyProducts.getSampleProducts();
        Map<String, Long> grouped = SystemAnalyzer.groupProductsByCategory(products);
        Map<String, List<Product>> grouped2 = SystemAnalyzer.groupProductsByCategoryListProducts(products);
        Map<String, List<String>> groupedMapping = SystemAnalyzer.groupProductsByCategoryAndMap(products);
        System.out.println("Group products: " + grouped);
        //System.out.println("Group2 products: " + grouped2);
        System.out.println("Group & Mapped products: " + groupedMapping);

        // ------------------------------------------------
        // Exercise 1: Flatten Sentences into Words
        // ------------------------------------------------
        List<String> sentences = List.of("Java is fun", "Streams are powerful");
        List<String> words = SystemAnalyzer.flattenSentences(sentences);
        System.out.println("Flattened Sentence: " + words);

        // ------------------------------------------------



    }
}
