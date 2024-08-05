package com.sippar.pattern.creational.pattern;

import com.sippar.pattern.creational.factory.Cafe;
import com.sippar.pattern.creational.factory.CafeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = FactoryTest.class)
class FactoryTest {
    @Test
    void testCreateCafe() {
        //creating unit test for the factory pattern
        Cafe cafe = CafeFactory.createCafe("Preto", "Arabica", "Teste Jenkins", "Expresso", "Sudeste",
                true, false, false, true, 9, 12.90, "Azul");
        Cafe cafeEsperado = createCafe();
        assertEquals(cafeEsperado.getCor(), cafe.getCor());
        assertEquals(cafeEsperado.getTipo(), cafe.getTipo());
        assertEquals(cafeEsperado.getDescricao(), cafe.getDescricao());
        assertEquals(cafeEsperado.getGraos(), cafe.getGraos());
        assertEquals(cafeEsperado.getEspecie(), cafe.getEspecie());
        assertEquals(cafeEsperado.isCapsula(), cafe.isCapsula());
        assertEquals(cafeEsperado.isComLeite(), cafe.isComLeite());
        assertEquals(cafeEsperado.getTamanho(), cafe.getTamanho());
    }

    private Cafe createCafe() {
        Cafe cafe = new Cafe();
        cafe.setCor("Preto");
        cafe.setRegiao("Sudeste");
        cafe.setMarca("Expresso");
        cafe.setDescricao("Teste Jenkins");
        cafe.setTipo("Arabica");
        cafe.setEspecie("Azul");
        cafe.setTamanho(12.90);
        cafe.setInternacional(true);
        cafe.setCapsula(true);
        cafe.setAdocado(false);
        cafe.setComLeite(false);
        cafe.setGraos(9);
        return cafe;
    }
}
