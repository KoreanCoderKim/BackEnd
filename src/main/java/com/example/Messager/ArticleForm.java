package com.example.Messager;

import com.example.Messager.Ariticle;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private String Name;
    private String content;


    public Ariticle toEntity() {
        return new Ariticle(null,Name,content);
    }
}
