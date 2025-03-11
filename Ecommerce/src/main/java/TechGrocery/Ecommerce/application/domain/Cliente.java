package TechGrocery.Ecommerce.application.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "TechGroceryPublic")
public class Cliente {
    @Id
    String sEmail;
    String senha;
    String sNome;
    int iIdade;
    String sCpf;
    String sTelefone;
    Cartao[] cartao;
    Carrinho carrinho;

    public Cliente(String sEmail, String senha,  String sNome, int iIdade, String sCpf, String sTelefone, Cartao[] cartao, Carrinho carrinho) {
        this.sEmail = sEmail;
        this.senha = senha;
        this.sNome = sNome;
        this.iIdade = iIdade;
        this.sCpf = sCpf;
        this.sTelefone = sTelefone;
        this.cartao = cartao;
        this.carrinho = carrinho;
    }

    // Getters e Setters
    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getSenha() {
        return senha;
    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public int getiIdade() {
        return iIdade;
    }

    public void setiIdade(int iIdade) {
        this.iIdade = iIdade;
    }

    public String getsCpf() {
        return sCpf;
    }

    public void setsCpf(String sCpf) {
        this.sCpf = sCpf;
    }

    public String getsTelefone() {
        return sTelefone;
    }

    public void setsTelefone(String sTelefone) {
        this.sTelefone = sTelefone;
    }

    public Cartao[] getCartao() {
        return cartao;
    }

    public void setCartao(Cartao[] cartao) {
        this.cartao = cartao;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "sEmail='" + sEmail + '\'' +
                ", sNome='" + sNome + '\'' +
                ", iIdade=" + iIdade +
                ", sCpf='" + sCpf + '\'' +
                ", sTelefone='" + sTelefone + '\'' +
                ", cartao=" + Arrays.toString(cartao) +
                ", carrinho=" + carrinho +
                '}';
    }
}