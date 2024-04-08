package repository;

import com.example.swd392.model.Order;
import com.example.swd392.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepo extends JpaRepository<OrderDetail,Integer> {
    List<OrderDetail> findByOrder_OrderId(int orderId);
    List<OrderDetail> findOrderDetailByOrder(Order order);
}
