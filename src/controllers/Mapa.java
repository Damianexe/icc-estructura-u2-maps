package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        linkedHashMap();
        treeMapa();
    }

    public void hashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        
        System.out.println("HashMap");
        System.out.println(mapa);

        // .containsKey() verifica si existe una llave en el mapa
        System.out.println("Hay Pera " + mapa.containsKey("Pera"));
        System.out.println("Hay Kiwi " + mapa.containsKey("Kiwi"));

        // Obtener el valor
        // .get() obtiene el valor de una llave
        System.out.println("Valor de Pera: " + mapa.get("Pera"));

        // Eliminar un elemento
        // .remove() elimina un elemento del mapa
        mapa.remove("Pera");
        System.out.println(mapa);
        System.out.println("--------------------");
    }

    public void linkedHashMap() {
        LinkedHashMap<String, Integer> mapaLHM = new LinkedHashMap<>();

        mapaLHM.put("Manzana", 10);
        mapaLHM.put("Pera", 11);
        mapaLHM.put("Durazno", 5);
        mapaLHM.put("Mango", 6);

        System.out.println("LinkedHashMap");
        System.out.println(mapaLHM);

        // .containsKey() verifica si existe una llave en el mapaLHM
        System.out.println("Hay Pera " + mapaLHM.containsKey("Pera"));
        System.out.println("Hay Kiwi " + mapaLHM.containsKey("Kiwi"));

        // Obtener el valor
        // .get() obtiene el valor de una llave
        System.out.println("Valor de Pera: " + mapaLHM.get("Pera"));

        // Eliminar un elemento
        // .remove() elimina un elemento del mapa
        mapaLHM.remove("Pera");
        System.out.println(mapaLHM);
        System.out.println("--------------------");
    }

    // El treeMap es el diccionario de la vida real
    public void treeMapa() {
        TreeMap<String, Integer> mapaTM = new TreeMap<>();

        mapaTM.put("Manzana", 10);
        mapaTM.put("Pera", 11);
        mapaTM.put("Durazno", 5);
        mapaTM.put("Mango", 6);

        System.out.println("TreeMap");
        System.out.println(mapaTM);

        // .containsKey() verifica si existe una llave en el mapaTM
        System.out.println("Hay Pera " + mapaTM.containsKey("Pera"));
        System.out.println("Hay Kiwi " + mapaTM.containsKey("Kiwi"));

        // Obtener el valor
        // .get() obtiene el valor de una llave
        System.out.println("Valor de Pera: " + mapaTM.get("Pera"));

        // Eliminar un elemento
        // .remove() elimina un elemento del mapa
        mapaTM.remove("Pera");
        System.out.println(mapaTM);
    }
}