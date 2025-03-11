package TechGrocery.Ecommerce.adapter.controller;

import TechGrocery.Ecommerce.application.domain.Cliente;
import TechGrocery.Ecommerce.application.domain.Produto;
import TechGrocery.Ecommerce.application.usacase.ServiceCarrinho;
import TechGrocery.Ecommerce.application.usacase.ServiceCartao;
import TechGrocery.Ecommerce.application.usacase.ServiceCliente;
import TechGrocery.Ecommerce.application.usacase.ServiceProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TechGrocery")
public class contoller {

    @Autowired
    ServiceCliente serviceCliente;

    @PostMapping("/cadastrar_cliente")
    public Object cadastrarCliente(Cliente cliente){
        return serviceCliente.cadastrarCliente(cliente);
    }

    @PostMapping("/login_cliente")
    public Object loginCliente(String email, String senha){
        return serviceCliente.loginCliente(email, senha);
    }

    @Autowired
    ServiceProduto serviceProduto;

    @PostMapping("/cadastrar_produto")
    public Object cadastrarProduto(Produto produto){
        return serviceProduto.cadastrarProduto(produto);
    }

    @GetMapping("/buscar_produto")
    public Object buscarProduto(String codigo){
        return serviceProduto.buscarProduto(codigo);
    }

    @PostMapping("/deletar_produto")
    public Object deletarProduto(String codigo){
        return serviceProduto.deletarProduto(codigo);
    }

    @Autowired
    ServiceCartao serviceCartao;

    @PostMapping("/cadastrar_cartao")
    public Object cadastrarCartao(){
        return serviceCartao.cadastrarCartao();
    }

    @DeleteMapping("/deletar_cartao")
    public Object deletarCartao(String codigo){
        return serviceCartao.deletarCartao(codigo);
    }

    @Autowired
    ServiceCarrinho serviceCarrinho;

    @PostMapping("/adicionar_produto")
    public Object adicionarProdutoCarrinho(){
        return serviceCarrinho.adicionarProduto();
    }

    @DeleteMapping("/remover_produto_carrinho")
    public Object removerProdutocarrinho(){
        return serviceCarrinho.removerProduto();
    }

}
