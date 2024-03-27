package com.example.mallapi.service;

import com.example.mallapi.dto.PageRequestDTO;
import com.example.mallapi.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
@Log4j2
class TodoServiceImplTest {

    @Autowired
    TodoService todoService;

    @Test
    public void getTest() {
        Long tno = 50L;

        log.info(todoService.get(tno));
    }

    @Test
    public void registerTest() {
        TodoDTO todoDTO = TodoDTO.builder()
                .title("Title")
                .writer("tester")
                .content("Content")
                .dueDate(LocalDate.now())
                .build();

        log.info(todoService.register(todoDTO));
    }

    @Test
    public void getListTest() {

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(11).build();

        log.info(todoService.getList(pageRequestDTO));
    }
}