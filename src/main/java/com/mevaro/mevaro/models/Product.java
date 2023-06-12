package com.mevaro.mevaro.models;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.fasterxml.jackson.annotation.JsonBackReference;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(
        name = "product"
)
public class Product {
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
            name = "description"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String description;
    @Column(
            name = "photo_url"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String photoUrl;
    @Column(
            name = "width"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String width;
    @Column(
            name = "compoud"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String compoud;
    @Column(
            name = "density"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String density;
    @Column(
            name = "video_url"
    )
    @Type(
            type = "org.hibernate.type.TextType"
    )
    private String videoUrl;
    @Column(
            name = "created_at"
    )
    private Instant createdAt;
    @Column(
            name = "test_mater"
    )
    private String test_mater;
    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "category_id"
    )
    @JsonBackReference
    private Category category;
    @OneToMany(
            mappedBy = "product",
            cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER
    )
    @JsonManagedReference
    private Set<OrderProduct> orderProducts = new LinkedHashSet();
    @Column(
            name = "money"
    )
    private Long money;

    public Product() {
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getWidth() {
        return this.width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getCompoud() {
        return this.compoud;
    }

    public void setCompoud(String compoud) {
        this.compoud = compoud;
    }

    public String getDensity() {
        return this.density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getMoney() {
        return this.money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getTest_mater() {
        return this.test_mater;
    }

    public void setTest_mater(String test_mater) {
        this.test_mater = test_mater;
    }
}
