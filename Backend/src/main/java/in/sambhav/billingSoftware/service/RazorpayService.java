package in.sambhav.billingSoftware.service;

import com.razorpay.RazorpayException;
import in.sambhav.billingSoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
