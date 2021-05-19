package nika.goduadze.weather.controllers;


import nika.goduadze.weather.models.*;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/weather")
public class WeatherController {
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getEveryCityWeather(){
        List<Weather> weathers = new ArrayList<>();
        weathers.add(new Weather("Tbilist", 15d, 30d,15d, DirectionType.NORTH, 30d));
        weathers.add(new Weather("Qutaisi Simon", 15d, 30d,15d, DirectionType.EAST, 30d));
        weathers.add(new Weather("Batumi", 15d, 30d,15d, DirectionType.WEST, 30d));
        return weathers;
    }

    @GET
    @Path("/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getCityWeather(@PathParam("city")String city){
        return new Weather(city, 15d, 30d,15d, DirectionType.WEST, 30d);
    }
}
