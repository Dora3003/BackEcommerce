package TechGrocery.Ecommerce.application.usacase;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceCarrinho {
    public Object adicionarProduto(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public Object removerProduto(){
<<<<<<< HEAD
=======

>>>>>>> 3b5083190368e84864cd7d8b81c2c887045988cc
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
