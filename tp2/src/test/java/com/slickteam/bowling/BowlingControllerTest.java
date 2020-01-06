package com.slickteam.bowling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ExtendWith(SpringExtension.class)
class BowlingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BowlingService bowlingService;

    @Test
    void should_get_2xx_when_scores_found() throws Exception {

        when(bowlingService.getScores()).thenReturn(Collections.singletonList(1));

        mockMvc.perform(get("/scores")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().json("[1]"));
    }

    @Test
    void should_get_4xx_when_any_scores_found() throws Exception {

        when(bowlingService.getScores()).thenReturn(null);

        mockMvc.perform(get("/scores")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError())
                .andExpect(content().string(""));
    }
}