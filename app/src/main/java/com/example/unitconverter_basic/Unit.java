package com.example.unitconverter_basic;

/**
 * Esta clase contiene el método convertir para entre las unidades del conversor, así como todos los métodos para los cambios,
 * uno por cada pareja de unidades. Originalmente solo disponía de temperatura, todas las demas han sido añadidas por nosotros.
 * @author: Pablo Ascorbe, Alberto Escalona, David Íñiguez e Iñaki Lafuente a partir de la librería de jdstruck
 * @version: 29/04/2021
 * @see <a href = "https://github.com/jdstruck/UnitConverter-Android"/>UnitConverter-Android</a>
 */

public class Unit {

    static String[] unidadesTemperatura = {"Celsius", "Fahrenheit", "Kelvin"};
    static String[] unidadesAlmacenamientoDigital = {"Bit", "Byte", "KiloBit", "KiloByte", "MegaBit", "MegaByte", "GigaBit", "GigaByte", "TeraBit", "TeraByte"};
    static String[] unidadesLongitud = {"Kilómetros", "Metros", "Centímetros", "Pulgadas", "Pies", "Yardas", "Millas", "Años Luz"};
    static String[] unidadesArea = {"Kilómetro cuadrado","Metro cuadrado","Centímetro cuadrado","Hectárea","Acre","Pie cuadrado","Yarda cuadrada", "Milla cuadrada"};
    static String[] unidadesMasa = {"Kilogramos", "Gramos", "Miligramos", "Unidad de masa atómica", "Toneladas", "Kilonewtons", "Libras"};
    static String[] unidadesVelocidad = {"Kilómetros por segundo", "Metros por segundo", "Kilómetros por minuto", "Metros por minuto", "Kilómetros por hora", "Metros por hora", "Milla por hora"};
    static String[] unidadesTiempo = {"Segundos", "Minutos", "Horas", "Días", "Semanas", "Meses", "Años", "Milisegundos", "Microsegundos", "Nanosegundos"};
    static String[] unidadesFuerza = {"Newtons", "Kilonewtons", "Meganewtons", "Milinewtons", "Micronewtons", "Kilogramos-fuerza", "Libras-fuerza"};
    static String[] unidadesVolumen = {"Litros", "Mililitros", "Metros cúbicos", "Centímetros cúbicos", "UKGalones", "USGalones", "Pulgadas cúbicas", "Pies cúbicos"};
    static String[] unidadesPresion = {"Bar", "Pascal", "Libras por pulgada cuadrada", "Torr", "Atmósfera"};
    static String[] unidadesEnergiaTrabajo = {"Julios", "Kilocalorías", "Calorías", "Kilovatios-hora", "Electronvoltios"};
    static String[] unidadesCategorias = {"Temperatura", "Longitud", "Almacenamiento digital", "Área", "Masa", "Velocidad", "Tiempo", "Fuerza", "Volumen", "Presión", "Energía y trabajo"};

    static String[] unidadesTemperaturaOut = {"Kelvin", "Celsius", "Fahrenheit"};
    static String[] unidadesAlmacenamientoDigitalOut = {"TeraByte", "Bit", "Byte", "KiloBit", "KiloByte", "MegaBit", "MegaByte", "GigaBit", "GigaByte", "TeraBit"};
    static String[] unidadesLongitudOut = {"Años Luz", "Kilómetros", "Metros", "Centímetros", "Pulgadas", "Pies", "Yardas", "Millas"};
    static String[] unidadesAreaOut = {"Milla cuadrada", "Kilómetro cuadrado","Metro cuadrado","Centímetro cuadrado","Hectárea","Acre","Pie cuadrado","Yarda cuadrada"};
    static String[] unidadesMasaOut = {"Libras", "Kilogramos", "Gramos", "Miligramos", "Unidad de masa atómica", "Toneladas", "Kilonewtons"};
    static String[] unidadesVelocidadOut = {"Milla por hora", "Kilómetros por segundo", "Metros por segundo", "Kilómetros por minuto", "Metros por minuto", "Kilómetros por hora", "Metros por hora"};
    static String[] unidadesTiempoOut = {"Nanosegundos", "Segundos",  "Minutos", "Horas", "Días", "Semanas", "Meses", "Años", "Milisegundos", "Microsegundos"};
    static String[] unidadesFuerzaOut = {"Libras-fuerza", "Newtons", "Kilonewtons", "Meganewtons", "Milinewtons", "Micronewtons", "Kilogramos-fuerza"};
    static String[] unidadesVolumenOut = {"Pies cúbicos", "Litros", "Mililitros", "Metros cúbicos", "Centímetros cúbicos", "UKGalones", "USGalones", "Pulgadas cúbicas"};
    static String[] unidadesPresionOut = {"Atmósfera", "Bar", "Pascal", "Libras por pulgada cuadrada", "Torr"};
    static String[] unidadesEnergiaTrabajoOut = {"Electronvoltios", "Julios", "Kilocalorías", "Calorías", "Kilovatios-hora"};


