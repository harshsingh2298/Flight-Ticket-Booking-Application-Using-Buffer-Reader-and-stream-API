package com.niit;
import java.io.*;

import java.util.Scanner;

public class Impl {
    public static void main(String[] args) {

        Reader reader = new Reader();
        Routes[] detail = reader.showDirectFlights();


        System.out.println("************************************************ ALL FLIGHTS CHART  ***************************************************");
        System.out.println(String.format("%15s %15s %25s %20s %20s", "From", "To", "Distance in Km", "Travel Time", "Typical Airfare"));
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for (Routes x : detail)
        {
            System.out.println(x);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Enter Source Station-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        String source = sc.nextLine();
        System.out.println();
        System.out.println("******************************************* DISPLAY FLIGHTS FROM ENTERED CITY ******************************************");
        System.out.println(String.format("%15s %15s %25s %20s %20s", "From", "To", "Distance in Km", "Travel Time", "Typical Airfare"));
        System.out.println("------------------------------------------------------------------------------------------------------------");
        SearchFlight searchflight = new SearchFlight();
        Routes[] flights = searchflight.displayFlightDetails(detail, source);


        System.out.println("********************************************** SORTED FLIGHT DETAIL  *****************************************************");
        System.out.println(String.format("%15s %15s %25s %20s %20s", "From", "To", "Distance in Km", "Travel Time", "Typical Airfare"));
        System.out.println("----------------------------------------------------------------------------------------------------------");
        searchflight.sortDirectFlights(flights);
        for (int i = 0; i < flights.length; i++) {
            System.out.println(flights[i]);
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*Enter Destination Station-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        String destination = sc1.nextLine();
        System.out.println();
        System.out.println("******************************************* DISPLAY FLIGHTS FROM ENTERED CITY ******************************************");
        System.out.println(String.format("%15s %15s %25s %20s %20s", "From", "To", "Distance in Km", "Travel Time", "Typical Airfare"));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        SearchFlight searchFlight1 = new SearchFlight();
        searchFlight1.showAllConnections(detail,source, destination);

    }
}

