package com.example.note.controller;

import com.example.note.model.Page;
import com.example.note.model.form.PageForm;
import com.example.note.repository.PageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class AddPageController {
    private PageRepository pageRepo;

    public AddPageController(PageRepository pageRepo) {
        this.pageRepo = pageRepo;
    }

    @GetMapping
    public String getPage(){
        return "addPage";
    }

    @PostMapping
    public String processAddPage(PageForm form) {
        pageRepo.save(new Page(form.getNamePage(), form.getTextPage(), form.getShortText()));
        return "redirect:/";
    }

    @ModelAttribute(name = "myPage")
    public PageForm getForm() {
        return new PageForm();
    }

}
