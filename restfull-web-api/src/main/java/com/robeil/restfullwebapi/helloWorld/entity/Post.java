package com.robeil.restfullwebapi.helloWorld.entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.ManyToAny;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Post {

    private int postNumber;
    private String postType;

}
