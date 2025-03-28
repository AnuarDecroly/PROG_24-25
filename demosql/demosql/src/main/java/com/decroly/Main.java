package com.decroly;

import java.util.List;

import com.CharacterDC;

public class Main {
    public static void main(String[] args) {
        
        SQLAccessDCuniverse miDcData = new SQLAccessDCuniverse();

        List<String> names = miDcData.getCharactersName();

        for(String nm : names){
            System.out.println(nm);
        }

        System.out.println("\nBusqueda por nombre: Superman");
        List<CharacterDC> characters = miDcData.getCharacterByName("Superman");

        for(CharacterDC c : characters){
            System.out.println(c);
        }

        System.out.println("\nBusqueda por alineamiento: good");
        List<CharacterDC> charactersAligment = miDcData.getCharacterByAligment("bad");

        for(CharacterDC c : charactersAligment){
            System.out.println(c);
        }

        System.out.println("\nBusqueda por nombre y alterEgo");
        List<CharacterDC> charactersNameAndAlter = miDcData.getCharacterByNameAndAlterEgo("Batman2", "Bruce Wayne");

        if(charactersNameAndAlter.isEmpty()){
            System.out.println("No se ha encontrado ningun resultado");
        }else{
            for(CharacterDC c : charactersNameAndAlter){
                System.out.println(c);
            }
        }

        System.out.println("\n Eliminar por id: 24");
        int response = miDcData.deleteById(24);
        System.out.println("Se han borrado " + response + " elementos");

        System.out.println("\n Insertar un Heroe");
        CharacterDC newHero = new CharacterDC(-1, "Profesor Khan", "Anuar Khan", "male", "human", "neutral");
        newHero.setImage1("https://www.ciempiesmagazine.com/wp-content/uploads/2016/04/doctor_strange_2016-HD.jpg");
        newHero.setImage2("https://www.ciempiesmagazine.com/wp-content/uploads/2016/04/doctor_strange_2016-HD.jpg");
        newHero.setImage3("https://www.ciempiesmagazine.com/wp-content/uploads/2016/04/doctor_strange_2016-HD.jpg");
        
        int response2 = miDcData.insertCharacter(newHero);
        System.out.println("Se han insertado " + response2 + " elementos");

        System.out.println("\nBusqueda por nombre: HeroTest");
        List<CharacterDC> charactersTest = miDcData.getCharacterByName("HeroTest");

        CharacterDC miHeroModidy = charactersTest.getFirst();
        miHeroModidy.setFullName("Heroe Modificado2");
        miHeroModidy.setAligment("Neutral");

        miDcData.updateCharacterById(miHeroModidy);





    }
}