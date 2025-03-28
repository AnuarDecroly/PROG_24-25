package com;

public class CharacterDC {
    private int id;
    private String heroName;
    private String fullName;

    private String image1;
    private String image2;
    private String image3;

    private String gender;
    private String race;
    private String aligment;

    public CharacterDC(int id, String heroName, String fullName, String gender,  String race, String aligment) {
        this.aligment = aligment;
        this.fullName = fullName;
        this.gender = gender;
        this.heroName = heroName;
        this.id = id;
        this.race = race;
    }

    public int getId() {
        return id;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getImage1() {
        return image1;
    }

    public String getImage2() {
        return image2;
    }

    public String getImage3() {
        return image3;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getAligment() {
        return aligment;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAligment(String aligment) {
        this.aligment = aligment;
    }

    
    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    @Override
    public String toString() {
        return "CharacterDC [id=" + id + ", heroName=" + heroName + ", fullName=" + fullName + ", gender=" + gender
                + ", race=" + race + ", aligment=" + aligment + "]";
    }

    

}
