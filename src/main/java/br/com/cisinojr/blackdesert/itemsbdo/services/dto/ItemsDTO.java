package br.com.cisinojr.blackdesert.itemsbdo.services.dto;

import java.io.Serializable;
import java.util.Objects;

public class ItemsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer grade;

    private String icon;

    public ItemsDTO() {
    }

    public ItemsDTO(String name, Integer grade, String icon) {
        this.name = name;
        this.grade = grade;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemsDTO itemsDTO = (ItemsDTO) o;
        return Objects.equals(name, itemsDTO.name) &&
                Objects.equals(grade, itemsDTO.grade) &&
                Objects.equals(icon, itemsDTO.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, icon);
    }

    @Override
    public String toString() {
        return "ItemsDTO{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", icon='" + icon + '\'' +
                '}';
    }
}
