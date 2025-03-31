package com.decroly;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public List<CharacterDC> getCharacterByName(String characterName){
        List<CharacterDC> charactersNames = new LinkedList<>();

        String sqlStatement = "SELECT * FROM characters where heroName = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);) {

            statement.setString(1, characterName);
            ResultSet dataSet = statement.executeQuery();

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


    public List<CharacterDC> getCharacterByNameAndAlterEgo(String characterName, String alterEgo){
        List<CharacterDC> charactersNames = new LinkedList<>();

        String sqlStatement = "SELECT * FROM characters where heroName = ? and fullName = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);) {

            statement.setString(1, characterName);
            statement.setString(2, alterEgo);

            ResultSet dataSet = statement.executeQuery();

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

    public List<CharacterDC> getCharacterByAligment(String characterAligment){
        List<CharacterDC> charactersNames = new LinkedList<>();

        String sqlStatement = "SELECT * FROM characters where alignment = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);) {

            statement.setString(1, characterAligment);
            ResultSet dataSet = statement.executeQuery();

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

    public int deleteById(int id){
        int elements = -1;

        String sqlStatement = "DELETE FROM powerstats where characters_id = ?";
        String sqlStatement2 = "DELETE FROM characters where id = ? ;";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement1 = connection.prepareStatement(sqlStatement); PreparedStatement statement2 = connection.prepareStatement(sqlStatement2);) {

            statement1.setInt(1, id);
            statement2.setInt(1, id);
            
            elements = statement1.executeUpdate();
            elements += statement2.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return elements;
    }


    public int insertCharacter(CharacterDC character){
        int response = -1;
        String sqlStatement = "INSERT INTO characters (heroName, fullName, image1, image2, image3, gender, race, alignment)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);) {

            statement.setNString(1, character.getHeroName());
            statement.setNString(2, character.getFullName());
            statement.setNString(3, character.getImage1());
            statement.setNString(4, character.getImage2());
            statement.setNString(5, character.getImage3());
            statement.setNString(6, character.getGender());
            statement.setNString(7, character.getRace());
            statement.setNString(8, character.getAligment());

            response = statement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return response;
    }

    public int updateCharacterById(CharacterDC character){
        int response = -1;
        String sqlStatement = "UPDATE characters set heroName = ? , fullName = ?, alignment = ? where id = ?";

        try (Connection connection = SQLDataBaseManager.getConnection(); PreparedStatement statement = connection.prepareStatement(sqlStatement);) {
            statement.setNString(1, character.getHeroName());
            statement.setNString(2, character.getFullName());
            statement.setNString(3, character.getAligment());
            statement.setInt(4, character.getId());

            statement.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());        }
        return response;
    }
}
