package DemoGraphQL.respository;


import DemoGraphQL.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
