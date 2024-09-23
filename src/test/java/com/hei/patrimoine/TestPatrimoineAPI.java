package com.hei.patrimoine;

import com.hei.patrimoine.controller.PatrimoineController;
import com.hei.patrimoine.model.Patrimoine;
import com.hei.patrimoine.service.PatrimoineService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;

@WebMvcTest(PatrimoineController.class)
public class TestPatrimoineAPI {
}
