import java.lang.Math;

public class TemperatureConverter {
    public int convertToFahrenheit (float celsius) {
        return Math.round((celsius * 9/5) + 32);
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        for (int celcius = 0; celcius <=  100; celcius = celcius + 2) {
            int resul = temperatureConverter.convertToFahrenheit(celcius);
            System.out.println(celcius + " = " + resul);
        }
    }
}



//tempFahrenheit = tempCelsius * 9/5 + 32