package org.example.bookstore.dto.cartitemdto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CartItemRequestDto {
    @NotNull
    private Long bookId;
    @NotNull
    @Min(1)
    private Integer quantity;
}
