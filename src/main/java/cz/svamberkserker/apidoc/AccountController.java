package cz.svamberkserker.apidoc;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements AccountApi {

    @Override
    public AccountDTO getAccount(Long id) {
        return new AccountDTO(id, id.toString(), "mail@example.com");
    }

    @Override
    public AccountDTO updateAccount(Long id, AccountDTO accountDTO) throws NotFoundException, BadRequestException {
        return null;
    }
}
