package com.example.springioc.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChefTest {

    @Autowired
    private IngridentsFactory ingridentsFactory;

    @Autowired
    private Chef chef;

    @Test
    void beef(){

        // 준비
        String menu = "beef";

        // 수행
        String food = chef.cook(menu);

        // 예상
        String expected = "beef-beef";

        // 검증
        assertEquals(expected, food);

    }

    @Test
    void pork(){

        // 준비
        String menu = "pork";

        // 수행
        String food = chef.cook(menu);

        // 예상
        String expected = "pork-pork";

        // 검증
        assertEquals(expected, food);

    }

    @Test
    void chicken(){

        // 준비
        String menu = "chicken";

        // 수행
        String food = chef.cook(menu);

        // 예상
        String expected = "chicken-chicken";

        // 검증
        assertEquals(expected, food);

    }

}