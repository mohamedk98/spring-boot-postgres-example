package com.demo.pgExample.pojos;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class StudentPojo {

    private String firstName;

    private String lastName;

    private String email;

    public StudentPojo(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}


// 45
// 39
// 53
// 55
