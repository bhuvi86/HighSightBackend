package com.highsight.highsightbackend.controller;

import com.highsight.highsightbackend.repo.PagesRepository;
import com.highsight.highsightbackend.repo.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pages")

public class PageController {

    @Autowired
    PagesRepository pagesRepository;

    @GetMapping(path = "/", produces = "application/json")
    public List<Page> getPageByURL() {
        return pagesRepository.getPageByURL();
    }
}