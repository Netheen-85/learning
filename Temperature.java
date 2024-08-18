public class Temperature{

    // Convert Celsius to Fahrenheit - F = (9/5 x celsius) + 32
    public static float celsiusToFahrenheit(float celsius) {
        return (9/5f * celsius) + 32;
    }

    // Convert Fahrenheit to Celsius - C = 5/9(Fahrenheit - 32)
    public static float fahrenheitToCelsius(float fahrenheit) {
        return 5/9f * (fahrenheit - 32);
    }

    // Convert Celsius to Kelvin - K = C + 273.15
    public static float celsiusToKelvin(float celsius) {
        return celsius + 273.15f;
    }

    // Convert Kelvin to Celsius - C = K - 273.15
    public static float kelvinToCelsius(float kelvin) {
        return kelvin - 273.15f;
    }

    // Convert Fahrenheit to Kelvin - K = (5/9(Fahrenheit - 32) + 273.15)
    public static float fahrenheitToKelvin(float fahrenheit) {
        return 5/9f * (fahrenheit - 32) + 273.15f;
    }

    // Convert Kelvin to Fahrenheit - F = (9/5 x (K - 273.15)) + 32
    public static float kelvinToFahrenheit(float kelvin) {
        return 9/5f * (kelvin - 273.15f) + 32;
    }

    public static void main(String[] args) {
        // Example usage
        float celsius = 25f;
        float fahrenheit = 77f;
        float kelvin = 298.15f;

        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
        System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
        System.out.println("Celsius to Kelvin: " + celsiusToKelvin(celsius));
        System.out.println("Kelvin to Celsius: " + kelvinToCelsius(kelvin));
        System.out.println("Fahrenheit to Kelvin: " + fahrenheitToKelvin(fahrenheit));
        System.out.println("Kelvin to Fahrenheit: " + kelvinToFahrenheit(kelvin));
    }
}
