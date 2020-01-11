package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws IOException {
        String json = "{\"beerId\":\"78abda4b-9957-4306-8e73-fd7437e47bbc\",\"beerName\":\"Bla beer\",\"beerStyle\":\"Ale\",\"upc\":12312312312,\"price\":12.99,\"createdDate\":\"2020-01-11T16:10:59.4218926+03:00\",\"lastUpdatedDate\":\"2020-01-11T16:10:59.4218926+03:00\"}\n";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}