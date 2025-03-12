package TechGrocery.Ecommerce.application.usacase;

import TechGrocery.Ecommerce.adapter.repository.RepositoryProduct;
import TechGrocery.Ecommerce.application.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceProduto {

    @Autowired
    private RepositoryProduct repositoryProduct;

    public Object cadastrarProduto(Produto produto) {
        try {
            if (repositoryProduct.findById(String.valueOf(produto.getiCodigo())).isPresent()) {
                return new ResponseEntity<>("Produto já existente com esse código", HttpStatus.BAD_REQUEST);
            } else {
                repositoryProduct.save(produto);
                return new ResponseEntity<>("Produto cadastrado com sucesso!", HttpStatus.CREATED);
            }
        } catch (Exception exception) {
            return new ResponseEntity<>("Erro ao cadastrar produto", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Object buscarProduto(String codigo) {
        try {
            if (repositoryProduct.findById(codigo).isPresent()) {
                Produto produto = repositoryProduct.findById(codigo).get();
                return new ResponseEntity<>(produto, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Produto não encontrado...", HttpStatus.NOT_FOUND);
            }
        } catch (Exception exception) {
            return new ResponseEntity<>("Erro ao buscar produto", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Object deletarProduto(String codigo) {
        try {
            repositoryProduct.deleteById(codigo);
            return new ResponseEntity<>("Produto deletado com sucesso", HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>("Erro ao deletar produto", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Object buscarTodosProdutos() {
        try {
            Iterable<Produto> produtos = repositoryProduct.findAll();
            return new ResponseEntity<>(produtos, HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}