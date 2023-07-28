package com.example.note.repository;

import com.example.note.model.Page;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageRepository extends CrudRepository<Page, Long> {
}
