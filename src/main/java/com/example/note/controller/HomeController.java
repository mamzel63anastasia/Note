package com.example.note.controller;

import com.example.note.model.Page;
import com.example.note.repository.PageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/")
public class HomeController {

    private Page page;

    private final PageRepository pageRepo;

    public HomeController(PageRepository pageRepo) {
        this.pageRepo = pageRepo;
    }

    @GetMapping
    public String homePage() {
        return "main";
    }

    @ModelAttribute(name = "pageList")
    public List<Page> pageList() {
        return StreamSupport.stream(pageRepo.findAll().spliterator(), false).collect(Collectors.toList());
    }



}
