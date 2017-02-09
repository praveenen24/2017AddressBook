package test;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by praveenensrikumaran on 1/12/2017.
 */
@Entity
public class BuddyInfo {

    private String name;

    @Id
    private String number;

    public BuddyInfo() {

    }

    public BuddyInfo(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        return this.number.equals(((BuddyInfo) o).number);
    }

    @Override
    public String toString() {
        return "Name : " + name + " | Number : " + number;
    }
}