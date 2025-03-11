package TechGrocery.Ecommerce.application.usacase;

import TechGrocery.Ecommerce.adapter.repository.RepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceCartao {

    @Autowired
    RepositoryClient repositoryClient;

    public Object cadastrarCartao(){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public Object deletarCartao(String codigo){
        try{
            repositoryClient.deleteById(codigo);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>("Erro catch", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
