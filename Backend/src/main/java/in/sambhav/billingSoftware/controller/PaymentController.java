package in.sambhav.billingSoftware.controller;


import com.razorpay.RazorpayException;
import in.sambhav.billingSoftware.io.OrderResponse;
import in.sambhav.billingSoftware.io.PaymentRequest;
import in.sambhav.billingSoftware.io.PaymentVerificationRequest;
import in.sambhav.billingSoftware.io.RazorpayOrderResponse;
import in.sambhav.billingSoftware.service.OrderService;
import in.sambhav.billingSoftware.service.RazorpayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest paymentRequest) throws RazorpayException {
        return razorpayService.createOrder(paymentRequest.getAmount(), paymentRequest.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request){
        return orderService.verifyPayment(request);
    }
}
