package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

abstract class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getBeerDto() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Bla beer")
                .beerStyle( "Ale")
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(12312312312L)
                .myLocalDate(LocalDate.now())
                .build();
    }
}
