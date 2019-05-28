package com.vikas.Model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="custom", initialValue = 45291)
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom")
    private Integer Univ_id;

    private String Univ_name;

    private String Univ_country;

    public Integer getUniv_id() {
        return Univ_id;
    }

    public void setUniv_id(Integer univ_id) {
        Univ_id = univ_id;
    }

    public String getUniv_name() {
        return Univ_name;
    }

    public void setUniv_name(String univ_name) {
        Univ_name = univ_name;
    }

    public String getUniv_country() {
        return Univ_country;
    }

    public void setUniv_country(String univ_country) {
        Univ_country = univ_country;
    }

    public University(Integer id, String univ_name, String univ_country) {
        this.Univ_id = id;
        Univ_name = univ_name;
        Univ_country = univ_country;
    }
    public University(){

    }

}
