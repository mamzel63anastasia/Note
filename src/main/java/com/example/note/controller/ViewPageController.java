package com.example.note.controller;


import com.example.note.repository.PageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/view/{id}")
public class ViewPageController {

    private PageRepository pageRepo;

    public ViewPageController(PageRepository pageRepo) {
        this.pageRepo = pageRepo;
    }

    @GetMapping
    public String homeViewPage() {
        return "viewPage";
    }

    @ModelAttribute
    public void buildPage(@PathVariable String id, Model model){
        model.addAttribute("pageV",
                pageRepo.findById(Long.parseLong(id)).get());
    }

}
