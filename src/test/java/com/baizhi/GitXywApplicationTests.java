package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitXywApplicationTests {

    @Test
    static void contextLoads() {
        int aa=10;
        int bb=20;
        System.out.println(aa+bb);
    }

    public static void main(String[] args) {
        contextLoads();
    }

}
