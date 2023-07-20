package com.douineau.tuto.repository;

import com.douineau.tuto.model.Content;
import com.douineau.tuto.model.Status;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query("SELECT c FROM Content c WHERE c.status = :status ")
    List<Content> listByStatus(@Param("status") Status status);
}
