package cz.svamberkserker.apidoc;

import org.springframework.web.bind.annotation.*;

/**
 * Account Management API
 */
@RequestMapping("/api/v1/accounts")
public interface AccountApi {

    /**
     * Get account operation
     *
     * @param id account identifier
     * @return {@link AccountDTO}
     */
    @GetMapping("/{id}")
    AccountDTO getAccount(@PathVariable Long id);

    /**
     * Update account operation
     *
     * @param id account identifier
     * @param accountDTO {@link AccountDTO}
     * @return Account updated
     * @throws NotFoundException if account not found
     * @throws BadRequestException if request body invalid
     */
    @PostMapping("/{id}")
    AccountDTO updateAccount(@PathVariable Long id, @RequestBody AccountDTO accountDTO) throws NotFoundException, BadRequestException;
}
