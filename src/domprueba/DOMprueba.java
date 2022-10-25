/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domprueba;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import model.Persona;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author a21cristinaaf
 */
public class DOMprueba {

    private static final String PERSONAS_TAG = "personas";
    private static final String PERSONA_TAG = "persona";
    private static final String ID_TAG = "id";
    private static final String BORRADO_TAG = "borrado";
    private static final String NOMBRE_TAG = "nombre";
    private static final String DNI_TAG = "dni";
    private static final String EDAD_TAG = "edad";
    private static final String SALARIO_TAG = "salario";

    private static final String VERSIONES_INPUT_FILE = Paths.get("src", "docs", "personas.xml").toString();

    public static void main(String[] args) {

        String persona;
        String nombre;
        int id = 0;
        int edad = 0;
        String dni;

        float salario = 0;
        boolean borrado=false;
        Persona pers = null;

        ArrayList<Persona> persons = new ArrayList<>();
        int contador = 1;
        try {
            File inputFile = new File(VERSIONES_INPUT_FILE);

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element :"
                    + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName(PERSONA_TAG);
            System.out.println("----------------------------");
            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    id = Integer.parseInt(eElement.getAttribute(ID_TAG));
                    borrado = Boolean.parseBoolean(eElement.getAttribute(BORRADO_TAG));
                    nombre = eElement.getElementsByTagName(NOMBRE_TAG).item(0).getTextContent();
                    dni = eElement.getElementsByTagName(DNI_TAG).item(0).getTextContent();
                    edad = Integer.parseInt(eElement.getElementsByTagName(EDAD_TAG).item(0).getTextContent());
                    salario = Float.parseFloat(eElement.getElementsByTagName(SALARIO_TAG).item(0).getTextContent());

                    pers = new Persona(id, borrado, nombre, dni, edad, salario);

                    persons.add(pers);
                }
            }

            for (Persona v : persons) {
                System.out.println("Persona: " + contador + " " + v);
                contador++;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Ha ocurrido una exception: " + e.getMessage());
        }
    }

}
