package com.example.springdatabasetest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemoRepository extends JpaRepository<Memo, Long>, MemoRepository {
}
