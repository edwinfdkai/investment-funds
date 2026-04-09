package com.test.bank.controller;

import com.test.bank.config.RestExceptionHandlerTestConfig;
import com.test.bank.model.Fund;
import com.test.bank.service.FundService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = FundController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(RestExceptionHandlerTestConfig.class)
class FundControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FundService fundService;

    @Test
    void getFunds_returnsWrappedList() throws Exception {
        Fund fund = new Fund("1L", "Fund A", BigDecimal.valueOf(500_000L), "FPV");
        when(fundService.getFunds()).thenReturn(List.of(fund));

        mockMvc.perform(get("/api/v1/funds"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.message").value("Funds retrieved successfully"))
                .andExpect(jsonPath("$.data[0].name").value("Fund A"));
    }
}
