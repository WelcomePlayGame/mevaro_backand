package com.mevaro.mevaro.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "image")
    private byte[] image;

    @Column(name = "title", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String title;

    @Column(name = "url", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}