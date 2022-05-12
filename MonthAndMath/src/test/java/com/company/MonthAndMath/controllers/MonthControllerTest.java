package com.company.MonthAndMath.controllers;

import com.company.MonthAndMath.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class MonthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {

    }

    @Test
    public void shouldReturnMonthByNumber() throws Exception {
        Month outputMonth = new Month("October", 10);
        String outputJson = mapper.writeValueAsString(outputMonth);

        mockMvc.perform(get("/month/10"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturnARandomMonth() throws Exception {
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk());
    }


}