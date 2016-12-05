package org.baeldung.persistence.deletion.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BAR")
public class Bar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    List<Baz> bazList = new ArrayList<>();

    public Bar() {
        super();
    }

    public Bar(final String name) {
        super();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Baz> getBazList() {
        return bazList;
    }

    public void setBazList(final List<Baz> bazList) {
        this.bazList = bazList;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Bar [name=").append(name).append("]").toString();
    }
}
