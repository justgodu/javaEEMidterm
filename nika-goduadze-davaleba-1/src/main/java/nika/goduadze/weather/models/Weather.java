package nika.goduadze.weather.models;

public class Weather {
    private String CityName;

    private Double Temperature;

    private Double Humidity;

    private Double Pressure;

    private DirectionType WindDirection;

    private Double WindSpeed;

    public Weather() {}

    public Weather(String cityName, Double temperature, Double humidity, Double pressure, DirectionType windDirection, Double windSpeed) {
        CityName = cityName;
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
        WindDirection = windDirection;
        WindSpeed = windSpeed;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public Double getTemperature() {
        return Temperature;
    }

    public void setTemperature(Double temperature) {
        Temperature = temperature;
    }

    public Double getHumidity() {
        return Humidity;
    }

    public void setHumidity(Double humidity) {
        Humidity = humidity;
    }

    public Double getPressure() {
        return Pressure;
    }

    public void setPressure(Double pressure) {
        Pressure = pressure;
    }

    public DirectionType getWindDirection() {
        return WindDirection;
    }

    public void setWindDirection(DirectionType windDirection) {
        WindDirection = windDirection;
    }

    public Double getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        WindSpeed = windSpeed;
    }
}
