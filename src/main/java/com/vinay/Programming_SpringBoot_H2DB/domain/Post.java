package com.vinay.Programming_SpringBoot_H2DB.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.AUTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column
    private String comment;

    //Bi-Directional :: Many-To-One Mapping
    //@JsonIgnore
    //@ManyToOne
    //@JoinColumn(name = "user_id")
    //private User user;

}
