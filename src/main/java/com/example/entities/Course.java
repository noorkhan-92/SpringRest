
package com.example.entities;

import javax.persistence.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Course {
   
    @Id
    private long id;
    private String title;
    private String description;
    private String instructor;

    public Course(long id, String title, String description, String instructor) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructor = instructor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", title=" + title + ", description=" + description + ", instructor=" + instructor + '}';
    }
    
}
