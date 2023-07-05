package com.douineau.tuto.repository;

import com.douineau.tuto.model.ContentRecord;
import com.douineau.tuto.model.Status;
import com.douineau.tuto.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<ContentRecord> contentRecords = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<ContentRecord> findAll() {return contentRecords;}

    public Optional<ContentRecord> findById(Integer id) {
        return contentRecords.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public boolean existsById(Integer id) {
        return contentRecords.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void save(ContentRecord contentRecord) {
        contentRecords.removeIf(c -> c.id().equals(contentRecord.id()));
        contentRecords.add(contentRecord);
    }

    public void delete(Integer id) {
        contentRecords.removeIf(c -> c.id().equals(id));
    }

    @PostConstruct
    private void init() {
        ContentRecord c = new ContentRecord(
                1,
                "My post",
                "My first post : new article",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );
        contentRecords.add(c);
    }
}
