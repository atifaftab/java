package interview;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//File containing names separated by commas.
// provide a Java program that finds all duplicate names in the file and counts the occurrences of each
public class ReadDuplicateFromFile {
    public static void main(String[] args) {
        String filePath = "C:\\work\\workspaces\\spring boot\\javaPractice\\src\\interview\\DuplicateNames.txt";
        Map<String, Integer> duplicateNamesAndCountMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] names = line.split(",");
                for (String name : names) {
                    duplicateNamesAndCountMap.put(name, duplicateNamesAndCountMap.getOrDefault(name, 0) + 1);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        duplicateNamesAndCountMap.forEach((names, count) -> {
            if (count > 1)
                System.out.println(names + " : " + count);
        });
    }
}
