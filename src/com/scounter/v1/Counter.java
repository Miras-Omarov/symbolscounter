package com.scounter.v1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws IOException {

        System.out.println("Input path to the file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Map<Character,Integer> map = new HashMap<>();

        while(bufferedReader.ready()) {
            char b = (char) bufferedReader.read();
            if(map.containsKey(b)) {
                map.put(b,map.get(b) + 1);
            }
            else {
                map.put(b,1);
            }
        }

        bufferedReader.close();

        System.out.println("File contains");
        for(Map.Entry<Character,Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
