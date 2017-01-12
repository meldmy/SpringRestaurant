package com.luv2code.springdemo.mvc.pojo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author Dmytro Melnychuk
 */
public class Tester {

    private String firstName;
    private String lastName;
    private String country;
    private String experienceLevel;
    private String favoriteLanguage;
    private List<String> choosenLanguages;
    private List<String> availableLanguages;

    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> experienceLevels;


    public Tester() {
        countryOptions = receiveAvailableTesterCountries();
        experienceLevels = receiveAvailableTesterExperience();
        availableLanguages = receiveAvailableLanguagesForTester();
    }

    private List<String> receiveAvailableLanguagesForTester() {

        return Arrays.asList("Polish", "English");
    }

    private LinkedHashMap<String, String> receiveAvailableTesterExperience() {
        LinkedHashMap<String, String> levelExperience = new LinkedHashMap<>();
        levelExperience.put("Junior", "Junior");
        levelExperience.put("Middle", "Middle");
        levelExperience.put("Senior", "Senior");
        return levelExperience;

    }

    private LinkedHashMap<String, String> receiveAvailableTesterCountries() {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("ENG", "England");
        countries.put("PL", "Poland");
        return countries;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getExperienceLevels() {
        return experienceLevels;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public List<String> getAvailableLanguages() {
        return availableLanguages;
    }

    public void setAvailableLanguages(List<String> availableLanguages) {
        this.availableLanguages = availableLanguages;
    }

    public List<String> getChoosenLanguages() {
        return choosenLanguages;
    }

    public void setChoosenLanguages(List<String> choosenLanguages) {
        this.choosenLanguages = choosenLanguages;
    }
}
