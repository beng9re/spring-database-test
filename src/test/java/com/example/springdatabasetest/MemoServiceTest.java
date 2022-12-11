package com.example.springdatabasetest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

class MemoServiceTest {
    // 모키토에 가짜객체를 만든것
    private MemoRepository memoRepository = new FakeMemoRepository();

    //주입 받는것
    private MemoService memoService = new MemoService(memoRepository);

    @Test
    void test() {
        Memo memo = new Memo("텍스트");

        Optional<Memo> memo2 = memoService.findMemo(memo);

        assertThat(memo2).isPresent();
    }

}