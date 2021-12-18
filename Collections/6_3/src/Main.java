package com.oopslab.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        try {
            File f = new File("/home/arghya/IdeaProjects/Assignment/6_3/src/com/oopslab/assignment/para.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                String nextWord = sc.next();
                if (map.containsKey(nextWord))
                    map.put(nextWord, map.get(nextWord)+1);
                else
                    map.put(nextWord, 1);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(map);
    }
}
