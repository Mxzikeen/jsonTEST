package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        ObjectMapper mapper = new ObjectMapper();
        try {
            File archivo = new File("C:\\Users\\agust\\Desktop\\PROG.3 AGUSTIN\\tuki\\archivo.json");

            Aeropuerto[] aeropuertos = mapper.readValue(archivo, Aeropuerto[].class);
            for (Aeropuerto aeropuerto : aeropuertos) {
                System.out.println("Aeropuerto: " + aeropuerto);
            }

            List<Aeropuerto> aux = new ArrayList<>();
            for (Aeropuerto airport : aeropuertos) {
                if (airport.getCapacidad() > 70) {
                    aux.add(airport);
                } else {
                    //throw new CustomException();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}