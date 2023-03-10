package com.concious.self.idea.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.concious.self.idea.jpa.model.Grade;

public interface GradeStore extends CrudRepository<Grade, Long> {
    List<Grade> findByStudentId(Long id);
}
