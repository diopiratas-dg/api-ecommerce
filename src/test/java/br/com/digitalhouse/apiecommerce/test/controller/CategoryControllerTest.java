package br.com.digitalhouse.apiecommerce.test.controller;

import br.com.digitalhouse.apiecommerce.controller.CategoryController;
import br.com.digitalhouse.apiecommerce.model.Category;
import br.com.digitalhouse.apiecommerce.repository.CategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.web.JsonPath;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(CategoryController.class)
@AutoConfigureMockMvc
@WithMockUser(username = "dio")
public class CategoryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CategoryRepository categoryRepository;


    @Test
    public void callingWithoutParametersListByIdShouldReturnBadRequest() throws Exception {
        Optional<Category> ct = Optional.of(new Category(2, "Moveis"));
        Mockito.when(categoryRepository.findById(2)).thenReturn(ct);
        this.mockMvc.perform(
                get("/category/list/search")
                .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isBadRequest());
    }

    @Test
    public void shouldReturnJustOneFromResult() throws Exception {
        Category ct = new Category(1,"Eletrodomestico");
        Mockito.when(categoryRepository.findById(1)).thenReturn(Optional.of(ct));
        this.mockMvc.perform(
                get("/category/list/search")
                .queryParam("id","1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1));
    }
}
