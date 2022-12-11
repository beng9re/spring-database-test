package com.example.springdatabasetest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class MemoRepositoryTest {

    @Autowired
    private MemoRepository memoRepository;


    @Test //BDD 행위기반 테스트
    void find를_한다() {
        //given
        Memo memo = new Memo("텍스트");
        Memo save = memoRepository.save(memo);

        //when
        Optional<Memo> resultMemo = memoRepository.findById(save.getId());

        //then
        assertThat(resultMemo).isPresent();
        assertThat(resultMemo.get().getText()).isEqualTo(memo.getText());
    }

}