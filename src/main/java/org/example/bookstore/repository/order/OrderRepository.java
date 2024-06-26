package org.example.bookstore.repository.order;

import java.util.List;
import java.util.Optional;
import org.example.bookstore.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findAllByUserId(Long id);

    Optional<Order> findByUserIdAndId(Long userId, Long orderId);
}
