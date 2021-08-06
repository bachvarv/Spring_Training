package com.example.blog;

import org.hibernate.sql.Template;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTests {

    TestRestTemplate restTemplate = new TestRestTemplate();

//    @Test
//    public void assertBlogPage()
//    {
////        Map<String, String> vars = new HashMap<>();
////        vars.put("title", "Blog");
////        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8080/", String.class, vars);
////        assertEquals(entity.getStatusCode(), HttpStatus.OK);
////        assertThat(entity.getBody(), containsString("<h1>Blog</h1>"));
//
//    }
}
