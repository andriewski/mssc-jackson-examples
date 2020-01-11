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
        String json = "{\"beerName\":\"Bla beer\",\"beerStyle\":\"Ale\",\"upc\":12312312312,\"price\":\"12.99\",\"createdDate\":\"2020-01-11T18:53:35+0300\",\"lastUpdatedDate\":\"2020-01-11T18:53:35.7363373+03:00\",\"myLocalDate\":\"20200111\",\"beerId\":\"a572bbae-f957-4cfa-a2b1-62261688fa77\"}";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}