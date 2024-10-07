package guru.springframework.spring6resttemplate.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeerClientImplTest {

    @Autowired
    private BeerClient beerClient;

    @Test
    void listBeersNoName() {
        beerClient.listBeers(null, null, false, null, null);
    }

    @Test
    void listBeers() {
        beerClient.listBeers("ALE", null, false, null, null);
    }

}