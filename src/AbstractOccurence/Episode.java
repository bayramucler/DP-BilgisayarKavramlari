/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractOccurence;

/**
 *
 * @author uclerpc
 */
public class Episode {
    
    private String name;
    private int number;
    private int year;
    
    public Episode(String name, int number){
        this.name=name;
        this.number=number;
    }
    
    public Episode(String name, int number, int year){
        this.name=name;
        this.number=number;
        this.year=year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
