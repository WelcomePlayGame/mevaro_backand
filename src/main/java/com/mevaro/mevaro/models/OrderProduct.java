package com.mevaro.mevaro.models;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.fasterxml.jackson.annotation.JsonBackReference;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(
        name = "order_product"
)
public class OrderProduct {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id",
            nullable = false
    )
    private Long id;
    @Column(
            name = "name",
            nullable = false
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String name;
    @Column(
            name = "phone",
            nullable = false
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String phone;
    @Column(
            name = "city"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String city;
    @Column(
            name = "poshta"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String poshta;
    @Column(
            name = "price",
            nullable = false
    )
    private Long price;
    @Column(
            name = "meter",
            nullable = false
    )
    private Long meter;
    @Column(
            name = "create_at"
    )
    private Instant create_at;
    @Column(
            name = "title",
            nullable = false
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String title;
    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "product_id"
    )
    @JsonBackReference
    private Product product;

    public OrderProduct() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPoshta() {
        return this.poshta;
    }

    public void setPoshta(String poshta) {
        this.poshta = poshta;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getMeter() {
        return this.meter;
    }

    public void setMeter(Long meter) {
        this.meter = meter;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Instant getCreate_at() {
        return this.create_at;
    }

    public void setCreate_at(Instant create_at) {
        this.create_at = create_at;
    }
}
