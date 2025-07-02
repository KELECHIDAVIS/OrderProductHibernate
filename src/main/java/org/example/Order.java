package org.example;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private Date date;
    @Column(name = "customer_name")
    private Date customerName;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "order_detail",
            joinColumns = @JoinColumn(name="order_id"),
            inverseJoinColumns = @JoinColumn(name ="product_id")
    )
    private List<Product> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Date customerName) {
        this.customerName = customerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
