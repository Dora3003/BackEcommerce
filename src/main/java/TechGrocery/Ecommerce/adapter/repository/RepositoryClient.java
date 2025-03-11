package TechGrocery.Ecommerce.adapter.repository;

import TechGrocery.Ecommerce.application.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryClient extends MongoRepository<Cliente, String> {
}
