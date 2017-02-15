package com.theironyard.gardenofeden;

/**
 * Created by ryankielty on 2/13/17.
 */

public class PlantData {
    String acceptedSymbol;      //column 0
    String scientificName;      //column 2
    String commonName;          //column 3
    String category;            //column 4
    String genus;               //column 5
    String family;              //column 6
    String familyCommonName;    //column 7
    String order;               //column 8
    String plantSubClass;       //column 9
    String plantClass;          //column 10
    String subDivision;         //column 11
    String division;            //column 12
    String kingdom;             //column 13
    String duration;            //column 14
    String growthHabit;         //column 15
    String activeGrowthPeriod;  //column 16
    String shapeOrientation;    //column 17
    String toxicity;            //column 18
    String humanConsumption;    //column 19

    public PlantData(String acceptedSymbol, String scientificName, String commonName, String category, String genus, String family, String familyCommonName, String order, String plantSubClass, String plantClass, String subDivision, String division, String growthHabit, String activeGrowthPeriod, String shapeOrientation, String toxicity, String humanConsumption) {
        this.acceptedSymbol = acceptedSymbol;
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.category = category;
        this.genus = genus;
        this.family = family;
        this.familyCommonName = familyCommonName;
        this.order = order;
        this.plantSubClass = plantSubClass;
        this.plantClass = plantClass;
        this.subDivision = subDivision;
        this.division = division;
        this.growthHabit = growthHabit;
        this.activeGrowthPeriod = activeGrowthPeriod;
        this.shapeOrientation = shapeOrientation;
        this.toxicity = toxicity;
        this.humanConsumption = humanConsumption;
    }

    public PlantData(String category, String genus, String family, String familyCommonName, String order, String plantSubClass, String plantClass, String subDivision, String division) {
        this.category = category;
        this.genus = genus;
        this.family = family;
        this.familyCommonName = familyCommonName;
        this.order = order;
        this.plantSubClass = plantSubClass;
        this.plantClass = plantClass;
        this.subDivision = subDivision;
        this.division = division;
    }

    public PlantData(String growthHabit, String activeGrowthPeriod, String shapeOrientation, String toxicity, String humanConsumption) {
        this.growthHabit = growthHabit;
        this.activeGrowthPeriod = activeGrowthPeriod;
        this.shapeOrientation = shapeOrientation;
        this.toxicity = toxicity;
        this.humanConsumption = humanConsumption;
    }

    public PlantData(String acceptedSymbol, String scientificName, String commonName) {
        this.acceptedSymbol = acceptedSymbol;
        this.scientificName = scientificName;
        this.commonName = commonName;
    }

    public PlantData(String scientificName, String commonName) {
        this.scientificName = scientificName;
        this.commonName = commonName;
    }

    public PlantData() {
    }

    public PlantData(String acceptedSymbol) {
        this.acceptedSymbol = acceptedSymbol;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getAcceptedSymbol() {
        return acceptedSymbol;
    }

    public void setAcceptedSymbol(String acceptedSymbol) {
        this.acceptedSymbol = acceptedSymbol;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamilyCommonName() {
        return familyCommonName;
    }

    public void setFamilyCommonName(String familyCommonName) {
        this.familyCommonName = familyCommonName;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPlantSubClass() {
        return plantSubClass;
    }

    public void setPlantSubClass(String plantSubClass) {
        this.plantSubClass = plantSubClass;
    }

    public String getPlantClass() {
        return plantClass;
    }

    public void setPlantClass(String plantClass) {
        this.plantClass = plantClass;
    }

    public String getSubDivision() {
        return subDivision;
    }

    public void setSubDivision(String subDivision) {
        this.subDivision = subDivision;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getGrowthHabit() {
        return growthHabit;
    }

    public void setGrowthHabit(String growthHabit) {
        this.growthHabit = growthHabit;
    }

    public String getActiveGrowthPeriod() {
        return activeGrowthPeriod;
    }

    public void setActiveGrowthPeriod(String activeGrowthPeriod) {
        this.activeGrowthPeriod = activeGrowthPeriod;
    }

    public String getShapeOrientation() {
        return shapeOrientation;
    }

    public void setShapeOrientation(String shapeOrientation) {
        this.shapeOrientation = shapeOrientation;
    }

    public String getToxicity() {
        return toxicity;
    }

    public void setToxicity(String toxicity) {
        this.toxicity = toxicity;
    }

    public String getHumanConsumption() {
        return humanConsumption;
    }

    public void setHumanConsumption(String humanConsumption) {
        this.humanConsumption = humanConsumption;
    }
}
