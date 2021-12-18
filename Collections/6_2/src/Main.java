package com.oopslab.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File pass = new File("/home/arghya/IdeaProjects/Assignment/6_2/src/com/oopslab/assignment/psswd.txt");
            Scanner sc = new Scanner(pass);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] user_pass = data.split(":");
                map.put(user_pass[0], user_pass[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        // Show sorted values
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
