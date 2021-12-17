package com.example.easynotes.repository;

import com.example.easynotes.model.Thank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThankRepository extends JpaRepository<Thank, Long> {
    List<Thank> findByNoteId(Long note_id);
}
