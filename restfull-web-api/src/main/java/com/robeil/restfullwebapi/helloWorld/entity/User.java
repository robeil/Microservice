package com.robeil.restfullwebapi.helloWorld.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer userId;
    @NotEmpty
    @Size(min = 2)
    private String name;
    //@Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;



}
