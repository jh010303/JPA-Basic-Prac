package jpabook.jpashop.domain;

import jakarta.persistence.*;

@Entity
public class Category_item {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;

}
