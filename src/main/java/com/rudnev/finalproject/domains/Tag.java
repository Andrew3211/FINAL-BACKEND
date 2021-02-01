package com.rudnev.finalproject.domains;

import javax.persistence.*;

@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tagID;
    private String title;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TagTagCollectionID")
    private TagCollection tagCollection;

    public Tag() {}

    public Tag(String title) {
        this.title = title;
    }

    public Long getTagID() {
        return tagID;
    }

    public void setTagID(Long tagID) {
        this.tagID = tagID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
