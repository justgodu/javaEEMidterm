package nika.goduadze.weather;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Bot {
    private final String incomingMessage;

    public Bot(String msg) {
        this.incomingMessage = msg;
    }

    public String getBotResponse() throws Exception {
        if ("all".equals(this.incomingMessage)) {
            return getEveryCityWeather();
        }
        return getWeatherByCity();


    }

    private String getEveryCityWeather() throws  Exception{
        URL url = new URL("http://localhost:8080/nika_goduadze_davaleba_1_war_exploded/api/weather/");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");


        if (conn.getResponseCode() != 200 && conn.getResponseCode() != 204) {
            return "We couldn't weather";
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));


        String output;

        output = br.readLine();


        return output;
    }

    private String getWeatherByCity() throws Exception
    {

        URL url = new URL("http://localhost:8080/nika_goduadze_davaleba_1_war_exploded/api/weather/" + this.incomingMessage);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");


        if (conn.getResponseCode() != 200 && conn.getResponseCode() != 204) {
            return "We couldn't find city";
        }



        InputStream responseStream = conn.getInputStream();
//        ObjectMapper mapper = new ObjectMapper();
//        CHUCK resp = mapper.readValue(responseStream, CHUCK.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));


        String output;

        output = br.readLine();

        return output;
    }
}
