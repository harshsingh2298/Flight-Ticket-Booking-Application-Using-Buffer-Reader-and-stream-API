package com.niit;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Reader {
    public Routes[] showDirectFlights() {

        File f = new File("src/main/java/com/niit/routes.csv");
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(f)))
        {

            while (br.readLine() != null)
                count++;
        } catch (Exception e)
        {
            System.out.println("hello");
        }
        System.out.println(count);

        Routes[] route = new Routes[count];
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            int i = 0;
            String temp;
            while ((temp = br.readLine()) != null) {

                String[] routesarray = temp.split(",");

                int distance = Integer.parseInt(routesarray[2].trim());
                
                route[i] = new Routes(routesarray[0].trim(), routesarray[1].trim(), distance, routesarray[3].trim(), routesarray[4].trim());
                i++;
            }
        } catch (Exception e) {
            System.out.println("hello");
        }
        return route;

    }
}

