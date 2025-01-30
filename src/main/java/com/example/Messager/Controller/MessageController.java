package com.example.Messager.Controller;

import com.example.Messager.Ariticle;
import com.example.Messager.ArticleForm;
import com.example.Messager.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;

@Slf4j
@Controller
public class MessageController {
    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/user")
    public String S() { return "user1";}
    @PostMapping("/create")
    public String createArticle(ArticleForm form, Model model) {
        //공백 문자는 전송이 불가능하게 한다.
        ArrayList<Ariticle> arrList = new ArrayList<Ariticle>();
        for (Ariticle a : articleRepository.findAll()) {
            if (a.getContent().isEmpty() || a.getName().isEmpty()) { //입력 부재인 문자는 출력 불가
                continue;
            }
            arrList.add(a);
        }
        model.addAttribute("articleList", arrList);
        Ariticle article = form.toEntity();
        Ariticle saved = articleRepository.save(article);
        return "user1";
    }
}