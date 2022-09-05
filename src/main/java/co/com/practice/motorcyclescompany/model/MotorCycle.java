package co.com.practice.motorcyclescompany.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MotorCycle {
    private String motorcycleId;
    private String nombre;
    private String marca;
    private String modelo;
    private String cilindraje; 
    private int precio;

    public MotorCycle(String motorcycleId, String nombre, String marca, String modelo, String cilindraje, int precio) {
        this.motorcycleId = motorcycleId;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.precio = precio;
    }
    
}
