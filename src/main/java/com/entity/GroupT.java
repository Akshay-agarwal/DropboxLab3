package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity // This tells Hibernate to make a table out of this class
public class GroupT {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer groupId;

    private String group_name; //folder name

    private Integer owner_id;

    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "groupt")
    private Set<User> user;

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }


}
