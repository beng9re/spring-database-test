package com.example.springdatabasetest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class MemoService {
    //JPA 메모 레포지토리
    private final MemoRepository memoRepository;

    public MemoService(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }

    public Optional<Memo> findMemo(Memo save) {
        Memo save1 = memoRepository.save(save);

        ///
        ///
        return memoRepository.findById(save1.getId());
    }

}
