package com.example.Messager;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@ToString
@Getter
public class Ariticle {
    @Id
    @GeneratedValue
    private Long id;
    private String Name;
    @Column
    private String content;

    Ariticle() {

    }
}