package io.datajek.databaserelationships.manytomany.repository;

import io.datajek.databaserelationships.manytomany.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
