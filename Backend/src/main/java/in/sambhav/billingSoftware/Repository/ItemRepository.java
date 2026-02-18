package in.sambhav.billingSoftware.Repository;

import in.sambhav.billingSoftware.entity.ItemsEntity;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<ItemsEntity, Long> {

    Optional<ItemsEntity> findByItemId(String id);

    Integer countByCategoryId(Long id);
}
