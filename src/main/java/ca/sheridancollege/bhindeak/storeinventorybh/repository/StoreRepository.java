package ca.sheridancollege.bhindeak.storeinventorybh.repository;
import ca.sheridancollege.bhindeak.storeinventorybh.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
