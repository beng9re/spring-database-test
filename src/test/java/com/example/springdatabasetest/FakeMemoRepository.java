package com.example.springdatabasetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FakeMemoRepository implements MemoRepository {

    Map<Long, Memo> db  = new HashMap<>();

    @Override
    public Memo save(Memo memo) {
        Long key = db.keySet().stream().max(Long::compareTo).orElse(0L) + 1L;
        memo.setId(key);
        db.put(key, memo);
        return db.get(key);
    }

    @Override
    public Optional<Memo> findById(Long memoId) {
        return Optional.ofNullable(db.get(memoId));
    }
}
