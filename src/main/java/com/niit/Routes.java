package com.niit;
class Routes
{
    String fromcity;
    String tocity;
    int distance;
    String time;
    String cost;

    public Routes(String fromcity,String tocity,int distance,String time,String cost)
    {
        this.tocity=tocity;
        this.fromcity=fromcity;
        this.distance=distance;
        this.time=time;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return (String.format("%15s %15s %25s %20s %20s",fromcity, tocity,distance,time, cost));
    }
}