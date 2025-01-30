package com.example.Messager;

import com.example.Messager.Ariticle;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface ArticleRepository extends CrudRepository<Ariticle,String> {
    @Override
    ArrayList<Ariticle> findAll();
}
