package com.matthewwerth.crudweek.controller;

import com.matthewwerth.crudweek.model.Tree;
import com.matthewwerth.crudweek.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TreeController {

    @Autowired
    private TreeService treeService; //for dependency injection

    @GetMapping("/")
    public String landing() {
        return "Hi There!";
    }

    @GetMapping("/trees")
    public List<Tree> getTrees() {
        return treeService.getTrees();
    }

    @GetMapping("/trees/{id}")
    public Tree getTreeByID(@PathVariable Long id) {
        return treeService.getTreeByID(id);
    }

    @PostMapping("/trees")
    public void addTree(@RequestBody Tree tree) {
        treeService.addTree(tree);
    }

    @PutMapping("/trees/{id}")
    public void updateTree(@RequestBody Tree tree, @PathVariable Long id) {
        treeService.updateTree(id, tree);
    }

    @DeleteMapping("/trees/{id}")
    public void deleteTree(@PathVariable Long id) {
        treeService.removeTree(id);
    }

}
