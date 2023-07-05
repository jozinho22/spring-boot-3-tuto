package com.douineau.tuto.config;

import com.douineau.tuto.model.Content;
import com.douineau.tuto.model.ContentRecord;
import com.douineau.tuto.model.Status;
import com.douineau.tuto.model.Type;
import com.douineau.tuto.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Profile("!prod")
@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ContentRepository repo;

    @Override
    public void run(String... args) throws Exception {
        Content c = new Content(
                null,
                "My post",
                "My first post : new article",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );
        repo.save(c);
    }
}
