package com.tirzasrwn.app.m03;

public class ConverterSuhu {
    // Metode untuk mengonversi suhu dari Celsius ke Fahrenheit
    public double konversiSuhu(double suhuCelsius) {
        return (suhuCelsius * 9 / 5) + 32;
    }

    // Metode untuk mengonversi suhu dari Fahrenheit ke Celsius
    public double konversiSuhu(double suhuFahrenheit, boolean dariFahrenheit) {
        if (dariFahrenheit) {
            return (suhuFahrenheit - 32) * 5 / 9;
        } else {
            return suhuFahrenheit;
        }
    }

    public static void main(String[] args) {
        ConverterSuhu converter = new ConverterSuhu();

        // Contoh pemanggilan metode untuk konversi suhu
        double suhuCelsius = 30;
        double suhuFahrenheit = converter.konversiSuhu(suhuCelsius);
        System.out.println(suhuCelsius + " derajat Celsius = " + suhuFahrenheit + " derajat Fahrenheit");

        suhuFahrenheit = 86;
        double suhuCelsiusConverted = converter.konversiSuhu(suhuFahrenheit, true);
        System.out.println(suhuFahrenheit + " derajat Fahrenheit = " + suhuCelsiusConverted + " derajat Celsius");
    }
}
