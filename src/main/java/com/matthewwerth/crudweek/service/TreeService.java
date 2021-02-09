package com.matthewwerth.crudweek.service;

import com.matthewwerth.crudweek.model.Tree;
import com.matthewwerth.crudweek.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TreeService {

    @Autowired
    private TreeRepository treeRepository;

    public List<Tree> getTrees() {
        List<Tree> trees = new ArrayList<>();
        treeRepository.findAll().forEach(trees::add);
        return trees;
    }

    public Tree getTreeByID(Long id) {
        return treeRepository.findById(id).orElse(null);
    }

    public void addTree(Tree tree) {
        treeRepository.save(tree);
    }

    public void updateTree(Long id, Tree tree) {
        Optional<Tree> foundTree = Optional.ofNullable(getTreeByID(id));
        tree.setId(foundTree.get().getId());
        treeRepository.save(tree);
    }

    public void removeTree(Long id) {
        treeRepository.deleteById(id);
    }
}
