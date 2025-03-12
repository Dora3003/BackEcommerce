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
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
