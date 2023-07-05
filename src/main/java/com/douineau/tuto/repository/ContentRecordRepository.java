package com.douineau.tuto.repository;

import com.douineau.tuto.model.ContentRecord;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRecordRepository extends ListCrudRepository<ContentRecord, Integer> {
}
