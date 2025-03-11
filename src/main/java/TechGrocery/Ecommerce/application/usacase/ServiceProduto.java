package TechGrocery.Ecommerce.application.usacase;

import TechGrocery.Ecommerce.adapter.repository.RepositoryProduct;
import TechGrocery.Ecommerce.application.Mappers.MapperProduct;
import TechGrocery.Ecommerce.application.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceProduto {

    @Autowired
    RepositoryProduct repositoryProduct;

    MapperProduct mapperProduct;

    public Object cadastrarProduto(Produto produto){
        try{
            if(repositoryProduct.findById(String.valueOf(produto.getiCodigo())).isPresent()){
<<<<<<< HEAD
                return new ResponseEntity<>("Produto já ex6istente com esse código", HttpStatus.BAD_REQUEST);
=======
                return new ResponseEntity<>("Produto já existente com esse código", HttpStatus.BAD_REQUEST);
>>>>>>> 3b5083190368e84864cd7d8b81c2c887045988cc
            }else{
                repositoryProduct.save(produto);
                return new ResponseEntity<>("Produto cadastrado com sucesso!", HttpStatus.CREATED);
            }
<<<<<<< HEAD
        }catch(Exception exception){
=======
        }catch (Exception exception){
>>>>>>> 3b5083190368e84864cd7d8b81c2c887045988cc
            return new ResponseEntity<>("Erro catch", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

<<<<<<< HEAD
    public Object buscarProduto(String codigo){
        try{
            if(repositoryProduct.findById(codigo).isPresent()){
                Produto produto = mapperProduct.toProduto(repositoryProduct.findById(codigo));
                return new ResponseEntity<>(produto, HttpStatus.OK);
            }else{
=======
    public Object buscarTodosProdutos(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public Object buscarProduto(String nome){
        try{
            try{
                Produto produto = repositoryProduct.findBySNome(nome);
                return new ResponseEntity<>(produto, HttpStatus.OK);
            }catch (Exception exception){
>>>>>>> 3b5083190368e84864cd7d8b81c2c887045988cc
                return new ResponseEntity<>("Produto não encontrado...", HttpStatus.BAD_REQUEST);
            }
        }catch(Exception exception){
            return new ResponseEntity<>("Erro catch", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

<<<<<<< HEAD
    public Object deletarProduto(String codigo){
=======
    public Object deletarProduto(int codigo){
>>>>>>> 3b5083190368e84864cd7d8b81c2c887045988cc
        try{
            repositoryProduct.deleteById(String.valueOf(codigo));
            return new ResponseEntity<>("Produto deletado com sucesso", HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>("Erro catch", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
