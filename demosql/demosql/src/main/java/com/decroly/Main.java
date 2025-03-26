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

        List<CharacterDC> characters = miDcData.getCharacters();

        for(CharacterDC c : characters){
            System.out.println(c);
        }


    }
}