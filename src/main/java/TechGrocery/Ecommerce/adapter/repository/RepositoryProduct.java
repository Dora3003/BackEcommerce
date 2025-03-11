package TechGrocery.Ecommerce.adapter.repository;

import TechGrocery.Ecommerce.application.domain.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryProduct extends MongoRepository<Produto, String> {
<<<<<<< HEAD
=======
    Produto findBySNome(String nome);
>>>>>>> 3b5083190368e84864cd7d8b81c2c887045988cc
}
