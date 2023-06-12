//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mevaro.mevaro.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(
        name = "categories"
)
public class Category {
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
            name = "title",
            nullable = false
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String title;
    @Column(
            name = "url",
            nullable = false
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String url;
    @Column(
            name = "photo_url"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String photoUrl;
    @Column(
            name = "description"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String description;
    @Column(
            name = "created_at"
    )
    private Instant createdAt;
    @OneToMany(
            mappedBy = "category",
            cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER
    )
    @JsonManagedReference
    private Set<Product> products = new LinkedHashSet();

    public Category() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Set<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
