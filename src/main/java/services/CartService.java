package services;

import com.example.swd392.Request.CartRequest.AddToCartRequest;
import com.example.swd392.Response.CartResponse.CartResponse;
import com.example.swd392.model.Cart;

import java.util.List;

public interface CartService {
    public CartResponse addToCart(AddToCartRequest request);

    public CartResponse removeCart(int cartId);

    List<Cart> viewCartByUserId(int userId);
}
