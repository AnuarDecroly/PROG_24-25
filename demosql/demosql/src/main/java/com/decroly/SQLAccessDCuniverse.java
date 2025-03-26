package com.decroly;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.CharacterDC;

public class SQLAccessDCuniverse {

    public List<String> getCharactersName(){
        List<String> charactersNames = new LinkedList<>();

        //Setencia SQL
        String getChNames = "SELECT heroName FROM characters";

        try (Connection connection = SQLDataBaseManager.getConnection(); Statement statement = connection.createStatement();
        ResultSet dataSet = statement.executeQuery(getChNames);) {
            while(dataSet.next()){
                charactersNames.add(dataSet.getNString(1));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return charactersNames;
    }

    public List<CharacterDC> getCharacters(){
        List<CharacterDC> charactersNames = new LinkedList<>();

        //Setencia SQL
        String getChNames = "SELECT * FROM characters";

        try (Connection connection = SQLDataBaseManager.getConnection(); Statement statement = connection.createStatement();
        ResultSet dataSet = statement.executeQuery(getChNames);) {
            while(dataSet.next()){
                int id = dataSet.getInt(1);
                String name = dataSet.getNString(2);
                String fullname = dataSet.getNString(3);
                String gender = dataSet.getNString(7);
                String race = dataSet.getNString(8);
                String aligment = dataSet.getNString(9);

                CharacterDC c1 =  new CharacterDC(id, name, fullname, gender, race, aligment);
                charactersNames.add(c1);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return charactersNames;
    }

}
