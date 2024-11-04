package cz.svamberkserker.apidoc;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/cards")
@ApiResponses(
    value = {
        @ApiResponse(
            responseCode = "400",
            description = "Bad Request",
            content = @Content
        ),
        @ApiResponse(
            responseCode = "404",
            description = "Not Found",
            content = @Content
        ),
        @ApiResponse(
            responseCode = "500",
            description = "Internal Server Error",
            content = @Content
        )
    })
@Tag(name = "Card API", description = "Card Management API")
public interface CardApi {

    @Operation(
        summary = "Get Card"
    )
    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Card found",
                content = @Content(schema = @Schema(implementation = CardDTO.class), mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
        })
    @GetMapping("/{id}")
    CardDTO getCard(@PathVariable Long id);
}
