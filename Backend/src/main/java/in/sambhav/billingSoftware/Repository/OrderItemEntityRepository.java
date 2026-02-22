package in.sambhav.billingSoftware.Repository;

import in.sambhav.billingSoftware.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemEntityRepository extends JpaRepository<OrderItemEntity, Long> {


}
