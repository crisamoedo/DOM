/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domprueba;

import java.nio.file.Paths;

/**
 *
 * @author a21cristinaaf
 */
public class DOMpruebaNS {

    private static final String PERSONAS_TAG = "personas";
    private static final String PERSONA_TAG = "persona";
    private static final String PERSONA_Q_TAG= "a:persona";
    private static final String ID_TAG = "id";
    private static final String BORRADO_TAG = "borrado";
    private static final String NOMBRE_TAG = "nombre";
    private static final String DNI_TAG = "dni";
    private static final String EDAD_TAG = "edad";
    private static final String SALARIO_TAG = "salario";
    
    
    private static final String PERSONAS_NS_URI = "http://www.personas.com";
    private static final String PERSONAS_NS_URI2 = "http://www.personas.com/active";
    
    
    private static final String PERSONAS_INPUT_FILE = Paths.get("src", "docs", "personas_ns.xml").toString();
    

}
