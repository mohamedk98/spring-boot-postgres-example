package com.demo.pgExample.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "authorities")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Authorities {

    @EmbeddedId
    email_authorities id;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private User user;

}

@Embeddable
class email_authorities implements Serializable {
    String email;
    String authority;
}