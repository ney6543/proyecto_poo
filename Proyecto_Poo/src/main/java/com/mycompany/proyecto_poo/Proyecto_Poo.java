/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author emilio
 */
public class Proyecto_Poo {

    public static void main(String[] args) {
        List<Alumno> alumnado = new ArrayList<Alumno>();  
        Integer creditosNecesarios[] = {46, 90, 136, 178, 220, 268, 314, 360, 404, 444, 484, 484, 484, 484, 484};
        NodoEstadistico rootMadre = new NodoEstadistico(1, "1", 0, 0);
        PlanEstudiosEstadisticos planMadre = new PlanEstudiosEstadisticos(rootMadre);
        planMadre.innit();
        String nombres[] = {"Emilio", "Brayan", "Cris"};
        String apellidos[] = {"Garcia", "Montez", "Cristero"};
        Alumno alu = new Alumno();
        String path = null;
        
        
        for(int i = 0; i<50; i++){
            alu = alu.generarAlumno(nombres, apellidos, creditosNecesarios, planMadre);
            alumnado.add(alu);
            //System.out.println("ALU " + alu.plan.to_string());
            //path = alu.plan.to_string();
        }
        alumnado.sort(Comparator.comparing(Alumno::getIndicadorEscolar).thenComparing(Alumno::getIndicadorEscolar));
        Collections.reverse(alumnado);
        
        for(int i = 0; i<50; i++){
            System.out.println(i + " " + alumnado.get(i).getIndicadorEscolar() + " " + alumnado.get(i).getNombre() + " " + alumnado.get(i).getApellidoPaterno() + " " + alumnado.get(i).getApellidoMaterno());
        }
    }
}























