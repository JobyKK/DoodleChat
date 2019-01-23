package com.example.doodlechat.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity(name = "USER")
public class User {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "owner")
    private List<Message> messageList;
}
