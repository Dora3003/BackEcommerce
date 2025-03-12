package TechGrocery.Ecommerce.adapter.controller;

import TechGrocery.Ecommerce.application.domain.Cartao;
import TechGrocery.Ecommerce.application.domain.Cliente;
import TechGrocery.Ecommerce.application.domain.Produto;
import TechGrocery.Ecommerce.application.usacase.ServiceCarrinho;
import TechGrocery.Ecommerce.application.usacase.ServiceCartao;
import TechGrocery.Ecommerce.application.usacase.ServiceCliente;
import TechGrocery.Ecommerce.application.usacase.ServiceProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/TechGrocery")
@org.springframework.stereotype.Controller
public class Controller {

    //Autowired faz injeção de dependências
    @Autowired
    ServiceProduto serviceProduto;

    @Autowired
    ServiceCarrinho serviceCarrinho;

    @Autowired
    ServiceCartao serviceCartao;

    @Autowired
    ServiceCliente serviceCliente;

    //Produto
    @PostMapping("/CadastrarProduto")
    public Object CadastrarProduto(@RequestBody Produto produto){
        return serviceProduto.cadastrarProduto(produto);
    }

    @GetMapping("/BuscarTodosProdutos")
    public Object BuscarTodosProdutos(@RequestBody Produto produto){
        return serviceProduto.buscarTodosProdutos();
    }

    @GetMapping("/BuscarProduto")
    public Object BuscarProduto(@RequestBody Produto produto){
        return serviceProduto.buscarProduto(produto.getsNome());
    }

    @DeleteMapping("/DeletarProduto")
    public Object DeletarProduto(@RequestBody Produto produto){
        return serviceProduto.deletarProduto(String.valueOf(produto.getiCodigo()));
    }

    //Cartão

    @PostMapping("/CadastrarCartao")
    public Object CadastrarCartao(@RequestBody Cartao cartao){
        return serviceCartao.cadastrarCartao();
    }

    @DeleteMapping("/DeletarCartao")
    public Object DeletarCartao(@RequestBody Cartao cartao){
        return serviceCartao.deletarCartao(cartao.getsNumeroCartao());
    }

    //Carrinho

    @PostMapping("/AdicionarProduto")
    public Object AdicionarProduto(@RequestBody Produto produto){
        return serviceCarrinho.adicionarProduto();
    }

    @DeleteMapping("/DeletarProdutoCarrinho")
    public Object DeletarProdutoCarrinho(@RequestBody Produto produto){
        return serviceCarrinho.adicionarProduto();
    }

    //Cliente

    @PostMapping("/CadastrarCliente")
    public Object CadastrarCliente(@RequestBody Cliente cliente){
        return serviceCliente.cadastrarCliente(cliente);
    }

    @DeleteMapping("/LoginCliente")
    public Object loginCliente(@RequestBody String email, String senha){
        return serviceCliente.loginCliente(email, senha);
    }

    //Delete - deletar
    //Update - atualizar
    //Post - principalmente inserir dados
    //Get - não muda nada, só retorna

    //@RequestBody - anotação indicando o que a requisiçao HTTP precisa receber
    // geralmente como um JSON pra funcionar
}
