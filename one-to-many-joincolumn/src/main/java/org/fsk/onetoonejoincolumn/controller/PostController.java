package org.fsk.onetoonejoincolumn.controller;


import lombok.RequiredArgsConstructor;
import org.fsk.onetoonejoincolumn.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/post")
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/")
    public void loadData() {
        postService.loadDataToDb();
    }
}
