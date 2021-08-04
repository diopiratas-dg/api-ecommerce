package br.com.digitalhouse.apiecommerce.test.repository;

import br.com.digitalhouse.apiecommerce.model.Category;
import br.com.digitalhouse.apiecommerce.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void insertBook(){
        Category category = new Category(1, "Eletrodomestico");
        categoryRepository.save(category);

        Integer countCt = Math.toIntExact(categoryRepository.count());
        assertEquals(java.util.Optional.of(1), countCt);
    }

    @Test
    public void checkCategorySavedWithId(){
        Category category = new Category(1, "Eletrodomestico");
        categoryRepository.save(category);

        Integer countCt = Math.toIntExact(categoryRepository.count());
        assertEquals(java.util.Optional.of(1), countCt);

        Optional<Category> ct = categoryRepository.findById(1);

        assertNotNull(ct);
        assertEquals(category, ct);
    }

    @Test
    public void checkCategorySavedWithIdPassingOtherIdShouldReturnNull(){
        Category category = new Category(1, "Eletrodomestico");
        categoryRepository.save(category);

        Integer countCt = Math.toIntExact(categoryRepository.count());
        assertEquals(java.util.Optional.of(1), countCt);

        Optional<Category> ct = categoryRepository.findById(2);

        assertNotNull(ct);
        assertEquals(category, ct);
    }
}
