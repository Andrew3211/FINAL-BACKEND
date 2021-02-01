package com.rudnev.finalproject.domains;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TagCollection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long collectionID;
    private Long tagID;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TagCollectionCollectionID")
    private Collection collection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tagCollection")
    private List<Tag> tags = new ArrayList<Tag>();

    public TagCollection() {}

    public Long getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(Long collectionID) {
        this.collectionID = collectionID;
    }

    public Long getTagID() {
        return tagID;
    }

    public void setTagID(Long tagID) {
        this.tagID = tagID;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
