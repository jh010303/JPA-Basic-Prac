package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
public abstract class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @OneToMany(mappedBy = "item")
    private List<Category_item> categories = new ArrayList<Category_item>();

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public List<Category_item> getCategories() {
        return categories;
    }

    public void setCategories(List<Category_item> categories) {
        this.categories = categories;
    }
}
