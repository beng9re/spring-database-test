package com.example.springdatabasetest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemoRepository {

    Memo save(Memo memo);
    Optional<Memo> findById(Long memoId);
}
