package com.example.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JenkinsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void alwaysPassed() {
        assertTrue(true);
    }
}
