package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Category parent;

    @OneToMany
    private List<Category> child = new ArrayList<Category>();

    @OneToMany(mappedBy = "category")
    private List<Category_item> categories = new ArrayList<Category_item>();


}