    /**
     * Método convert, para convertir de una unidad a otra
     * @param inputCategory categoría de unidades actual
     * @param inputUnit unidad desde la que se quiere convertir
     * @param outputUnit unidad a la que se va a convertir
     * @param inputFieldValue valor de la unidad origen
     * @return el valor correspondiente en la unidad destino a la cantidad de la unidad origen
     */
    static Double convert(String inputCategory, String inputUnit, String outputUnit, Double inputFieldValue) {
        Double outputValue = 0.0;
        switch (inputCategory) {
            case "Temperatura":
                if(inputUnit.equals("Celsius")) {
                    switch(outputUnit) {
                        case "Celsius":
                            outputValue = inputFieldValue;
                            break;
                        case "Fahrenheit":
                            outputValue = Unit.celsiusToFahrenheit(inputFieldValue);
                            break;
                        case "Kelvin":
                            outputValue = Unit.celsiusToKelvin(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Fahrenheit")) {
                    switch(outputUnit) {
                        case "Fahrenheit":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Celsius":
                            outputValue = Unit.fahrenheitToCelsius(inputFieldValue);
                            break;
                        case "Kelvin":
                            outputValue = Unit.fahrenheitToKelvin(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Kelvin")) {
                    switch(outputUnit) {
                        case "Kelvin":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Celsius":
                            outputValue = Unit.kelvinToCelsius(inputFieldValue);
                            break;
                        case "Fahrenheit":
                            outputValue = Unit.kelvinToFahrenheit(inputFieldValue);
                            break;

                    }
                }
                break;
            case "Longitud":
                if(inputUnit.equals("Kilómetros")) {
                    switch (outputUnit) {
                        case "Kilómetros":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Metros":
                            outputValue = Unit.kilometrosToMetros(inputFieldValue);
                            break;
                        case "Centímetros":
                            outputValue = Unit.kilometrosToCentimetros(inputFieldValue);
                            break;
                        case "Pulgadas":
                            outputValue = Unit.kilometrosToPulgadas(inputFieldValue);
                            break;
                        case "Pies":
                            outputValue = Unit.kilometrosToPies(inputFieldValue);
                            break;
                        case "Yardas":
                            outputValue = Unit.kilometrosToYardas(inputFieldValue);
                            break;
                        case "Millas":
                            outputValue = Unit.kilometrosToMillas(inputFieldValue);
                            break;
                        case "Años Luz":
                            outputValue = Unit.kilometrosToAniosLuz(inputFieldValue);
                    }
                }
                if(inputUnit.equals("Metros")) {
                    switch (outputUnit) {
                        case "Kilómetros":
                            outputValue = Unit.metrosToKilometros(inputFieldValue);
                            break;
                        case "Metros":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Centímetros":
                            outputValue = Unit.metrosToCentimetros(inputFieldValue);
                            break;
                        case "Pulgadas":
                            outputValue = Unit.metrosToPulgadas(inputFieldValue);
                            break;
                        case "Pies":
                            outputValue = Unit.metrosToPies(inputFieldValue);
                            break;
                        case "Yardas":
                            outputValue = Unit.metrosToYardas(inputFieldValue);
                            break;
                        case "Millas":
                            outputValue = Unit.metrosToMillas(inputFieldValue);
                            break;
                        case "Años Luz":
                            outputValue = Unit.metrosToAniosLuz(inputFieldValue);
                    }
                }
                if(inputUnit.equals("Centímetros")) {
                    switch (outputUnit) {
                        case "Kilómetros":
                            outputValue = Unit.centimetrosToKilometros(inputFieldValue);
                            break;
                        case "Metros":
                            outputValue = Unit.centimetrosToMetros(inputFieldValue);
                            break;
                        case "Centímetros":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Pulgadas":
                            outputValue = Unit.centimetrosToPulgadas(inputFieldValue);
                            break;
                        case "Pies":
                            outputValue = Unit.centimetrosToPies(inputFieldValue);
                            break;
                        case "Yardas":
                            outputValue = Unit.centimetrosToYardas(inputFieldValue);
                            break;
                        case "Millas":
                            outputValue = Unit.centimetrosToMillas(inputFieldValue);
                            break;
                        case "Años Luz":
                            outputValue = Unit.centimetrosToAniosLuz(inputFieldValue);
                    }
                }
                if(inputUnit.equals("Pulgadas")) {
                    switch (outputUnit) {
                        case "Kilómetros":
                            outputValue = Unit.pulgadasToKilometros(inputFieldValue);
                            break;
                        case "Metros":
                            outputValue = Unit.pulgadasToMetros(inputFieldValue);
                            break;
                        case "Centímetros":
                            outputValue = Unit.pulgadasToCentimetros(inputFieldValue);
                            break;
                        case "Pulgadas":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Pies":
                            outputValue = Unit.pulgadasToPies(inputFieldValue);
                            break;
                        case "Yardas":
                            outputValue = Unit.pulgadasToYardas(inputFieldValue);
                            break;
                        case "Millas":
                            outputValue = Unit.pulgadasToMillas(inputFieldValue);
                            break;
                        case "Años Luz":
                            outputValue = Unit.pulgadasToAniosLuz(inputFieldValue);
                    }
                }
                if(inputUnit.equals("Pies")) {
                    switch (outputUnit) {
                        case "Kilómetros":
                            outputValue = Unit.piesToKilometros(inputFieldValue);
                            break;
                        case "Metros":
                            outputValue = Unit.piesToMetros(inputFieldValue);
                            break;
                        case "Centímetros":
                            outputValue = Unit.piesToCentimetros(inputFieldValue);
                            break;
                        case "Pulgadas":
                            outputValue = Unit.piesToPulgadas(inputFieldValue);
                            break;
                        case "Pies":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Yardas":
                            outputValue = Unit.piesToYardas(inputFieldValue);
                            break;
                        case "Millas":
                            outputValue = Unit.piesToMillas(inputFieldValue);
                            break;
                        case "Años Luz":
                            outputValue = Unit.piesToAniosLuz(inputFieldValue);
                    }
                }
                if(inputUnit.equals("Yardas")) {
                    switch (outputUnit) {
                        case "Kilómetros":
                            outputValue = Unit.yardasToKilometros(inputFieldValue);
                            break;
                        case "Metros":
                            outputValue = Unit.yardasToMetros(inputFieldValue);
                            break;
                        case "Centímetros":
                            outputValue = Unit.yardasToCentimetros(inputFieldValue);
                            break;
                        case "Pulgadas":
                            outputValue = Unit.yardasToPulgadas(inputFieldValue);
                            break;
                        case "Pies":
                            outputValue = Unit.yardasToPies(inputFieldValue);
                            break;
                        case "Yardas":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Millas":
                            outputValue = Unit.yardasToMillas(inputFieldValue);
                            break;
                        case "Años Luz":
                            outputValue = Unit.yardasToAniosLuz(inputFieldValue);
                    }
                }
                if(inputUnit.equals("Millas")) {
                    switch (outputUnit) {
                        case "Kilómetros":
                            outputValue = Unit.millasToKilometros(inputFieldValue);
                            break;
                        case "Metros":
                            outputValue = Unit.millasToMetros(inputFieldValue);
                            break;
                        case "Centímetros":
                            outputValue = Unit.millasToCentimetros(inputFieldValue);
                            break;
                        case "Pulgadas":
                            outputValue = Unit.millasToPulgadas(inputFieldValue);
                            break;
                        case "Pies":
                            outputValue = Unit.millasToPies(inputFieldValue);
                            break;
                        case "Yardas":
                            outputValue = Unit.millasToYardas(inputFieldValue);
                            break;
                        case "Millas":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Años Luz":
                            outputValue = Unit.millasToAniosLuz(inputFieldValue);
                    }
                }
                if(inputUnit.equals("Años Luz")) {
                    switch (outputUnit) {
                        case "Kilómetros":
                            outputValue = Unit.aniosLuzToKilometros(inputFieldValue);
                            break;
                        case "Metros":
                            outputValue = Unit.aniosLuzToMetros(inputFieldValue);
                            break;
                        case "Centímetros":
                            outputValue = Unit.aniosLuzToCentimetros(inputFieldValue);
                            break;
                        case "Pulgadas":
                            outputValue = Unit.aniosLuzToPulgadas(inputFieldValue);
                            break;
                        case "Pies":
                            outputValue = Unit.aniosLuzToPies(inputFieldValue);
                            break;
                        case "Yardas":
                            outputValue = Unit.aniosLuzToYardas(inputFieldValue);
                            break;
                        case "Millas":
                            outputValue = Unit.aniosLuzToMillas(inputFieldValue);
                            break;
                        case "Años Luz":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                    }
                }
                break;
            case "Almacenamiento digital":
                if(inputUnit.equals("Bit")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Byte":
                            outputValue = Unit.bitToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Unit.bitToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Unit.bitToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Unit.bitToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Unit.bitToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Unit.bitToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Unit.bitToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Unit.bitToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Unit.bitToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Byte")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.byteToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "KiloBit":
                            outputValue = Unit.byteToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Unit.byteToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Unit.byteToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Unit.byteToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Unit.byteToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Unit.byteToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Unit.byteToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Unit.byteToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("KiloBit")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.kiloBitToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Unit.kiloBitToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "KiloByte":
                            outputValue = Unit.kiloBitToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Unit.kiloBitToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Unit.kiloBitToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Unit.kiloBitToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Unit.kiloBitToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Unit.kiloBitToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Unit.kiloBitToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("KiloByte")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.kiloByteToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Unit.kiloByteToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Unit.kiloByteToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "MegaBit":
                            outputValue = Unit.kiloByteToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Unit.kiloByteToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Unit.kiloByteToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Unit.kiloByteToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Unit.kiloByteToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Unit.kiloByteToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("MegaBit")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.megaBitToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Unit.megaBitToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Unit.megaBitToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Unit.megaBitToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "MegaByte":
                            outputValue = Unit.megaBitToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Unit.megaBitToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Unit.megaBitToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Unit.megaBitToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Unit.megaBitToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("MegaByte")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.megaByteToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Unit.megaByteToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Unit.megaByteToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Unit.megaByteToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Unit.megaByteToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "GigaBit":
                            outputValue = Unit.megaByteToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Unit.megaByteToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Unit.megaByteToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Unit.megaByteToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("GigaBit")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.gigaBitToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Unit.gigaBitToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Unit.gigaBitToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Unit.gigaBitToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Unit.gigaBitToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Unit.gigaBitToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "GigaByte":
                            outputValue = Unit.gigaBitToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Unit.gigaBitToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Unit.gigaBitToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("GigaByte")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.gigaByteToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Unit.gigaByteToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Unit.gigaByteToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Unit.gigaByteToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Unit.gigaByteToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Unit.gigaByteToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Unit.gigaByteToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "TeraBit":
                            outputValue = Unit.gigaByteToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Unit.gigaByteToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("TeraBit")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.teraBitToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Unit.teraBitToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Unit.teraBitToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Unit.teraBitToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Unit.teraBitToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Unit.teraBitToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Unit.teraBitToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Unit.teraBitToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "TeraByte":
                            outputValue = Unit.teraBitToTeraByte(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("TeraByte")) {
                    switch(outputUnit) {
                        case "Bit":
                            outputValue = Unit.teraByteToBit(inputFieldValue);
                            break;
                        case "Byte":
                            outputValue = Unit.teraByteToByte(inputFieldValue);
                            break;
                        case "KiloBit":
                            outputValue = Unit.teraByteToKiloBit(inputFieldValue);
                            break;
                        case "KiloByte":
                            outputValue = Unit.teraByteToKiloByte(inputFieldValue);
                            break;
                        case "MegaBit":
                            outputValue = Unit.teraByteToMegaBit(inputFieldValue);
                            break;
                        case "MegaByte":
                            outputValue = Unit.teraByteToMegaByte(inputFieldValue);
                            break;
                        case "GigaBit":
                            outputValue = Unit.teraByteToGigaBit(inputFieldValue);
                            break;
                        case "GigaByte":
                            outputValue = Unit.teraByteToGigaByte(inputFieldValue);
                            break;
                        case "TeraBit":
                            outputValue = Unit.teraByteToTeraBit(inputFieldValue);
                            break;
                        case "TeraByte":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }

                }
                break;
            case "Área":
                if(inputUnit.equals("Kilómetro cuadrado")) {
                    switch(outputUnit) {
                        case "Kilómetro cuadrado":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Metro cuadrado":
                            outputValue = Unit.km2ToM2(inputFieldValue);
                            break;
                        case "Centímetro cuadrado":
                            outputValue = Unit.km2ToCm2(inputFieldValue);
                            break;
                        case "Hectárea":
                            outputValue = Unit.km2ToHectarea(inputFieldValue);
                            break;
                        case "Acre":
                            outputValue = Unit.km2ToAcre(inputFieldValue);
                            break;
                        case "Pie cuadrado":
                            outputValue = Unit.km2ToPie2(inputFieldValue);
                            break;
                        case "Yarda cuadrada":
                            outputValue = Unit.km2ToYarda2(inputFieldValue);
                            break;
                        case "Milla cuadrada":
                            outputValue = Unit.km2ToMilla2(inputFieldValue);
                            break;
                    }

                }
                if(inputUnit.equals("Metro cuadrado")) {
                    switch(outputUnit) {
                        case "Kilómetro cuadrado":
                            outputValue = Unit.m2ToKm2(inputFieldValue);
                            break;
                        case "Metro cuadrado":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Centímetro cuadrado":
                            outputValue = Unit.m2ToCm2(inputFieldValue);
                            break;
                        case "Hectárea":
                            outputValue = Unit.m2ToHectarea(inputFieldValue);
                            break;
                        case "Acre":
                            outputValue = Unit.m2ToAcre(inputFieldValue);
                            break;
                        case "Pie cuadrado":
                            outputValue = Unit.m2ToPie2(inputFieldValue);
                            break;
                        case "Yarda cuadrada":
                            outputValue = Unit.m2ToYarda2(inputFieldValue);
                            break;
                        case "Milla cuadrada":
                            outputValue = Unit.m2ToMilla2(inputFieldValue);
                            break;
                    }

                }
                if(inputUnit.equals("Centímetro cuadrado")) {
                    switch(outputUnit) {
                        case "Kilómetro cuadrado":
                            outputValue = Unit.cm2ToKm2(inputFieldValue);
                            break;
                        case "Metro cuadrado":
                            outputValue = Unit.cm2ToM2(inputFieldValue);
                            break;
                        case "Centímetro cuadrado":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Hectárea":
                            outputValue = Unit.cm2ToHectarea(inputFieldValue);
                            break;
                        case "Acre":
                            outputValue = Unit.cm2ToAcre(inputFieldValue);
                            break;
                        case "Pie cuadrado":
                            outputValue = Unit.cm2ToPie2(inputFieldValue);
                            break;
                        case "Yarda cuadrada":
                            outputValue = Unit.cm2ToYarda2(inputFieldValue);
                            break;
                        case "Milla cuadrada":
                            outputValue = Unit.cm2ToMilla2(inputFieldValue);
                            break;
                    }

                }
                if(inputUnit.equals("Hectárea")) {
                    switch(outputUnit) {
                        case "Kilómetro cuadrado":
                            outputValue = Unit.hectareaToKm2(inputFieldValue);
                            break;
                        case "Metro cuadrado":
                            outputValue = Unit.hectareaToM2(inputFieldValue);
                            break;
                        case "Centímetro cuadrado":
                            outputValue = Unit.hectareaToCm2(inputFieldValue);
                            break;
                        case "Hectárea":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Acre":
                            outputValue = Unit.hectareaToAcre(inputFieldValue);
                            break;
                        case "Pie cuadrado":
                            outputValue = Unit.hectareaToPie2(inputFieldValue);
                            break;
                        case "Yarda cuadrada":
                            outputValue = Unit.hectareaToYarda2(inputFieldValue);
                            break;
                        case "Milla cuadrada":
                            outputValue = Unit.hectareaToMilla2(inputFieldValue);
                            break;
                    }

                }
                if(inputUnit.equals("Acre")) {
                    switch(outputUnit) {
                        case "Kilómetro cuadrado":
                            outputValue = Unit.acreToKm2(inputFieldValue);
                            break;
                        case "Metro cuadrado":
                            outputValue = Unit.acreToM2(inputFieldValue);
                            break;
                        case "Centímetro cuadrado":
                            outputValue = Unit.acreToCm2(inputFieldValue);
                            break;
                        case "Hectárea":
                            outputValue = Unit.acreToHectarea(inputFieldValue);
                            break;
                        case "Acre":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Pie cuadrado":
                            outputValue = Unit.acreToPie2(inputFieldValue);
                            break;
                        case "Yarda cuadrada":
                            outputValue = Unit.acreToYarda2(inputFieldValue);
                            break;
                        case "Milla cuadrada":
                            outputValue = Unit.acreToMilla2(inputFieldValue);
                            break;
                    }

                }
                if(inputUnit.equals("Pie cuadrado")) {
                    switch(outputUnit) {
                        case "Kilómetro cuadrado":
                            outputValue = Unit.pie2ToKm2(inputFieldValue);
                            break;
                        case "Metro cuadrado":
                            outputValue = Unit.pie2ToM2(inputFieldValue);
                            break;
                        case "Centímetro cuadrado":
                            outputValue = Unit.pie2ToCm2(inputFieldValue);
                            break;
                        case "Hectárea":
                            outputValue = Unit.pie2ToHectarea(inputFieldValue);
                            break;
                        case "Acre":
                            outputValue = Unit.pie2ToAcre(inputFieldValue);
                            break;
                        case "Pie cuadrado":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Yarda cuadrada":
                            outputValue = Unit.pie2ToYarda2(inputFieldValue);
                            break;
                        case "Milla cuadrada":
                            outputValue = Unit.pie2ToMilla2(inputFieldValue);
                            break;
                    }

                }
                if(inputUnit.equals("Yarda cuadrada")) {
                    switch(outputUnit) {
                        case "Kilómetro cuadrado":
                            outputValue = Unit.yarda2ToKm2(inputFieldValue);
                            break;
                        case "Metro cuadrado":
                            outputValue = Unit.yarda2ToM2(inputFieldValue);
                            break;
                        case "Centímetro cuadrado":
                            outputValue = Unit.yarda2ToCm2(inputFieldValue);
                            break;
                        case "Hectárea":
                            outputValue = Unit.yarda2ToHectarea(inputFieldValue);
                            break;
                        case "Acre":
                            outputValue = Unit.yarda2ToAcre(inputFieldValue);
                            break;
                        case "Pie cuadrado":
                            outputValue = Unit.yarda2ToPie2(inputFieldValue);
                            break;
                        case "Yarda cuadrada":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Milla cuadrada":
                            outputValue = Unit.yarda2ToMilla2(inputFieldValue);
                            break;
                    }

                }
                if(inputUnit.equals("Milla cuadrada")) {
                    switch(outputUnit) {
                        case "Kilómetro cuadrado":
                            outputValue = Unit.milla2ToKm2(inputFieldValue);
                            break;
                        case "Metro cuadrado":
                            outputValue = Unit.milla2ToM2(inputFieldValue);
                            break;
                        case "Centímetro cuadrado":
                            outputValue = Unit.milla2ToCm2(inputFieldValue);
                            break;
                        case "Hectárea":
                            outputValue = Unit.milla2ToHectarea(inputFieldValue);
                            break;
                        case "Acre":
                            outputValue = Unit.milla2ToAcre(inputFieldValue);
                            break;
                        case "Pie cuadrado":
                            outputValue = Unit.milla2ToPie2(inputFieldValue);
                            break;
                        case "Yarda cuadrada":
                            outputValue = Unit.milla2ToYarda2(inputFieldValue);
                            break;
                        case "Milla cuadrada":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }

                }
                break;
            case "Masa":
                if(inputUnit.equals("Kilogramos")) {
                    switch (outputUnit) {
                        case "Kilogramos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Gramos":
                            outputValue = Unit.kilogramosToGramos(inputFieldValue);
                            break;
                        case "Miligramos":
                            outputValue = Unit.kilogramosToMiligramos(inputFieldValue);
                            break;
                        case "Unidad de masa atómica":
                            outputValue = Unit.kilogramosToUdMasaAtom(inputFieldValue);
                            break;
                        case "Toneladas":
                            outputValue = Unit.kilogramosToToneladas(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.kilogramosToKilonewtons(inputFieldValue);
                            break;
                        case "Libras":
                            outputValue = Unit.kilogramosToLibras(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Gramos")) {
                    switch (outputUnit) {
                        case "Kilogramos":
                            outputValue = Unit.gramosToKilogramos(inputFieldValue);
                            break;
                        case "Gramos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Miligramos":
                            outputValue = Unit.gramosToMiligramos(inputFieldValue);
                            break;
                        case "Unidad de masa atómica":
                            outputValue = Unit.gramosToUdMasaAtom(inputFieldValue);
                            break;
                        case "Toneladas":
                            outputValue = Unit.gramosToToneladas(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.gramosToKilonewtons(inputFieldValue);
                            break;
                        case "Libras":
                            outputValue = Unit.gramosToLibras(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Miligramos")) {
                    switch (outputUnit) {
                        case "Kilogramos":
                            outputValue = Unit.miligramosToKilogramos(inputFieldValue);
                            break;
                        case "Gramos":
                            outputValue = Unit.miligramosToGramos(inputFieldValue);
                            break;
                        case "Miligramos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Unidad de masa atómica":
                            outputValue = Unit.miligramosToUdMasaAtom(inputFieldValue);
                            break;
                        case "Toneladas":
                            outputValue = Unit.miligramosToToneladas(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.miligramosToKilonewtons(inputFieldValue);
                            break;
                        case "Libras":
                            outputValue = Unit.miligramosToLibras(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Unidad de masa atómica")) {
                    switch (outputUnit) {
                        case "Kilogramos":
                            outputValue = Unit.udMasaAtomToKilogramos(inputFieldValue);
                            break;
                        case "Gramos":
                            outputValue = Unit.udMasaAtomToGramos(inputFieldValue);
                            break;
                        case "Miligramos":
                            outputValue = Unit.udMasaAtomToMiligramos(inputFieldValue);
                            break;
                        case "Unidad de masa atómica":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Toneladas":
                            outputValue = Unit.udMasaAtomToToneladas(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.udMasaAtomToKilonewtons(inputFieldValue);
                            break;
                        case "Libras":
                            outputValue = Unit.udMasaAtomToLibras(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Toneladas")) {
                    switch (outputUnit) {
                        case "Kilogramos":
                            outputValue = Unit.toneladasToKilogramos(inputFieldValue);
                            break;
                        case "Gramos":
                            outputValue = Unit.toneladasToGramos(inputFieldValue);
                            break;
                        case "Miligramos":
                            outputValue = Unit.toneladasToMiligramos(inputFieldValue);
                            break;
                        case "Unidad de masa atómica":
                            outputValue = Unit.toneladasToUdMasaAtom(inputFieldValue);
                            break;
                        case "Toneladas":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.toneladasToKilonewtons(inputFieldValue);
                            break;
                        case "Libras":
                            outputValue = Unit.toneladasToLibras(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Kilonewtons")) {
                    switch (outputUnit) {
                        case "Kilogramos":
                            outputValue = Unit.kilonewtonsToKilogramos(inputFieldValue);
                            break;
                        case "Gramos":
                            outputValue = Unit.kilonewtonsToGramos(inputFieldValue);
                            break;
                        case "Miligramos":
                            outputValue = Unit.kilonewtonsToMiligramos(inputFieldValue);
                            break;
                        case "Unidad de masa atómica":
                            outputValue = Unit.kilonewtonsToUdMasaAtom(inputFieldValue);
                            break;
                        case "Toneladas":
                            outputValue = Unit.kilonewtonsToToneladas(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Libras":
                            outputValue = Unit.kilonewtonsToLibras(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Libras")) {
                    switch (outputUnit) {
                        case "Kilogramos":
                            outputValue = Unit.librasToKilogramos(inputFieldValue);
                            break;
                        case "Gramos":
                            outputValue = Unit.librasToGramos(inputFieldValue);
                            break;
                        case "Miligramos":
                            outputValue = Unit.librasToMiligramos(inputFieldValue);
                            break;
                        case "Unidad de masa atómica":
                            outputValue = Unit.librasToUdMasaAtom(inputFieldValue);
                            break;
                        case "Toneladas":
                            outputValue = Unit.librasToToneladas(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.librasToKilonewtons(inputFieldValue);
                            break;
                        case "Libras":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }
                }
                break;
            case "Velocidad":
                if(inputUnit.equals("Kilómetros por segundo")) {
                    switch (outputUnit) {
                        case "Kilómetros por segundo":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Metros por segundo":
                            outputValue = Unit.kmsToMs(inputFieldValue);
                            break;
                        case "Kilómetros por minuto":
                            outputValue = Unit.kmsToKmm(inputFieldValue);
                            break;
                        case "Metros por minuto":
                            outputValue = Unit.kmsToMm(inputFieldValue);
                            break;
                        case "Kilómetros por hora":
                            outputValue = Unit.kmsToKmh(inputFieldValue);
                            break;
                        case "Metros por hora":
                            outputValue = Unit.kmsToMh(inputFieldValue);
                            break;
                        case "Milla por hora":
                            outputValue = Unit.kmsToMph(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Metros por segundo")) {
                    switch (outputUnit) {
                        case "Kilómetros por segundo":
                            outputValue = Unit.msToKms(inputFieldValue);
                            break;
                        case "Metros por segundo":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Kilómetros por minuto":
                            outputValue = Unit.msToKmm(inputFieldValue);
                            break;
                        case "Metros por minuto":
                            outputValue = Unit.msToMm(inputFieldValue);
                            break;
                        case "Kilómetros por hora":
                            outputValue = Unit.msToKmh(inputFieldValue);
                            break;
                        case "Metros por hora":
                            outputValue = Unit.msToMh(inputFieldValue);
                            break;
                        case "Milla por hora":
                            outputValue = Unit.msToMph(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Kilómetros por minuto")) {
                    switch (outputUnit) {
                        case "Kilómetros por segundo":
                            outputValue = Unit.kmmToKms(inputFieldValue);
                            break;
                        case "Metros por segundo":
                            outputValue = Unit.kmmToMs(inputFieldValue);
                            break;
                        case "Kilómetros por minuto":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Metros por minuto":
                            outputValue = Unit.kmmToMm(inputFieldValue);
                            break;
                        case "Kilómetros por hora":
                            outputValue = Unit.kmmToKmh(inputFieldValue);
                            break;
                        case "Metros por hora":
                            outputValue = Unit.kmmToMh(inputFieldValue);
                            break;
                        case "Milla por hora":
                            outputValue = Unit.kmmToMph(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Metros por minuto")) {
                    switch (outputUnit) {
                        case "Kilómetros por segundo":
                            outputValue = Unit.mmToKms(inputFieldValue);
                            break;
                        case "Metros por segundo":
                            outputValue = Unit.mmToMs(inputFieldValue);
                            break;
                        case "Kilómetros por minuto":
                            outputValue = Unit.mmToKmm(inputFieldValue);
                            break;
                        case "Metros por minuto":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Kilómetros por hora":
                            outputValue = Unit.mmToKmh(inputFieldValue);
                            break;
                        case "Metros por hora":
                            outputValue = Unit.mmToMh(inputFieldValue);
                            break;
                        case "Milla por hora":
                            outputValue = Unit.mmToMph(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Kilómetros por hora")) {
                    switch (outputUnit) {
                        case "Kilómetros por segundo":
                            outputValue = Unit.kmhToKms(inputFieldValue);
                            break;
                        case "Metros por segundo":
                            outputValue = Unit.kmhToMs(inputFieldValue);
                            break;
                        case "Kilómetros por minuto":
                            outputValue = Unit.kmhToKmm(inputFieldValue);
                            break;
                        case "Metros por minuto":
                            outputValue = Unit.kmhToMm(inputFieldValue);
                            break;
                        case "Kilómetros por hora":
                            outputValue =  Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Metros por hora":
                            outputValue = Unit.kmhToMh(inputFieldValue);
                            break;
                        case "Milla por hora":
                            outputValue = Unit.kmhToMph(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Metros por hora")) {
                    switch (outputUnit) {
                        case "Kilómetros por segundo":
                            outputValue = Unit.mhToKms(inputFieldValue);
                            break;
                        case "Metros por segundo":
                            outputValue = Unit.mhToMs(inputFieldValue);
                            break;
                        case "Kilómetros por minuto":
                            outputValue = Unit.mhToKmm(inputFieldValue);
                            break;
                        case "Metros por minuto":
                            outputValue = Unit.mhToMm(inputFieldValue);
                            break;
                        case "Kilómetros por hora":
                            outputValue = Unit.mhToKmh(inputFieldValue);
                            break;
                        case "Metros por hora":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Milla por hora":
                            outputValue = Unit.mhToMph(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Milla por hora")) {
                    switch (outputUnit) {
                        case "Kilómetros por segundo":
                            outputValue = Unit.mphToKms(inputFieldValue);
                            break;
                        case "Metros por segundo":
                            outputValue = Unit.mphToMs(inputFieldValue);
                            break;
                        case "Kilómetros por minuto":
                            outputValue = Unit.mphToKmm(inputFieldValue);
                            break;
                        case "Metros por minuto":
                            outputValue = Unit.mphToMm(inputFieldValue);
                            break;
                        case "Kilómetros por hora":
                            outputValue = Unit.mphToKmh(inputFieldValue);
                            break;
                        case "Metros por hora":
                            outputValue = Unit.mphToMh(inputFieldValue);
                            break;
                        case "Milla por hora":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }
                }
                break;
            case "Tiempo":
                if(inputUnit.equals("Segundos")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Minutos":
                            outputValue = Unit.segundosToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Unit.segundosToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Unit.segundosToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Unit.segundosToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Unit.segundosToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Unit.segundosToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Unit.segundosToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Unit.segundosToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.segundosToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Minutos")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.minutosToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Horas":
                            outputValue = Unit.minutosToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Unit.minutosToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Unit.minutosToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Unit.minutosToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Unit.minutosToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Unit.minutosToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Unit.minutosToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.minutosToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Horas")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.horasToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Unit.horasToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Días":
                            outputValue = Unit.horasToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Unit.horasToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Unit.horasToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Unit.horasToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Unit.horasToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Unit.horasToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.horasToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Días")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.diasToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Unit.diasToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Unit.diasToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Semanas":
                            outputValue = Unit.diasToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Unit.diasToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Unit.diasToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Unit.diasToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Unit.diasToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.diasToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Semanas")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.semanasToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Unit.semanasToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Unit.semanasToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Unit.semanasToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Meses":
                            outputValue = Unit.semanasToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Unit.semanasToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Unit.semanasToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Unit.semanasToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.semanasToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Meses")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.mesesToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Unit.mesesToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Unit.mesesToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Unit.mesesToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Unit.mesesToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Años":
                            outputValue = Unit.mesesToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Unit.mesesToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Unit.mesesToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.mesesToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("anios")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.aniosToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Unit.aniosToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Unit.aniosToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Unit.aniosToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Unit.aniosToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Unit.aniosToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Milisegundos":
                            outputValue = Unit.aniosToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Unit.aniosToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.aniosToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Milisegundos")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.milisegundosToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Unit.milisegundosToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Unit.milisegundosToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Unit.milisegundosToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Unit.milisegundosToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Unit.milisegundosToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Unit.milisegundosToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Microsegundos":
                            outputValue = Unit.milisegundosToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.milisegundosToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Microsegundos")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.microsegundosToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Unit.microsegundosToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Unit.microsegundosToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Unit.microsegundosToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Unit.microsegundosToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Unit.microsegundosToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Unit.microsegundosToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Unit.microsegundosToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Nanosegundos":
                            outputValue = Unit.microsegundosToNanosegundos(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Nanosegundos")) {
                    switch (outputUnit) {
                        case "Segundos":
                            outputValue = Unit.nanosegundosToSegundos(inputFieldValue);
                            break;
                        case "Minutos":
                            outputValue = Unit.nanosegundosToMinutos(inputFieldValue);
                            break;
                        case "Horas":
                            outputValue = Unit.nanosegundosToHoras(inputFieldValue);
                            break;
                        case "Días":
                            outputValue = Unit.nanosegundosToDias(inputFieldValue);
                            break;
                        case "Semanas":
                            outputValue = Unit.nanosegundosToSemanas(inputFieldValue);
                            break;
                        case "Meses":
                            outputValue = Unit.nanosegundosToMeses(inputFieldValue);
                            break;
                        case "Años":
                            outputValue = Unit.nanosegundosToAnios(inputFieldValue);
                            break;
                        case "Milisegundos":
                            outputValue = Unit.nanosegundosToMilisegundos(inputFieldValue);
                            break;
                        case "Microsegundos":
                            outputValue = Unit.nanosegundosToMicrosegundos(inputFieldValue);
                            break;
                        case "Nanosegundos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }
                }
                break;
            case "Fuerza":
                if(inputUnit.equals("Newtons")) {
                    switch (outputUnit) {
                        case "Newtons":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.newtonsToKilonewtons(inputFieldValue);
                            break;
                        case "Meganewtons":
                            outputValue = Unit.newtonsToMeganewtons(inputFieldValue);
                            break;
                        case "Milinewtons":
                            outputValue = Unit.newtonsToMilinewtons(inputFieldValue);
                            break;
                        case "Micronewtons":
                            outputValue = Unit.newtonsToMicronewtons(inputFieldValue);
                            break;
                        case "Kilogramos-fuerza":
                            outputValue = Unit.newtonsToKgFuerza(inputFieldValue);
                            break;
                        case "Libras-fuerza":
                            outputValue = Unit.newtonsToLbFuerza(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Meganewtons")) {
                    switch (outputUnit) {
                        case "Newtons":
                            outputValue = Unit.meganewtonsToNewtons(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.meganewtonsToKilonewtons(inputFieldValue);
                            break;
                        case "Meganewtons":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Milinewtons":
                            outputValue = Unit.meganewtonsToMilinewtons(inputFieldValue);
                            break;
                        case "Micronewtons":
                            outputValue = Unit.meganewtonsToMicronewtons(inputFieldValue);
                            break;
                        case "Kilogramos-fuerza":
                            outputValue = Unit.meganewtonsToKgFuerza(inputFieldValue);
                            break;
                        case "Libras-fuerza":
                            outputValue = Unit.meganewtonsToLbFuerza(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Kilonewtons")) {
                    switch (outputUnit) {
                        case "Newtons":
                            outputValue = Unit.kilonewtonsToNewtons(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Meganewtons":
                            outputValue = Unit.kilonewtonsToMeganewtons(inputFieldValue);
                            break;
                        case "Milinewtons":
                            outputValue = Unit.kilonewtonsToMilinewtons(inputFieldValue);
                            break;
                        case "Micronewtons":
                            outputValue = Unit.kilonewtonsToMicronewtons(inputFieldValue);
                            break;
                        case "Kilogramos-fuerza":
                            outputValue = Unit.kilonewtonsToKgFuerza(inputFieldValue);
                            break;
                        case "Libras-fuerza":
                            outputValue = Unit.kilonewtonsToLbFuerza(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Milinewtons")) {
                    switch (outputUnit) {
                        case "Newtons":
                            outputValue = Unit.milinewtonsToNewtons(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.milinewtonsToKilonewtons(inputFieldValue);
                            break;
                        case "Meganewtons":
                            outputValue = Unit.milinewtonsToMeganewtons(inputFieldValue);
                            break;
                        case "Milinewtons":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Micronewtons":
                            outputValue = Unit.milinewtonsToMicronewtons(inputFieldValue);
                            break;
                        case "Kilogramos-fuerza":
                            outputValue = Unit.milinewtonsToKgFuerza(inputFieldValue);
                            break;
                        case "Libras-fuerza":
                            outputValue = Unit.milinewtonsToLbFuerza(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Micronewtons")) {
                    switch (outputUnit) {
                        case "Newtons":
                            outputValue = Unit.micronewtonsToNewtons(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.micronewtonsToKilonewtons(inputFieldValue);
                            break;
                        case "Meganewtons":
                            outputValue = Unit.micronewtonsToMeganewtons(inputFieldValue);
                            break;
                        case "Milinewtons":
                            outputValue = Unit.micronewtonsToMilinewtons(inputFieldValue);
                            break;
                        case "Micronewtons":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Kilogramos-fuerza":
                            outputValue = Unit.micronewtonsToKgFuerza(inputFieldValue);
                            break;
                        case "Libras-fuerza":
                            outputValue = Unit.micronewtonsToLbFuerza(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Kilogramos-fuerza")) {
                    switch (outputUnit) {
                        case "Newtons":
                            outputValue = Unit.kgFuerzaToNewtons(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.kgFuerzaToKilonewtons(inputFieldValue);
                            break;
                        case "Meganewtons":
                            outputValue = Unit.kgFuerzaToMeganewtons(inputFieldValue);
                            break;
                        case "Milinewtons":
                            outputValue = Unit.kgFuerzaToMilinewtons(inputFieldValue);
                            break;
                        case "Micronewtons":
                            outputValue = Unit.kgFuerzaToMicronewtons(inputFieldValue);
                            break;
                        case "Kilogramos-fuerza":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Libras-fuerza":
                            outputValue = Unit.kgFuerzaToLbFuerza(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Libras-fuerza")) {
                    switch (outputUnit) {
                        case "Newtons":
                            outputValue = Unit.lbFuerzaToNewtons(inputFieldValue);
                            break;
                        case "Kilonewtons":
                            outputValue = Unit.lbFuerzaToKilonewtons(inputFieldValue);
                            break;
                        case "Meganewtons":
                            outputValue = Unit.lbFuerzaToMeganewtons(inputFieldValue);
                            break;
                        case "Milinewtons":
                            outputValue = Unit.lbFuerzaToMilinewtons(inputFieldValue);
                            break;
                        case "Micronewtons":
                            outputValue = Unit.lbFuerzaToMicronewtons(inputFieldValue);
                            break;
                        case "Kilogramos-fuerza":
                            outputValue = Unit.lbFuerzaToKgFuerza(inputFieldValue);
                            break;
                        case "Libras-fuerza":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }
                }
                break;
            case "Volumen":
                if(inputUnit.equals("Litros")) {
                    switch (outputUnit) {
                        case "Litros":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Mililitros":
                            outputValue = Unit.litrosToMililitros(inputFieldValue);
                            break;
                        case "Metros cúbicos":
                            outputValue = Unit.litrosToMetros3(inputFieldValue);
                            break;
                        case "Centímetros cúbicos":
                            outputValue = Unit.litrosToCentimetros3(inputFieldValue);
                            break;
                        case "UKGalones":
                            outputValue = Unit.litrosToUKGalones(inputFieldValue);
                            break;
                        case "USGalones":
                            outputValue = Unit.litrosToUSGalones(inputFieldValue);
                            break;
                        case "Pulgadas cúbicas":
                            outputValue = Unit.litrosToPulgadas3(inputFieldValue);
                            break;
                        case "Pies cúbicos":
                            outputValue = Unit.litrosToPies3(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Mililitros")) {
                    switch (outputUnit) {
                        case "Litros":
                            outputValue = Unit.mililitrosToLitros(inputFieldValue);
                            break;
                        case "Mililitros":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Metros cúbicos":
                            outputValue = Unit.mililitrosToMetros3(inputFieldValue);
                            break;
                        case "Centímetros cúbicos":
                            outputValue = Unit.mililitrosToCentimetros3(inputFieldValue);
                            break;
                        case "UKGalones":
                            outputValue = Unit.mililitrosToUKGalones(inputFieldValue);
                            break;
                        case "USGalones":
                            outputValue = Unit.mililitrosToUSGalones(inputFieldValue);
                            break;
                        case "Pulgadas cúbicas":
                            outputValue = Unit.mililitrosToPulgadas3(inputFieldValue);
                            break;
                        case "Pies cúbicos":
                            outputValue = Unit.mililitrosToPies3(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Metros cúbicos")) {
                    switch (outputUnit) {
                        case "Litros":
                            outputValue = Unit.metros3ToLitros(inputFieldValue);
                            break;
                        case "Mililitros":
                            outputValue = Unit.metros3ToMililitros(inputFieldValue);
                            break;
                        case "Metros cúbicos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Centímetros cúbicos":
                            outputValue = Unit.metros3ToCentimetros3(inputFieldValue);
                            break;
                        case "UKGalones":
                            outputValue = Unit.metros3ToUKGalones(inputFieldValue);
                            break;
                        case "USGalones":
                            outputValue = Unit.metros3ToUSGalones(inputFieldValue);
                            break;
                        case "Pulgadas cúbicas":
                            outputValue = Unit.metros3ToPulgadas3(inputFieldValue);
                            break;
                        case "Pies cúbicos":
                            outputValue = Unit.metros3ToPies3(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Centímetros cúbicos")) {
                    switch (outputUnit) {
                        case "Litros":
                            outputValue = Unit.centimetros3ToLitros(inputFieldValue);
                            break;
                        case "Mililitros":
                            outputValue = Unit.centimetros3ToMililitros(inputFieldValue);
                            break;
                        case "Metros cúbicos":
                            outputValue = Unit.centimetros3ToMetros3(inputFieldValue);
                            break;
                        case "Centímetros cúbicos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "UKGalones":
                            outputValue = Unit.centimetros3ToUKGalones(inputFieldValue);
                            break;
                        case "USGalones":
                            outputValue = Unit.centimetros3ToUSGalones(inputFieldValue);
                            break;
                        case "Pulgadas cúbicas":
                            outputValue = Unit.centimetros3ToPulgadas3(inputFieldValue);
                            break;
                        case "Pies cúbicos":
                            outputValue = Unit.centimetros3ToPies3(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("UKGalones")) {
                    switch (outputUnit) {
                        case "Litros":
                            outputValue = Unit.ukgalonesToLitros(inputFieldValue);
                            break;
                        case "Mililitros":
                            outputValue = Unit.ukgalonesToMililitros(inputFieldValue);
                            break;
                        case "Metros cúbicos":
                            outputValue = Unit.ukgalonesToMetros3(inputFieldValue);
                            break;
                        case "Centímetros cúbicos":
                            outputValue = Unit.ukgalonesToCentimetros3(inputFieldValue);
                            break;
                        case "UKGalones":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "USGalones":
                            outputValue = Unit.ukgalonesToUSGalones(inputFieldValue);
                            break;
                        case "Pulgadas cúbicas":
                            outputValue = Unit.ukgalonesToPulgadas3(inputFieldValue);
                            break;
                        case "Pies cúbicos":
                            outputValue = Unit.ukgalonesToPies3(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("USGalones")) {
                    switch (outputUnit) {
                        case "Litros":
                            outputValue = Unit.usgalonesToLitros(inputFieldValue);
                            break;
                        case "Mililitros":
                            outputValue = Unit.usgalonesToMililitros(inputFieldValue);
                            break;
                        case "Metros cúbicos":
                            outputValue = Unit.usgalonesToMetros3(inputFieldValue);
                            break;
                        case "Centímetros cúbicos":
                            outputValue = Unit.usgalonesToCentimetros3(inputFieldValue);
                            break;
                        case "UKGalones":
                            outputValue = Unit.usgalonesToUKGalones(inputFieldValue);
                            break;
                        case "USGalones":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Pulgadas cúbicas":
                            outputValue = Unit.usgalonesToPulgadas3(inputFieldValue);
                            break;
                        case "Pies cúbicos":
                            outputValue = Unit.usgalonesToPies3(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Pulgadas cúbicas")) {
                    switch (outputUnit) {
                        case "Litros":
                            outputValue = Unit.pulgadas3ToLitros(inputFieldValue);
                            break;
                        case "Mililitros":
                            outputValue = Unit.pulgadas3ToMililitros(inputFieldValue);
                            break;
                        case "Metros cúbicos":
                            outputValue = Unit.pulgadas3ToMetros3(inputFieldValue);
                            break;
                        case "Centímetros cúbicos":
                            outputValue = Unit.pulgadas3ToCentimetros3(inputFieldValue);
                            break;
                        case "UKGalones":
                            outputValue = Unit.pulgadas3ToUKGalones(inputFieldValue);
                            break;
                        case "USGalones":
                            outputValue = Unit.pulgadas3ToUSGalones(inputFieldValue);
                            break;
                        case "Pulgadas cúbicas":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Pies cúbicos":
                            outputValue = Unit.pulgadas3ToPies3(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Pies cúbicos")) {
                    switch (outputUnit) {
                        case "Litros":
                            outputValue = Unit.pies3ToLitros(inputFieldValue);
                            break;
                        case "Mililitros":
                            outputValue = Unit.pies3ToMililitros(inputFieldValue);
                            break;
                        case "Metros cúbicos":
                            outputValue = Unit.pies3ToMetros3(inputFieldValue);
                            break;
                        case "Centímetros cúbicos":
                            outputValue = Unit.pies3ToCentimetros3(inputFieldValue);
                            break;
                        case "UKGalones":
                            outputValue = Unit.pies3ToUKGalones(inputFieldValue);
                            break;
                        case "USGalones":
                            outputValue = Unit.pies3ToUSGalones(inputFieldValue);
                            break;
                        case "Pulgadas cúbicas":
                            outputValue = Unit.pies3ToPulgadas3(inputFieldValue);
                            break;
                        case "Pies cúbicos":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }
                }
                break;
            case "Presión":
                if(inputUnit.equals("Bar")) {
                    switch (outputUnit) {
                        case "Bar":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Pascal":
                            outputValue = Unit.barToPascal(inputFieldValue);
                            break;
                        case "Libras por pulgada cuadrada":
                            outputValue = Unit.barToPsi(inputFieldValue);
                            break;
                        case "Torr":
                            outputValue = Unit.barToTorr(inputFieldValue);
                            break;
                        case "Atmósfera":
                            outputValue = Unit.barToAtm(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Pascal")) {
                    switch (outputUnit) {
                        case "Bar":
                            outputValue = Unit.pascalToBar(inputFieldValue);
                            break;
                        case "Pascal":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Libras por pulgada cuadrada":
                            outputValue = Unit.pascalToPsi(inputFieldValue);
                            break;
                        case "Torr":
                            outputValue = Unit.pascalToTorr(inputFieldValue);
                            break;
                        case "Atmósfera":
                            outputValue = Unit.pascalToAtm(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Libras por pulgada cuadrada")) {
                    switch (outputUnit) {
                        case "Bar":
                            outputValue = Unit.psiToBar(inputFieldValue);
                            break;
                        case "Pascal":
                            outputValue = Unit.psiToPascal(inputFieldValue);
                            break;
                        case "Libras por pulgada cuadrada":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Torr":
                            outputValue = Unit.psiToTorr(inputFieldValue);
                            break;
                        case "Atmósfera":
                            outputValue = Unit.psiToAtm(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Torr")) {
                    switch (outputUnit) {
                        case "Bar":
                            outputValue = Unit.torrToBar(inputFieldValue);
                            break;
                        case "Pascal":
                            outputValue = Unit.torrToPascal(inputFieldValue);
                            break;
                        case "Libras por pulgada cuadrada":
                            outputValue = Unit.torrToPsi(inputFieldValue);
                            break;
                        case "Torr":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Atmósfera":
                            outputValue = Unit.torrToAtm(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Atmósfera")) {
                    switch (outputUnit) {
                        case "Bar":
                            outputValue = Unit.atmToBar(inputFieldValue);
                            break;
                        case "Pascal":
                            outputValue = Unit.atmToPascal(inputFieldValue);
                            break;
                        case "Libras por pulgada cuadrada":
                            outputValue = Unit.atmToPsi(inputFieldValue);
                            break;
                        case "Torr":
                            outputValue = Unit.atmToTorr(inputFieldValue);
                            break;
                        case "Atmósfera":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }
                }
                break;
            case "Energía y trabajo":
                if(inputUnit.equals("Julios")) {
                    switch (outputUnit) {
                        case "Julios":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Kilocalorías":
                            outputValue = Unit.juliosToKilocalorias(inputFieldValue);
                            break;
                        case "Calorías":
                            outputValue = Unit.juliosToCalorias(inputFieldValue);
                            break;
                        case "Kilovatios-hora":
                            outputValue = Unit.juliosToKilovatiosh(inputFieldValue);
                            break;
                        case "Electronvoltios":
                            outputValue = Unit.juliosToElectronvoltios(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Kilocalorías")) {
                    switch (outputUnit) {
                        case "Julios":
                            outputValue = Unit.kilocaloriasToJulios(inputFieldValue);
                            break;
                        case "Kilocalorías":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Calorías":
                            outputValue = Unit.kilocaloriasToCalorias(inputFieldValue);
                            break;
                        case "Kilovatios-hora":
                            outputValue = Unit.kilocaloriasToKilovatiosh(inputFieldValue);
                            break;
                        case "Electronvoltios":
                            outputValue = Unit.kilocaloriasToElectronvoltios(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Calorías")) {
                    switch (outputUnit) {
                        case "Julios":
                            outputValue = Unit.caloriasToJulios(inputFieldValue);
                            break;
                        case "Kilocalorías":
                            outputValue = Unit.caloriasToKilocalorias(inputFieldValue);
                            break;
                        case "Calorías":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Kilovatios-hora":
                            outputValue = Unit.caloriasToKilovatiosh(inputFieldValue);
                            break;
                        case "Electronvoltios":
                            outputValue = Unit.caloriasToElectronvoltios(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Kilovatios-hora")) {
                    switch (outputUnit) {
                        case "Julios":
                            outputValue = Unit.kilovatioshToJulios(inputFieldValue);
                            break;
                        case "Kilocalorías":
                            outputValue = Unit.kilovatioshToKilocalorias(inputFieldValue);
                            break;
                        case "Calorías":
                            outputValue = Unit.kilovatioshToCalorias(inputFieldValue);
                            break;
                        case "Kilovatios-hora":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                        case "Electronvoltios":
                            outputValue = Unit.kilovatioshToElectronvoltios(inputFieldValue);
                            break;
                    }
                }
                if(inputUnit.equals("Electronvoltios")) {
                    switch (outputUnit) {
                        case "Julios":
                            outputValue = Unit.electronvoltiosToJulios(inputFieldValue);
                            break;
                        case "Kilocalorías":
                            outputValue = Unit.electronvoltiosToKilocalorias(inputFieldValue);
                            break;
                        case "Calorías":
                            outputValue = Unit.electronvoltiosToCalorias(inputFieldValue);
                            break;
                        case "Kilovatios-hora":
                            outputValue = Unit.electronvoltiosToKilovatiosh(inputFieldValue);
                            break;
                        case "Electronvoltios":
                            outputValue = Double.parseDouble(inputFieldValue.toString());
                            break;
                    }
                }

            default:
        }
        return outputValue;
    }


    /**
     * Métodos de conversión para temperatura. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Temperatura
    //---------------------------------------------------------------------------------------------------------------------------
    static Double celsiusToFahrenheit(Double c) {return Double.parseDouble(c.toString()) * (9.0/5.0) + 32.0;}
    static Double celsiusToKelvin(Double c) {return Double.parseDouble(c.toString()) + 273.15;}

    static Double fahrenheitToCelsius(Double c) {return (Double.parseDouble(c.toString()) - 32.0) * (5.0/9.0);}
    static Double fahrenheitToKelvin(Double c) {return (Double.parseDouble(c.toString()) - 32.0) / 1.8 + 273.15;}

    static Double kelvinToCelsius(Double c) {return Double.parseDouble(c.toString()) - 273.15;}
    static Double kelvinToFahrenheit(Double c) {return Double.parseDouble(c.toString()) * 1.8 - 459.67;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para longitud. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Longitud
    //---------------------------------------------------------------------------------------------------------------------------
    static Double kilometrosToMetros(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double kilometrosToCentimetros(Double c) {return Double.parseDouble(c.toString()) * 100000.0;}
    static Double kilometrosToPulgadas(Double c) {return Double.parseDouble(c.toString()) * 39370.0;}
    static Double kilometrosToPies(Double c) {return Double.parseDouble(c.toString()) * 3281.0;}
    static Double kilometrosToYardas(Double c) {return Double.parseDouble(c.toString()) * 1094.0;}
    static Double kilometrosToMillas(Double c) {return Double.parseDouble(c.toString()) * 0.6214;}
    static Double kilometrosToAniosLuz(Double c) {return Double.parseDouble(c.toString()) * 0.0000000000001057;}

    static Double metrosToKilometros(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double metrosToCentimetros(Double c) {return Double.parseDouble(c.toString()) * 100.0;}
    static Double metrosToPulgadas(Double c) {return Double.parseDouble(c.toString()) * 39.37;}
    static Double metrosToPies(Double c) {return Double.parseDouble(c.toString()) * 3.281;}
    static Double metrosToYardas(Double c) {return Double.parseDouble(c.toString()) * 1.094;}
    static Double metrosToMillas(Double c) {return Double.parseDouble(c.toString()) * 0.0006214;}
    static Double metrosToAniosLuz(Double c) {return Double.parseDouble(c.toString()) * 1.057e-16;}

    static Double centimetrosToKilometros(Double c) {return Double.parseDouble(c.toString()) * 0.00001;}
    static Double centimetrosToMetros(Double c) {return Double.parseDouble(c.toString()) * 0.01;}
    static Double centimetrosToPulgadas(Double c) {return Double.parseDouble(c.toString()) * 0.3937;}
    static Double centimetrosToPies(Double c) {return Double.parseDouble(c.toString()) * 0.03281;}
    static Double centimetrosToYardas(Double c) {return Double.parseDouble(c.toString()) * 0.01094;}
    static Double centimetrosToMillas(Double c) {return Double.parseDouble(c.toString()) * 0.000006214;}
    static Double centimetrosToAniosLuz(Double c) {return Double.parseDouble(c.toString()) * 1.057e-18;}

    static Double pulgadasToKilometros(Double c) {return Double.parseDouble(c.toString()) * 0.0000254;}
    static Double pulgadasToMetros(Double c) {return Double.parseDouble(c.toString()) * 0.0254;}
    static Double pulgadasToCentimetros(Double c) {return Double.parseDouble(c.toString()) * 2.54;}
    static Double pulgadasToPies(Double c) {return Double.parseDouble(c.toString()) * 0.08333;}
    static Double pulgadasToYardas(Double c) {return Double.parseDouble(c.toString()) * 0.02778;}
    static Double pulgadasToMillas(Double c) {return Double.parseDouble(c.toString()) * 0.00001578;}
    static Double pulgadasToAniosLuz(Double c) {return Double.parseDouble(c.toString()) * 2.685e-18;}

    static Double piesToKilometros(Double c) {return Double.parseDouble(c.toString()) * 0.0003048;}
    static Double piesToMetros(Double c) {return Double.parseDouble(c.toString()) * 0.3048;}
    static Double piesToCentimetros(Double c) {return Double.parseDouble(c.toString()) * 30.48;}
    static Double piesToPulgadas(Double c) {return Double.parseDouble(c.toString()) * 12.0;}
    static Double piesToYardas(Double c) {return Double.parseDouble(c.toString()) * 0.3333;}
    static Double piesToMillas(Double c) {return Double.parseDouble(c.toString()) * 0.0001894;}
    static Double piesToAniosLuz(Double c) {return Double.parseDouble(c.toString()) * 3.222e-17;}

    static Double yardasToKilometros(Double c) {return Double.parseDouble(c.toString()) * 0.0009144;}
    static Double yardasToMetros(Double c) {return Double.parseDouble(c.toString()) * 0.9144;}
    static Double yardasToCentimetros(Double c) {return Double.parseDouble(c.toString()) * 91.44;}
    static Double yardasToPulgadas(Double c) {return Double.parseDouble(c.toString()) * 36.0;}
    static Double yardasToPies(Double c) {return Double.parseDouble(c.toString()) * 3.0;}
    static Double yardasToMillas(Double c) {return Double.parseDouble(c.toString()) * 0.0005682;}
    static Double yardasToAniosLuz(Double c) {return Double.parseDouble(c.toString()) * 9.665e-17;}

    static Double millasToKilometros(Double c) {return Double.parseDouble(c.toString()) * 1.609;}
    static Double millasToMetros(Double c) {return Double.parseDouble(c.toString()) * 1609.0;}
    static Double millasToCentimetros(Double c) {return Double.parseDouble(c.toString()) * 160934.0;}
    static Double millasToPulgadas(Double c) {return Double.parseDouble(c.toString()) * 63360.0;}
    static Double millasToPies(Double c) {return Double.parseDouble(c.toString()) * 5280.0;}
    static Double millasToYardas(Double c) {return Double.parseDouble(c.toString()) * 1760.0;}
    static Double millasToAniosLuz(Double c) {return Double.parseDouble(c.toString()) * 0.0000000000001701;}

    static Double aniosLuzToKilometros(Double c) {return Double.parseDouble(c.toString()) * 9460730472581.0;}
    static Double aniosLuzToMetros(Double c) {return Double.parseDouble(c.toString()) * 9460730472580760.0;}
    static Double aniosLuzToCentimetros(Double c) {return Double.parseDouble(c.toString()) * 9.46073047258076e+17;}
    static Double aniosLuzToPulgadas(Double c) {return Double.parseDouble(c.toString()) * 3.7246970364491386e+17;}
    static Double aniosLuzToPies(Double c) {return Double.parseDouble(c.toString()) * 3.1039141970409428e+16;}
    static Double aniosLuzToYardas(Double c) {return Double.parseDouble(c.toString()) * 1.0346380656803154e+16;}
    static Double aniosLuzToMillas(Double c) {return Double.parseDouble(c.toString()) * 5878625373184.0;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para capacidad digital. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Capacidad digital
    //---------------------------------------------------------------------------------------------------------------------------
    static Double bitToByte(Double c) {return Double.parseDouble(c.toString()) / 8.0;}
    static Double bitToKiloBit(Double c) {return Double.parseDouble(c.toString()) / 1024.0;}
    static Double bitToKiloByte(Double c) {return Double.parseDouble(c.toString()) / 8192.0;}
    static Double bitToMegaBit(Double c) {return Double.parseDouble(c.toString()) / 1048576.0;}
    static Double bitToMegaByte(Double c) {return Double.parseDouble(c.toString()) / 8388608.0;}
    static Double bitToGigaBit(Double c) {return Double.parseDouble(c.toString()) / 1073741824.0;}
    static Double bitToGigaByte(Double c) {return Double.parseDouble(c.toString()) / 8589934592.0;}
    static Double bitToTeraBit(Double c) {return Double.parseDouble(c.toString()) / 1099511627800.0;}
    static Double bitToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 8796093022200.0;}

    static Double byteToBit(Double c) {return Double.parseDouble(c.toString()) * 8.0;}
    static Double byteToKiloBit(Double c) {return Double.parseDouble(c.toString()) / 128.0;}
    static Double byteToKiloByte(Double c) {return Double.parseDouble(c.toString()) / 1024.0;}
    static Double byteToMegaBit(Double c) {return Double.parseDouble(c.toString()) / 131072.0;}
    static Double byteToMegaByte(Double c) {return Double.parseDouble(c.toString()) / 1048576.0;}
    static Double byteToGigaBit(Double c) {return Double.parseDouble(c.toString()) / 134217728.0;}
    static Double byteToGigaByte(Double c) {return Double.parseDouble(c.toString()) / 1073741824.0;}
    static Double byteToTeraBit(Double c) {return Double.parseDouble(c.toString()) / 137438953470.0;}
    static Double byteToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 1099511627800.0;}

    static Double kiloBitToBit(Double c) {return Double.parseDouble(c.toString()) * 1024.0;}
    static Double kiloBitToByte(Double c) {return Double.parseDouble(c.toString()) * 128.0;}
    static Double kiloBitToKiloByte(Double c) {return Double.parseDouble(c.toString()) / 8.0;}
    static Double kiloBitToMegaBit(Double c) {return Double.parseDouble(c.toString()) / 1024.0;}
    static Double kiloBitToMegaByte(Double c) {return Double.parseDouble(c.toString()) / 8192.0;}
    static Double kiloBitToGigaBit(Double c) {return Double.parseDouble(c.toString()) / 1048576.0;}
    static Double kiloBitToGigaByte(Double c) {return Double.parseDouble(c.toString()) / 8388608.0;}
    static Double kiloBitToTeraBit(Double c) {return Double.parseDouble(c.toString()) / 1073741824.0;}
    static Double kiloBitToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 8589934592.0;}

    static Double kiloByteToBit(Double c) {return Double.parseDouble(c.toString()) * 8192.0;}
    static Double kiloByteToByte(Double c) {return Double.parseDouble(c.toString()) * 1024.0;}
    static Double kiloByteToKiloBit(Double c) {return Double.parseDouble(c.toString()) * 8.0;}
    static Double kiloByteToMegaBit(Double c) {return Double.parseDouble(c.toString()) / 128.0;}
    static Double kiloByteToMegaByte(Double c) {return Double.parseDouble(c.toString()) / 1024.0;}
    static Double kiloByteToGigaBit(Double c) {return Double.parseDouble(c.toString()) / 131072.0;}
    static Double kiloByteToGigaByte(Double c) {return Double.parseDouble(c.toString()) / 1048576.0;}
    static Double kiloByteToTeraBit(Double c) {return Double.parseDouble(c.toString()) / 134217728.0;}
    static Double kiloByteToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 1073741824.0;}

    static Double megaBitToBit(Double c) {return Double.parseDouble(c.toString()) * 1048576.0;}
    static Double megaBitToByte(Double c) {return Double.parseDouble(c.toString()) * 131072.0;}
    static Double megaBitToKiloBit(Double c) {return Double.parseDouble(c.toString()) * 1024.0;}
    static Double megaBitToKiloByte(Double c) {return Double.parseDouble(c.toString()) * 128.0;}
    static Double megaBitToMegaByte(Double c) {return Double.parseDouble(c.toString()) / 8.0;}
    static Double megaBitToGigaBit(Double c) {return Double.parseDouble(c.toString()) / 1024.0;}
    static Double megaBitToGigaByte(Double c) {return Double.parseDouble(c.toString()) / 8192.0;}
    static Double megaBitToTeraBit(Double c) {return Double.parseDouble(c.toString()) / 1048576.0;}
    static Double megaBitToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 8388608.0;}

    static Double megaByteToBit(Double c) {return Double.parseDouble(c.toString()) * 8388608.0;}
    static Double megaByteToByte(Double c) {return Double.parseDouble(c.toString()) * 1048576.0;}
    static Double megaByteToKiloBit(Double c) {return Double.parseDouble(c.toString()) * 8192.0;}
    static Double megaByteToKiloByte(Double c) {return Double.parseDouble(c.toString()) * 1024.0;}
    static Double megaByteToMegaBit(Double c) {return Double.parseDouble(c.toString()) * 8.0;}
    static Double megaByteToGigaBit(Double c) {return Double.parseDouble(c.toString()) / 128.0;}
    static Double megaByteToGigaByte(Double c) {return Double.parseDouble(c.toString()) / 1024.0;}
    static Double megaByteToTeraBit(Double c) {return Double.parseDouble(c.toString()) / 131072.0;}
    static Double megaByteToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 1048576.0;}

    static Double gigaBitToBit(Double c) {return Double.parseDouble(c.toString()) * 1073741824.0;}
    static Double gigaBitToByte(Double c) {return Double.parseDouble(c.toString()) * 134217728.0;}
    static Double gigaBitToKiloBit(Double c) {return Double.parseDouble(c.toString()) * 1048576.0;}
    static Double gigaBitToKiloByte(Double c) {return Double.parseDouble(c.toString()) * 131072.0;}
    static Double gigaBitToMegaBit(Double c) {return Double.parseDouble(c.toString()) * 1024.0;}
    static Double gigaBitToMegaByte(Double c) {return Double.parseDouble(c.toString()) * 128.0;}
    static Double gigaBitToGigaByte(Double c) {return Double.parseDouble(c.toString()) / 8.0;}
    static Double gigaBitToTeraBit(Double c) {return Double.parseDouble(c.toString()) / 1024.0;}
    static Double gigaBitToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 8192.0;}

    static Double gigaByteToBit(Double c) {return Double.parseDouble(c.toString()) * 8589934592.0;}
    static Double gigaByteToByte(Double c) {return Double.parseDouble(c.toString()) * 1073741824.0;}
    static Double gigaByteToKiloBit(Double c) {return Double.parseDouble(c.toString()) * 8388608.0;}
    static Double gigaByteToKiloByte(Double c) {return Double.parseDouble(c.toString()) * 1048576.0;}
    static Double gigaByteToMegaBit(Double c) {return Double.parseDouble(c.toString()) * 8192.0;}
    static Double gigaByteToMegaByte(Double c) {return Double.parseDouble(c.toString()) * 1024.0;}
    static Double gigaByteToGigaBit(Double c) {return Double.parseDouble(c.toString()) * 8.0;}
    static Double gigaByteToTeraBit(Double c) {return Double.parseDouble(c.toString()) / 128.0;}
    static Double gigaByteToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 1024.0;}

    static Double teraBitToBit(Double c) {return Double.parseDouble(c.toString()) * 1099511627800.0;}
    static Double teraBitToByte(Double c) {return Double.parseDouble(c.toString()) * 137438953470.0;}
    static Double teraBitToKiloBit(Double c) {return Double.parseDouble(c.toString()) * 1073741824.0;}
    static Double teraBitToKiloByte(Double c) {return Double.parseDouble(c.toString()) * 134217728.0;}
    static Double teraBitToMegaBit(Double c) {return Double.parseDouble(c.toString()) * 1048576.0;}
    static Double teraBitToMegaByte(Double c) {return Double.parseDouble(c.toString()) * 131072.0;}
    static Double teraBitToGigaBit(Double c) {return Double.parseDouble(c.toString()) * 1024.0;}
    static Double teraBitToGigaByte(Double c) {return Double.parseDouble(c.toString()) * 128.0;}
    static Double teraBitToTeraByte(Double c) {return Double.parseDouble(c.toString()) / 8.0;}

    static Double teraByteToBit(Double c) {return Double.parseDouble(c.toString()) * 8796093022200.0;}
    static Double teraByteToByte(Double c) {return Double.parseDouble(c.toString()) * 1099511627800.0;}
    static Double teraByteToKiloBit(Double c) {return Double.parseDouble(c.toString()) * 8589934592.0;}
    static Double teraByteToKiloByte(Double c) {return Double.parseDouble(c.toString()) * 1073741824.0;}
    static Double teraByteToMegaBit(Double c) {return Double.parseDouble(c.toString()) * 8388608.0;}
    static Double teraByteToMegaByte(Double c) {return Double.parseDouble(c.toString()) * 1048576.0;}
    static Double teraByteToGigaBit(Double c) {return Double.parseDouble(c.toString()) * 8192.0;}
    static Double teraByteToGigaByte(Double c) {return Double.parseDouble(c.toString()) * 1024.0;}
    static Double teraByteToTeraBit(Double c) {return Double.parseDouble(c.toString()) * 8.0;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para área. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Área
    //---------------------------------------------------------------------------------------------------------------------------
    static Double km2ToM2(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}
    static Double km2ToCm2(Double c) {return Double.parseDouble(c.toString()) * 10000000000.0;}
    static Double km2ToHectarea(Double c) {return Double.parseDouble(c.toString()) * 100.0;}
    static Double km2ToAcre(Double c) {return Double.parseDouble(c.toString()) * 247.1;}
    static Double km2ToPie2(Double c) {return Double.parseDouble(c.toString()) * 10763910.0;}
    static Double km2ToYarda2(Double c) {return Double.parseDouble(c.toString()) * 1195990.0;}
    static Double km2ToMilla2(Double c) {return Double.parseDouble(c.toString()) * 0.3861;}

    static Double m2ToKm2(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double m2ToCm2(Double c) {return Double.parseDouble(c.toString()) * 10000.0;}
    static Double m2ToHectarea(Double c) {return Double.parseDouble(c.toString()) * 0.0001;}
    static Double m2ToAcre(Double c) {return Double.parseDouble(c.toString()) * 0.0002471;}
    static Double m2ToPie2(Double c) {return Double.parseDouble(c.toString()) * 10.76;}
    static Double m2ToYarda2(Double c) {return Double.parseDouble(c.toString()) * 1.196;}
    static Double m2ToMilla2(Double c) {return Double.parseDouble(c.toString()) * 0.0000003861;}

    static Double cm2ToKm2(Double c) {return Double.parseDouble(c.toString()) * 0.0000000001;}
    static Double cm2ToM2(Double c) {return Double.parseDouble(c.toString()) * 0.0001;}
    static Double cm2ToHectarea(Double c) {return Double.parseDouble(c.toString()) * 0.00000001;}
    static Double cm2ToAcre(Double c) {return Double.parseDouble(c.toString()) * 0.00000002471;}
    static Double cm2ToPie2(Double c) {return Double.parseDouble(c.toString()) * 0.001076;}
    static Double cm2ToYarda2(Double c) {return Double.parseDouble(c.toString()) * 0.0001196;}
    static Double cm2ToMilla2(Double c) {return Double.parseDouble(c.toString()) * 0.00000000003861;}

    static Double hectareaToKm2(Double c) {return Double.parseDouble(c.toString()) * 0.01;}
    static Double hectareaToM2(Double c) {return Double.parseDouble(c.toString()) * 10000.0;}
    static Double hectareaToCm2(Double c) {return Double.parseDouble(c.toString()) * 100000000.0;}
    static Double hectareaToAcre(Double c) {return Double.parseDouble(c.toString()) * 2.471;}
    static Double hectareaToPie2(Double c) {return Double.parseDouble(c.toString()) * 107639.0;}
    static Double hectareaToYarda2(Double c) {return Double.parseDouble(c.toString()) * 11960.0;}
    static Double hectareaToMilla2(Double c) {return Double.parseDouble(c.toString()) * 0.003861;}

    static Double acreToKm2(Double c) {return Double.parseDouble(c.toString()) * 0.004047;}
    static Double acreToM2(Double c) {return Double.parseDouble(c.toString()) * 4047.0;}
    static Double acreToCm2(Double c) {return Double.parseDouble(c.toString()) * 40468564.0;}
    static Double acreToHectarea(Double c) {return Double.parseDouble(c.toString()) * 0.4047;}
    static Double acreToPie2(Double c) {return Double.parseDouble(c.toString()) * 43560.0;}
    static Double acreToYarda2(Double c) {return Double.parseDouble(c.toString()) * 4840.0;}
    static Double acreToMilla2(Double c) {return Double.parseDouble(c.toString()) * 0.001563;}

    static Double pie2ToKm2(Double c) {return Double.parseDouble(c.toString()) * 0.0000000929;}
    static Double pie2ToM2(Double c) {return Double.parseDouble(c.toString()) * 0.0929;}
    static Double pie2ToCm2(Double c) {return Double.parseDouble(c.toString()) * 929.0;}
    static Double pie2ToHectarea(Double c) {return Double.parseDouble(c.toString()) * 0.00000929;}
    static Double pie2ToAcre(Double c) {return Double.parseDouble(c.toString()) * 0.00002296;}
    static Double pie2ToYarda2(Double c) {return Double.parseDouble(c.toString()) * 0.1111;}
    static Double pie2ToMilla2(Double c) {return Double.parseDouble(c.toString()) * 0.00000003587;}

    static Double yarda2ToKm2(Double c) {return Double.parseDouble(c.toString()) * 0.0000008361;}
    static Double yarda2ToM2(Double c) {return Double.parseDouble(c.toString()) * 0.8361;}
    static Double yarda2ToCm2(Double c) {return Double.parseDouble(c.toString()) * 8361.0;}
    static Double yarda2ToHectarea(Double c) {return Double.parseDouble(c.toString()) * 0.00008361;}
    static Double yarda2ToAcre(Double c) {return Double.parseDouble(c.toString()) * 0.0002066;}
    static Double yarda2ToPie2(Double c) {return Double.parseDouble(c.toString()) * 9.0;}
    static Double yarda2ToMilla2(Double c) {return Double.parseDouble(c.toString()) * 0.0000003228;}

    static Double milla2ToKm2(Double c) {return Double.parseDouble(c.toString()) * 2.59;}
    static Double milla2ToM2(Double c) {return Double.parseDouble(c.toString()) * 2589988.0;}
    static Double milla2ToCm2(Double c) {return Double.parseDouble(c.toString()) * 25899881103.0;}
    static Double milla2ToHectarea(Double c) {return Double.parseDouble(c.toString()) * 259.0;}
    static Double milla2ToAcre(Double c) {return Double.parseDouble(c.toString()) * 640.0;}
    static Double milla2ToPie2(Double c) {return Double.parseDouble(c.toString()) * 27878400.0;}
    static Double milla2ToYarda2(Double c) {return Double.parseDouble(c.toString()) * 3097600.0;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para masa. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Masa
    //---------------------------------------------------------------------------------------------------------------------------
    static Double kilogramosToGramos(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double kilogramosToMiligramos(Double c) {return Double.parseDouble(c.toString()) * 1000000;}
    static Double kilogramosToUdMasaAtom(Double c) {return Double.parseDouble(c.toString()) * 6.022e+26;}
    static Double kilogramosToToneladas(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double kilogramosToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.009807;}
    static Double kilogramosToLibras(Double c) {return Double.parseDouble(c.toString()) * 2.205;}

    static Double gramosToKilogramos(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double gramosToMiligramos(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double gramosToUdMasaAtom(Double c) {return Double.parseDouble(c.toString()) * 6.022e+23;}
    static Double gramosToToneladas(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double gramosToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000009807;}
    static Double gramosToLibras(Double c) {return Double.parseDouble(c.toString()) * 0.002205;}

    static Double miligramosToKilogramos(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double miligramosToGramos(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double miligramosToUdMasaAtom(Double c) {return Double.parseDouble(c.toString()) * 6.02214129011674e+20;}
    static Double miligramosToToneladas(Double c) {return Double.parseDouble(c.toString()) * 0.000000001;}
    static Double miligramosToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000000009807;}
    static Double miligramosToLibras(Double c) {return Double.parseDouble(c.toString()) * 0.000002205;}

    static Double udMasaAtomToKilogramos(Double c) {return Double.parseDouble(c.toString()) * 1.661e-27;}
    static Double udMasaAtomToGramos(Double c) {return Double.parseDouble(c.toString()) * 1.661e-24;}
    static Double udMasaAtomToMiligramos(Double c) {return Double.parseDouble(c.toString()) * 1.661e-21;}
    static Double udMasaAtomToToneladas(Double c) {return Double.parseDouble(c.toString()) * 1.661e-30;}
    static Double udMasaAtomToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 1.628e-29;}
    static Double udMasaAtomToLibras(Double c) {return Double.parseDouble(c.toString()) * 3.661e-27;}

    static Double toneladasToKilogramos(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double toneladasToGramos(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}
    static Double toneladasToMiligramos(Double c) {return Double.parseDouble(c.toString()) * 1000000000.0;}
    static Double toneladasToUdMasaAtom(Double c) {return Double.parseDouble(c.toString()) * 6.022e+29;}
    static Double toneladasToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 9.807;}
    static Double toneladasToLibras(Double c) {return Double.parseDouble(c.toString()) * 2205.0;}

    static Double kilonewtonsToKilogramos(Double c) {return Double.parseDouble(c.toString()) * 102.0;}
    static Double kilonewtonsToGramos(Double c) {return Double.parseDouble(c.toString()) * 101972.0;}
    static Double kilonewtonsToMiligramos(Double c) {return Double.parseDouble(c.toString()) * 101971600.0;}
    static Double kilonewtonsToUdMasaAtom(Double c) {return Double.parseDouble(c.toString()) * 6.141e+28;}
    static Double kilonewtonsToToneladas(Double c) {return Double.parseDouble(c.toString()) * 0.102;}
    static Double kilonewtonsToLibras(Double c) {return Double.parseDouble(c.toString()) * 224.8;}

    static Double librasToKilogramos(Double c) {return Double.parseDouble(c.toString()) * 0.4536;}
    static Double librasToGramos(Double c) {return Double.parseDouble(c.toString()) * 453.6;}
    static Double librasToMiligramos(Double c) {return Double.parseDouble(c.toString()) * 453592.0;}
    static Double librasToUdMasaAtom(Double c) {return Double.parseDouble(c.toString()) * 2.732e+26;}
    static Double librasToToneladas(Double c) {return Double.parseDouble(c.toString()) * 0.0004536;}
    static Double librasToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.004448;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para velocidad. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Velocidad
    //---------------------------------------------------------------------------------------------------------------------------
    static Double kmsToMs(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double kmsToKmm(Double c) {return Double.parseDouble(c.toString()) * 60.0;}
    static Double kmsToMm(Double c) {return Double.parseDouble(c.toString()) * 60000.0;}
    static Double kmsToKmh(Double c) {return Double.parseDouble(c.toString()) * 3600.0;}
    static Double kmsToMh(Double c) {return Double.parseDouble(c.toString()) * 3600000.0;}
    static Double kmsToMph(Double c) {return Double.parseDouble(c.toString()) * 2237.0;}

    static Double msToKms(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double msToKmm(Double c) {return Double.parseDouble(c.toString()) * 0.06;}
    static Double msToMm(Double c) {return Double.parseDouble(c.toString()) * 60.0;}
    static Double msToKmh(Double c) {return Double.parseDouble(c.toString()) * 3.6;}
    static Double msToMh(Double c) {return Double.parseDouble(c.toString()) * 3600.0;}
    static Double msToMph(Double c) {return Double.parseDouble(c.toString()) * 2.237;}

    static Double kmmToKms(Double c) {return Double.parseDouble(c.toString()) * 0.01667;}
    static Double kmmToMs(Double c) {return Double.parseDouble(c.toString()) * 16.67;}
    static Double kmmToMm(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double kmmToKmh(Double c) {return Double.parseDouble(c.toString()) * 60.0;}
    static Double kmmToMh(Double c) {return Double.parseDouble(c.toString()) * 60000.0;}
    static Double kmmToMph(Double c) {return Double.parseDouble(c.toString()) * 37.28;}

    static Double mmToKms(Double c) {return Double.parseDouble(c.toString()) * 0.00001667;}
    static Double mmToMs(Double c) {return Double.parseDouble(c.toString()) * 0.01667;}
    static Double mmToKmm(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double mmToKmh(Double c) {return Double.parseDouble(c.toString()) * 0.06;}
    static Double mmToMh(Double c) {return Double.parseDouble(c.toString()) * 60.0;}
    static Double mmToMph(Double c) {return Double.parseDouble(c.toString()) * 0.03728;}

    static Double kmhToKms(Double c) {return Double.parseDouble(c.toString()) * 0.0002778;}
    static Double kmhToMs(Double c) {return Double.parseDouble(c.toString()) * 0.2778;}
    static Double kmhToKmm(Double c) {return Double.parseDouble(c.toString()) * 0.01667;}
    static Double kmhToMm(Double c) {return Double.parseDouble(c.toString()) * 16.67;}
    static Double kmhToMh(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double kmhToMph(Double c) {return Double.parseDouble(c.toString()) * 0.6214;}

    static Double mhToKms(Double c) {return Double.parseDouble(c.toString()) * 0.0000002778;}
    static Double mhToMs(Double c) {return Double.parseDouble(c.toString()) * 0.0002778;}
    static Double mhToKmm(Double c) {return Double.parseDouble(c.toString()) * 0.00001667;}
    static Double mhToMm(Double c) {return Double.parseDouble(c.toString()) * 0.01667;}
    static Double mhToKmh(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double mhToMph(Double c) {return Double.parseDouble(c.toString()) * 0.0006214;}

    static Double mphToKms(Double c) {return Double.parseDouble(c.toString()) * 0.000447;}
    static Double mphToMs(Double c) {return Double.parseDouble(c.toString()) * 0.447;}
    static Double mphToKmm(Double c) {return Double.parseDouble(c.toString()) * 0.02682;}
    static Double mphToMm(Double c) {return Double.parseDouble(c.toString()) * 26.82;}
    static Double mphToKmh(Double c) {return Double.parseDouble(c.toString()) * 1.609;}
    static Double mphToMh(Double c) {return Double.parseDouble(c.toString()) * 1609.0;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para tiempo. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Tiempo
    //---------------------------------------------------------------------------------------------------------------------------
    static Double segundosToMinutos(Double c) {return Double.parseDouble(c.toString()) * 0.01667;}
    static Double segundosToHoras(Double c) {return Double.parseDouble(c.toString()) * 0.0002778;}
    static Double segundosToDias(Double c) {return Double.parseDouble(c.toString()) * 0.00001157;}
    static Double segundosToSemanas(Double c) {return Double.parseDouble(c.toString()) * 0.000001653;}
    static Double segundosToMeses(Double c) {return Double.parseDouble(c.toString()) * 0.0000003803;}
    static Double segundosToAnios(Double c) {return Double.parseDouble(c.toString()) * 0.00000003169;}
    static Double segundosToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double segundosToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}
    static Double segundosToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 1000000000.0;}

    static Double minutosToSegundos(Double c) {return Double.parseDouble(c.toString()) * 60.0;}
    static Double minutosToHoras(Double c) {return Double.parseDouble(c.toString()) * 0.01667;}
    static Double minutosToDias(Double c) {return Double.parseDouble(c.toString()) * 0.0006944;}
    static Double minutosToSemanas(Double c) {return Double.parseDouble(c.toString()) * 0.00009921;}
    static Double minutosToMeses(Double c) {return Double.parseDouble(c.toString()) * 0.00002282;}
    static Double minutosToAnios(Double c) {return Double.parseDouble(c.toString()) * 0.000001901;}
    static Double minutosToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 60000.0;}
    static Double minutosToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 60000000.0;}
    static Double minutosToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 60000000000.0;}

    static Double horasToSegundos(Double c) {return Double.parseDouble(c.toString()) * 3600.0;}
    static Double horasToMinutos(Double c) {return Double.parseDouble(c.toString()) * 60.0;}
    static Double horasToDias(Double c) {return Double.parseDouble(c.toString()) * 0.04167;}
    static Double horasToSemanas(Double c) {return Double.parseDouble(c.toString()) * 0.005952;}
    static Double horasToMeses(Double c) {return Double.parseDouble(c.toString()) * 0.001369;}
    static Double horasToAnios(Double c) {return Double.parseDouble(c.toString()) * 0.0001141;}
    static Double horasToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 3600000.0;}
    static Double horasToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 3600000000.0;}
    static Double horasToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 3600000000000.0;}

    static Double diasToSegundos(Double c) {return Double.parseDouble(c.toString()) * 86400.0;}
    static Double diasToMinutos(Double c) {return Double.parseDouble(c.toString()) * 1440.0;}
    static Double diasToHoras(Double c) {return Double.parseDouble(c.toString()) * 24.0;}
    static Double diasToSemanas(Double c) {return Double.parseDouble(c.toString()) * 0.1429;}
    static Double diasToMeses(Double c) {return Double.parseDouble(c.toString()) * 0.03285;}
    static Double diasToAnios(Double c) {return Double.parseDouble(c.toString()) * 0.002738;}
    static Double diasToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 86400000.0;}
    static Double diasToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 86400000000.0;}
    static Double diasToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 86400000000000.0;}

    static Double semanasToSegundos(Double c) {return Double.parseDouble(c.toString()) * 604800.0;}
    static Double semanasToMinutos(Double c) {return Double.parseDouble(c.toString()) * 10080.0;}
    static Double semanasToHoras(Double c) {return Double.parseDouble(c.toString()) * 168.0;}
    static Double semanasToDias(Double c) {return Double.parseDouble(c.toString()) * 7.0;}
    static Double semanasToMeses(Double c) {return Double.parseDouble(c.toString()) * 0.23;}
    static Double semanasToAnios(Double c) {return Double.parseDouble(c.toString()) * 0.01917;}
    static Double semanasToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 604800000.0;}
    static Double semanasToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 604800000000.0;}
    static Double semanasToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 604800000000000.0;}

    static Double mesesToSegundos(Double c) {return Double.parseDouble(c.toString()) * 2629744.0;}
    static Double mesesToMinutos(Double c) {return Double.parseDouble(c.toString()) * 43829.0;}
    static Double mesesToHoras(Double c) {return Double.parseDouble(c.toString()) * 730.5;}
    static Double mesesToDias(Double c) {return Double.parseDouble(c.toString()) * 30.44;}
    static Double mesesToSemanas(Double c) {return Double.parseDouble(c.toString()) * 4.348;}
    static Double mesesToAnios(Double c) {return Double.parseDouble(c.toString()) * 0.08333;}
    static Double mesesToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 2629744200.0;}
    static Double mesesToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 2629744200000.0;}
    static Double mesesToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 2629744200000000.0;}

    static Double aniosToSegundos(Double c) {return Double.parseDouble(c.toString()) * 31556926.0;}
    static Double aniosToMinutos(Double c) {return Double.parseDouble(c.toString()) * 525949.0;}
    static Double aniosToHoras(Double c) {return Double.parseDouble(c.toString()) * 8766.0;}
    static Double aniosToDias(Double c) {return Double.parseDouble(c.toString()) * 365.2;}
    static Double aniosToSemanas(Double c) {return Double.parseDouble(c.toString()) * 52.18;}
    static Double aniosToMeses(Double c) {return Double.parseDouble(c.toString()) * 12.0;}
    static Double aniosToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 31556925975.0;}
    static Double aniosToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 31556925974678.0;}
    static Double aniosToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 3.15569259746784e+16;}

    static Double milisegundosToSegundos(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double milisegundosToMinutos(Double c) {return Double.parseDouble(c.toString()) * 0.00001667;}
    static Double milisegundosToHoras(Double c) {return Double.parseDouble(c.toString()) * 0.0000002778;}
    static Double milisegundosToDias(Double c) {return Double.parseDouble(c.toString()) * 0.00000001157;}
    static Double milisegundosToSemanas(Double c) {return Double.parseDouble(c.toString()) * 0.000000001653;}
    static Double milisegundosToMeses(Double c) {return Double.parseDouble(c.toString()) * 0.0000000003803;}
    static Double milisegundosToAnios(Double c) {return Double.parseDouble(c.toString()) * 0.00000000003169;}
    static Double milisegundosToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double milisegundosToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}

    static Double microsegundosToSegundos(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double microsegundosToMinutos(Double c) {return Double.parseDouble(c.toString()) * 0.00000001667;}
    static Double microsegundosToHoras(Double c) {return Double.parseDouble(c.toString()) * 0.0000000002778;}
    static Double microsegundosToDias(Double c) {return Double.parseDouble(c.toString()) * 0.00000000001157;}
    static Double microsegundosToSemanas(Double c) {return Double.parseDouble(c.toString()) * 0.000000000001653;}
    static Double microsegundosToMeses(Double c) {return Double.parseDouble(c.toString()) * 0.0000000000003803;}
    static Double microsegundosToAnios(Double c) {return Double.parseDouble(c.toString()) * 0.00000000000003169;}
    static Double microsegundosToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double microsegundosToNanosegundos(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}

    static Double nanosegundosToSegundos(Double c) {return Double.parseDouble(c.toString()) * 0.000000001;}
    static Double nanosegundosToMinutos(Double c) {return Double.parseDouble(c.toString()) * 0.00000000001667;}
    static Double nanosegundosToHoras(Double c) {return Double.parseDouble(c.toString()) * 0.0000000000002778;}
    static Double nanosegundosToDias(Double c) {return Double.parseDouble(c.toString()) * 0.00000000000001157;}
    static Double nanosegundosToSemanas(Double c) {return Double.parseDouble(c.toString()) * 0.000000000000001653;}
    static Double nanosegundosToMeses(Double c) {return Double.parseDouble(c.toString()) * 3.803e-16;}
    static Double nanosegundosToAnios(Double c) {return Double.parseDouble(c.toString()) * 3.169e-17;}
    static Double nanosegundosToMilisegundos(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double nanosegundosToMicrosegundos(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para fuerza. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Fuerza
    //---------------------------------------------------------------------------------------------------------------------------
    static Double newtonsToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double newtonsToMeganewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double newtonsToMilinewtons(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double newtonsToMicronewtons(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}
    static Double newtonsToKgFuerza(Double c) {return Double.parseDouble(c.toString()) * 0.102;}
    static Double newtonsToLbFuerza(Double c) {return Double.parseDouble(c.toString()) * 0.2248;}

    static Double kilonewtonsToNewtons(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double kilonewtonsToMeganewtons(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double kilonewtonsToMilinewtons(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}
    static Double kilonewtonsToMicronewtons(Double c) {return Double.parseDouble(c.toString()) * 1000000000.0;}
    static Double kilonewtonsToKgFuerza(Double c) {return Double.parseDouble(c.toString()) * 102.0;}
    static Double kilonewtonsToLbFuerza(Double c) {return Double.parseDouble(c.toString()) * 224.8;}

    static Double meganewtonsToNewtons(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}
    static Double meganewtonsToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double meganewtonsToMilinewtons(Double c) {return Double.parseDouble(c.toString()) * 1000000000.0;}
    static Double meganewtonsToMicronewtons(Double c) {return Double.parseDouble(c.toString()) * 1000000000000.0;}
    static Double meganewtonsToKgFuerza(Double c) {return Double.parseDouble(c.toString()) * 101972.0;}
    static Double meganewtonsToLbFuerza(Double c) {return Double.parseDouble(c.toString()) * 224809.0;}

    static Double milinewtonsToNewtons(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double milinewtonsToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double milinewtonsToMeganewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000000001;}
    static Double milinewtonsToMicronewtons(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double milinewtonsToKgFuerza(Double c) {return Double.parseDouble(c.toString()) * 0.000102;}
    static Double milinewtonsToLbFuerza(Double c) {return Double.parseDouble(c.toString()) * 0.0002248;}

    static Double micronewtonsToNewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double micronewtonsToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000000001;}
    static Double micronewtonsToMeganewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000000000001;}
    static Double micronewtonsToMilinewtons(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double micronewtonsToKgFuerza(Double c) {return Double.parseDouble(c.toString()) * 0.000000102;}
    static Double micronewtonsToLbFuerza(Double c) {return Double.parseDouble(c.toString()) * 0.0000002248;}

    static Double kgFuerzaToNewtons(Double c) {return Double.parseDouble(c.toString()) * 9.807;}
    static Double kgFuerzaToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.009807;}
    static Double kgFuerzaToMeganewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000009807;}
    static Double kgFuerzaToMilinewtons(Double c) {return Double.parseDouble(c.toString()) * 9807.0;}
    static Double kgFuerzaToMicronewtons(Double c) {return Double.parseDouble(c.toString()) * 9806650.0;}
    static Double kgFuerzaToLbFuerza(Double c) {return Double.parseDouble(c.toString()) * 2.205;}

    static Double lbFuerzaToNewtons(Double c) {return Double.parseDouble(c.toString()) * 4.448;}
    static Double lbFuerzaToKilonewtons(Double c) {return Double.parseDouble(c.toString()) * 0.004448;}
    static Double lbFuerzaToMeganewtons(Double c) {return Double.parseDouble(c.toString()) * 0.000004448;}
    static Double lbFuerzaToMilinewtons(Double c) {return Double.parseDouble(c.toString()) * 4448.0;}
    static Double lbFuerzaToMicronewtons(Double c) {return Double.parseDouble(c.toString()) * 4448222.0;}
    static Double lbFuerzaToKgFuerza(Double c) {return Double.parseDouble(c.toString()) * 0.4536;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para volumen. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Volumen
    //---------------------------------------------------------------------------------------------------------------------------
    static Double litrosToMililitros(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double litrosToMetros3(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double litrosToCentimetros3(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double litrosToUKGalones(Double c) {return Double.parseDouble(c.toString()) * 0.22;}
    static Double litrosToUSGalones(Double c) {return Double.parseDouble(c.toString()) * 0.2642;}
    static Double litrosToPulgadas3(Double c) {return Double.parseDouble(c.toString()) * 61.02;}
    static Double litrosToPies3(Double c) {return Double.parseDouble(c.toString()) * 0.03531;}

    static Double mililitrosToLitros(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double mililitrosToMetros3(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double mililitrosToCentimetros3(Double c) {return Double.parseDouble(c.toString()) * 1.0;}
    static Double mililitrosToUKGalones(Double c) {return Double.parseDouble(c.toString()) * 0.00022;}
    static Double mililitrosToUSGalones(Double c) {return Double.parseDouble(c.toString()) * 0.0002642;}
    static Double mililitrosToPulgadas3(Double c) {return Double.parseDouble(c.toString()) * 0.06102;}
    static Double mililitrosToPies3(Double c) {return Double.parseDouble(c.toString()) * 0.00003531;}

    static Double metros3ToLitros(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double metros3ToMililitros(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}
    static Double metros3ToCentimetros3(Double c) {return Double.parseDouble(c.toString()) * 1000000.0;}
    static Double metros3ToUKGalones(Double c) {return Double.parseDouble(c.toString()) * 220.0;}
    static Double metros3ToUSGalones(Double c) {return Double.parseDouble(c.toString()) * 264.2;}
    static Double metros3ToPulgadas3(Double c) {return Double.parseDouble(c.toString()) * 61024.0;}
    static Double metros3ToPies3(Double c) {return Double.parseDouble(c.toString()) * 35.31;}

    static Double centimetros3ToLitros(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double centimetros3ToMililitros(Double c) {return Double.parseDouble(c.toString()) * 1.0;}
    static Double centimetros3ToMetros3(Double c) {return Double.parseDouble(c.toString()) * 0.000001;}
    static Double centimetros3ToUKGalones(Double c) {return Double.parseDouble(c.toString()) * 0.00022;}
    static Double centimetros3ToUSGalones(Double c) {return Double.parseDouble(c.toString()) * 0.0002642;}
    static Double centimetros3ToPulgadas3(Double c) {return Double.parseDouble(c.toString()) * 0.06102;}
    static Double centimetros3ToPies3(Double c) {return Double.parseDouble(c.toString()) * 0.00003531;}

    static Double ukgalonesToLitros(Double c) {return Double.parseDouble(c.toString()) * 4.546;}
    static Double ukgalonesToMililitros(Double c) {return Double.parseDouble(c.toString()) * 4546.0;}
    static Double ukgalonesToMetros3(Double c) {return Double.parseDouble(c.toString()) * 0.004546;}
    static Double ukgalonesToCentimetros3(Double c) {return Double.parseDouble(c.toString()) * 4546.0;}
    static Double ukgalonesToUSGalones(Double c) {return Double.parseDouble(c.toString()) * 1.201;}
    static Double ukgalonesToPulgadas3(Double c) {return Double.parseDouble(c.toString()) * 277.4;}
    static Double ukgalonesToPies3(Double c) {return Double.parseDouble(c.toString()) * 0.1605;}

    static Double usgalonesToLitros(Double c) {return Double.parseDouble(c.toString()) * 3.785;}
    static Double usgalonesToMililitros(Double c) {return Double.parseDouble(c.toString()) * 3785.0;}
    static Double usgalonesToMetros3(Double c) {return Double.parseDouble(c.toString()) * 0.003785;}
    static Double usgalonesToCentimetros3(Double c) {return Double.parseDouble(c.toString()) * 3785.0;}
    static Double usgalonesToUKGalones(Double c) {return Double.parseDouble(c.toString()) * 0.8327;}
    static Double usgalonesToPulgadas3(Double c) {return Double.parseDouble(c.toString()) * 231.0;}
    static Double usgalonesToPies3(Double c) {return Double.parseDouble(c.toString()) * 0.1337;}

    static Double pulgadas3ToLitros(Double c) {return Double.parseDouble(c.toString()) * 0.01639;}
    static Double pulgadas3ToMililitros(Double c) {return Double.parseDouble(c.toString()) * 16.39;}
    static Double pulgadas3ToMetros3(Double c) {return Double.parseDouble(c.toString()) * 0.00001639;}
    static Double pulgadas3ToCentimetros3(Double c) {return Double.parseDouble(c.toString()) * 16.39;}
    static Double pulgadas3ToUKGalones(Double c) {return Double.parseDouble(c.toString()) * 0.003605;}
    static Double pulgadas3ToUSGalones(Double c) {return Double.parseDouble(c.toString()) * 0.004329;}
    static Double pulgadas3ToPies3(Double c) {return Double.parseDouble(c.toString()) * 0.0005787;}

    static Double pies3ToLitros(Double c) {return Double.parseDouble(c.toString()) * 28.32;}
    static Double pies3ToMililitros(Double c) {return Double.parseDouble(c.toString()) * 28317.0;}
    static Double pies3ToMetros3(Double c) {return Double.parseDouble(c.toString()) * 0.02832;}
    static Double pies3ToCentimetros3(Double c) {return Double.parseDouble(c.toString()) * 28317.0;}
    static Double pies3ToUKGalones(Double c) {return Double.parseDouble(c.toString()) * 6.229;}
    static Double pies3ToUSGalones(Double c) {return Double.parseDouble(c.toString()) * 7.481;}
    static Double pies3ToPulgadas3(Double c) {return Double.parseDouble(c.toString()) * 1728.0;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para presión. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Presion
    //---------------------------------------------------------------------------------------------------------------------------
    static Double barToPascal(Double c) {return Double.parseDouble(c.toString()) * 100000.0;}
    static Double barToPsi(Double c) {return Double.parseDouble(c.toString()) * 14.5038;}
    static Double barToTorr(Double c) {return Double.parseDouble(c.toString()) * 750.062;}
    static Double barToAtm(Double c) {return Double.parseDouble(c.toString()) * 0.986923;}

    static Double pascalToBar(Double c) {return Double.parseDouble(c.toString()) * 0.00001;}
    static Double pascalToPsi(Double c) {return Double.parseDouble(c.toString()) * 0.000145;}
    static Double pascalToTorr(Double c) {return Double.parseDouble(c.toString()) * 0.007501;}
    static Double pascalToAtm(Double c) {return Double.parseDouble(c.toString()) * 0.000009869;}

    static Double psiToBar(Double c) {return Double.parseDouble(c.toString()) * 0.06895;}
    static Double psiToPascal(Double c) {return Double.parseDouble(c.toString()) * 6895.0;}
    static Double psiToTorr(Double c) {return Double.parseDouble(c.toString()) * 51.71;}
    static Double psiToAtm(Double c) {return Double.parseDouble(c.toString()) * 0.06805;}

    static Double torrToBar(Double c) {return Double.parseDouble(c.toString()) * 0.001333;}
    static Double torrToPascal(Double c) {return Double.parseDouble(c.toString()) * 133.3;}
    static Double torrToPsi(Double c) {return Double.parseDouble(c.toString()) * 0.01934;}
    static Double torrToAtm(Double c) {return Double.parseDouble(c.toString()) * 0.001316;}

    static Double atmToBar(Double c) {return Double.parseDouble(c.toString()) * 1.013;}
    static Double atmToPascal(Double c) {return Double.parseDouble(c.toString()) * 101325.0;}
    static Double atmToPsi(Double c) {return Double.parseDouble(c.toString()) * 14.7;}
    static Double atmToTorr(Double c) {return Double.parseDouble(c.toString()) * 760.0;}
    //---------------------------------------------------------------------------------------------------------------------------

    /**
     * Métodos de conversión para energía y trabajo. El parámetro es la unidad origen y devuelve el valor correspondiente en la destino
     */
    //Energía y trabajo
    //---------------------------------------------------------------------------------------------------------------------------
    static Double juliosToKilocalorias(Double c) {return Double.parseDouble(c.toString()) * 0.0002388;}
    static Double juliosToCalorias(Double c) {return Double.parseDouble(c.toString()) * 0.2388;}
    static Double juliosToKilovatiosh(Double c) {return Double.parseDouble(c.toString()) * 0.0000002778;}
    static Double juliosToElectronvoltios(Double c) {return Double.parseDouble(c.toString()) * 6.2414504e+18;}

    static Double kilocaloriasToJulios(Double c) {return Double.parseDouble(c.toString()) * 4187.0;}
    static Double kilocaloriasToCalorias(Double c) {return Double.parseDouble(c.toString()) * 1000.0;}
    static Double kilocaloriasToKilovatiosh(Double c) {return Double.parseDouble(c.toString()) * 0.001163;}
    static Double kilocaloriasToElectronvoltios(Double c) {return Double.parseDouble(c.toString()) * 2.613e+22;}

    static Double caloriasToJulios(Double c) {return Double.parseDouble(c.toString()) * 4.187;}
    static Double caloriasToKilocalorias(Double c) {return Double.parseDouble(c.toString()) * 0.001;}
    static Double caloriasToKilovatiosh(Double c) {return Double.parseDouble(c.toString()) * 0.000001163;}
    static Double caloriasToElectronvoltios(Double c) {return Double.parseDouble(c.toString()) * 2.6131704e+19;}

    static Double kilovatioshToJulios(Double c) {return Double.parseDouble(c.toString()) * 3600000.0;}
    static Double kilovatioshToKilocalorias(Double c) {return Double.parseDouble(c.toString()) * 859.8;}
    static Double kilovatioshToCalorias(Double c) {return Double.parseDouble(c.toString()) * 859845.0;}
    static Double kilovatioshToElectronvoltios(Double c) {return Double.parseDouble(c.toString()) * 2.247e+25;}

    static Double electronvoltiosToJulios(Double c) {return Double.parseDouble(c.toString()) * 1.602e-19;}
    static Double electronvoltiosToKilocalorias(Double c) {return Double.parseDouble(c.toString()) * 3.827e-23;}
    static Double electronvoltiosToCalorias(Double c) {return Double.parseDouble(c.toString()) * 3.827e-20;}
    static Double electronvoltiosToKilovatiosh(Double c) {return Double.parseDouble(c.toString()) * 4.451e-26;}
    //---------------------------------------------------------------------------------------------------------------------------
}

