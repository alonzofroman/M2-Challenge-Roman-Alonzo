package com.company.MonthAndMath.controllers;

import com.company.MonthAndMath.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest
public class MathControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {

    }

//    Successful response tests
    @Test
    public void shouldAdd15And20() throws Exception {
        MathSolution outputMath = new MathSolution(15,20,35,"add");
        String outputJson = mapper.writeValueAsString(outputMath);

        MathSolution testMath = new MathSolution(15, 20);
        String inputJson = mapper.writeValueAsString(testMath);

        mockMvc.perform(post("/add").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldSubtract100And75() throws Exception {
        MathSolution outputMath = new MathSolution(100,75,25,"subtract");
        String outputJson = mapper.writeValueAsString(outputMath);

        MathSolution testMath = new MathSolution(100,75);
        String inputJson = mapper.writeValueAsString(testMath);

        mockMvc.perform(post("/subtract").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldMultiply25And5() throws Exception {
        MathSolution outputMath = new MathSolution(25,5,125,"multiply");
        String outputJson = mapper.writeValueAsString(outputMath);

        MathSolution testMath = new MathSolution(25,5);
        String inputJson = mapper.writeValueAsString(testMath);

        mockMvc.perform(post("/multiply").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldDivide125And5() throws Exception {
        MathSolution outputMath = new MathSolution(125,5,25,"divide");
        String outputJson = mapper.writeValueAsString(outputMath);

        MathSolution testMath = new MathSolution(125,5);
        String inputJson = mapper.writeValueAsString(testMath);

        mockMvc.perform(post("/divide").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

//    Invalid response tests
    @Test
    public void shouldReturn422OnAddWithOutIntegers() throws Exception {
        MathSolution outputMath = new MathSolution();
        String inputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(post("/add").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422OnSubtractWithOutIntegers() throws Exception {
        MathSolution outputMath = new MathSolution();
        String inputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(post("/subtract").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422OnMultiplyWithOutIntegers() throws Exception {
        MathSolution outputMath = new MathSolution();
        String inputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(post("/multiply").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422OnDivideWithOutIntegers() throws Exception {
        MathSolution outputMath = new MathSolution();
        String inputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(post("/divide").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422WhenTryingToDivideByZero() throws Exception {
        MathSolution outputMath = new MathSolution(5,0);
        String inputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(post("/divide").content(inputJson).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }


}
