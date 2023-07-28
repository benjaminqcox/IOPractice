package com.bootcamp.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Runner {
    public static void main(String[] args) {
        File f = new File("./poem.txt");
        try(BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)))){
            fw.write("the sun did not shine.\n" +
                    "it was too wet to play.\n" +
                    "so we sat in the house\n" +
                    "all that cold, cold, wet day.\n" +
                    "\n" +
                    "i sat there with sally.\n" +
                    "we sat there, we two.\n" +
                    "and i said, 'how i wish\n" +
                    "we had something to do!'\n" +
                    "\n" +
                    "too wet to go out\n" +
                    "and too cold to play ball.\n" +
                    "so we sat in the house.\n" +
                    "we did nothing at all.\n" +
                    "\n" +
                    "so all we could do was to\n" +
                    "sit!\n" +
                    "sit!\n" +
                    "sit!\n" +
                    "sit!\n" +
                    "and we did not like it.\n" +
                    "not one little bit. ");

                    
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            br.lines().forEach(currLine -> System.out.println(currLine));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
