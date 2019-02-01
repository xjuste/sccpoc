package com.toutjuste.sccpoc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class RestControllerTest {

    @Autowired    private MockMvc mockMvc;

    @Test
    public void getData() throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/api/endpoint1");

        this.mockMvc.perform(builder)
                .andDo(print())
                .andExpect(status()
                        .isInternalServerError());
    }
}
