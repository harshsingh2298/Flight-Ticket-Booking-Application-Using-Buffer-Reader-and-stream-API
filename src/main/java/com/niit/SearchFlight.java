package com.niit;

public class SearchFlight {
    public Routes[] displayFlightDetails(Routes[] route, String source)
    {
        int count = 0;
        for (int i = 0; i < route.length; i++)
        {
            if (source.equals(route[i].fromcity))
            {
                System.out.println(route[i]);
                count++;
            }
        }
       // System.out.println(count);
        Routes[] arr = new Routes[count];
        int j = 0;
        for (int i = 0; i < route.length; i++)
        {
            if (source.equals(route[i].fromcity))
            {
                arr[j] = route[i];
                j++;
            }
        }
        return arr;
    }
    public void sortDirectFlights(Routes[] directFlights)
    {
        Routes temp;
        for (int pass = 0; pass < directFlights.length - 1; pass++)
        {
            for (int i = pass + 1; i < directFlights.length; i++) {
                if (directFlights[pass].tocity.compareTo(directFlights[i].tocity) > 0)
                {
                    temp = directFlights[i];
                    directFlights[i] = directFlights[pass];
                    directFlights[pass] = temp;

                }
            }
        }
    }
    public void showAllConnections(Routes[] routeInfo, String source, String destination)
    {
                for(int i=0;i< routeInfo.length;i++)
                {
                    if ((routeInfo[i].fromcity.equals(source) && (routeInfo[i].tocity.equals(destination))))
                        System.out.println((String.format("%15s %15s %25s %20s %20s",routeInfo[i].fromcity, routeInfo[i].tocity,routeInfo[i].distance,routeInfo[i].time, routeInfo[i].cost)));
                }
        for (int i=0;i<routeInfo.length;i++) {

                String temp = routeInfo[i].tocity.trim();
                if ((routeInfo[i].fromcity.equals(source)) && !(routeInfo[i].tocity.equals(destination))) {
                    for (int j = 0; j < routeInfo.length; j++) {
                        if ((temp.equals(routeInfo[j].fromcity)) && ((routeInfo[j].tocity).equals(destination))) {
                            System.out.println("*****************************************************************************************************************");
                            System.out.println((String.format("%15s %15s %25s %20s %20s",routeInfo[i].fromcity, routeInfo[i].tocity,routeInfo[i].distance,routeInfo[i].time, routeInfo[i].cost)));
                            System.out.println((String.format("%15s %15s %25s %20s %20s",routeInfo[j].fromcity, routeInfo[j].tocity,routeInfo[j].distance,routeInfo[j].time, routeInfo[j].cost)));
                            showAllConnections(routeInfo, temp, destination);
                        }

                    }

                }
            }
        }
    }







