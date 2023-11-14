/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_poo;

/**
 *
 * @author emilio
 */
public class Proyecto_Poo {

    public static void main(String[] args) {
        Integer creditosNecesarios[] = {46, 90, 136, 178, 220, 268, 314, 360, 404, 444, 484, 484, 484, 484, 484};
        Nodo root = new Nodo(1, "1", 0, 0);
        Alumno alu = new Alumno();
        String nombres[] = {"Emilio", "Brayan", "Cris"};
        String apellidos[] = {"Garcia", "Montez", "Cristero"};
        alu.generarAlumno(nombres, apellidos, creditosNecesarios);
        
    }
}























