package com.kraken.blogg.repo;

import com.kraken.blogg.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
