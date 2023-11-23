package POOCLASESABSTRACTAS;

import POOCLASESABSTRACTAS.Elementos.ElementoForm;
import POOCLASESABSTRACTAS.Elementos.InputForm;
import POOCLASESABSTRACTAS.Elementos.SelectForm;
import POOCLASESABSTRACTAS.Elementos.TextAreaForm;
import POOCLASESABSTRACTAS.Opcion.Opcion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email","email");
        InputForm edad = new InputForm("edad","edad");
        TextAreaForm experiencia = new TextAreaForm("exp",10,20);
        username.setValor("jhon.doe");
        password.setValor("123");
        email.setValor("asdasds@correo.com");
        edad.setValor("28");
        experiencia.setValor("eajhdba experiencia...");
        



        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1","Java");
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","JavaScript"));
        lenguaje.addOpcion(new Opcion("4","TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));


        List<ElementoForm> elementoForms = new ArrayList<>();
        elementoForms.add(username);
        elementoForms.add(password);
        elementoForms.add(email);
        elementoForms.add(edad);
        elementoForms.add(experiencia);
        elementoForms.add(lenguaje);
        for (ElementoForm element:elementoForms) {
            System.out.println(element.dibujarHtml());
        }

    }
}
