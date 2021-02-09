package com.matthewwerth.crudweek.repository;

import com.matthewwerth.crudweek.model.Tree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeRepository extends JpaRepository<Tree, Long> {

}
