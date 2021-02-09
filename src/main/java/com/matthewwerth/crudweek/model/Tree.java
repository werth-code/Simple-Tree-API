package com.matthewwerth.crudweek.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Tree {

    @Id // marks this as the primary key of the database..
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location; //Correct: 41.40338, 2.17403.
    private PlantingZone plantingZone; // auto look-up based on gps location of tree.
    private TreeType treeType;
    private LocalDate datePlanted;
    private Boolean requiresCrossPollination;

    public Tree(){};

    public Tree(String location, TreeType treeType, Boolean requiresPollination) {
        this.location = location;
        this.treeType = treeType;
        this.requiresCrossPollination = requiresPollination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PlantingZone getPlantingZone() {
        return plantingZone;
    }

    public void setPlantingZone(PlantingZone plantingZone) {
        this.plantingZone = plantingZone;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public LocalDate getDatePlanted() {
        return datePlanted;
    }

    public void setDatePlanted(LocalDate datePlanted) {
        this.datePlanted = datePlanted;
    }

    public Boolean getRequiresCrossPollination() {
        return requiresCrossPollination;
    }

    public void setRequiresCrossPollination(Boolean requiresCrossPollination) {
        this.requiresCrossPollination = requiresCrossPollination;
    }

    @Override
        public String toString() {
            return "Tree {" +
                    "id='" + id + '\'' +
                    ", location='" + location + '\'' +
                    ", treeType=" + treeType +
                    '}';
        }
    }

