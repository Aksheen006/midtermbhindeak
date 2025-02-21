package ca.sheridancollege.bhindeak.storeinventorybh.repository;
import ca.sheridancollege.bhindeak.storeinventorybh.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
