package cz.svamberkserker.apidoc;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController implements CardApi {

    @Override
    public CardDTO getCard(Long id) {
        return new CardDTO(1L, "Card 1", "Card description");
    }
}
