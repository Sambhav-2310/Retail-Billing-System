package in.sambhav.billingSoftware.io;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private String customerName;
    private String phoneNumber;
    private List<OrderItemRequest> cartItems;
    private Double subtotal;
    private Double tax;
    private Double grandTotal;
    private String paymentMethod;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class OrderItemRequest{
        private String itemId;
        private String name;
        private Double price;
        private Integer quantity;
    }
}
