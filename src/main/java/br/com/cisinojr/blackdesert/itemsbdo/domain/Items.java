package br.com.cisinojr.blackdesert.itemsbdo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "items")
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Integer grade;

    @Column
    private String icon;

    public Items() {

    }

    public Items(Long id, String name, Integer grade, String icon) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        Items items = (Items) o;
        return Objects.equals(id, items.id) &&
                Objects.equals(name, items.name) &&
                Objects.equals(grade, items.grade) &&
                Objects.equals(icon, items.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade, icon);
    }
}
