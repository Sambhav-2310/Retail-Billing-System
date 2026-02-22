package in.sambhav.billingSoftware.service;

import in.sambhav.billingSoftware.io.OrderRequest;
import in.sambhav.billingSoftware.io.OrderResponse;
import in.sambhav.billingSoftware.io.PaymentVerificationRequest;
import org.springframework.data.domain.Pageable;
import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrder();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
