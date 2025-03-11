package TechGrocery.Ecommerce.application.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TechGroceryPrivate")
public class Produto {
    @Id
    int iCodigo;
    Date dtValidade;
    String sMarca;
    double dPreco;
    String sNome;
    String sDescricao;
    int iEstoque;
    String sUrl;

    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getsMarca() {
        return sMarca;
    }

    public void setsMarca(String sMarca) {
        this.sMarca = sMarca;
    }

    public double getdPreco() {
        return dPreco;
    }

    public void setdPreco(double dPreco) {
        this.dPreco = dPreco;
    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public String getsDescricao() {
        return sDescricao;
    }

    public void setsDescricao(String sDescricao) {
        this.sDescricao = sDescricao;
    }

    public int getiEstoque() {
        return iEstoque;
    }

    public void setiEstoque(int iEstoque) {
        this.iEstoque = iEstoque;
    }

    public String getsUrl() {
        return sUrl;
    }

    public void setsUrl(String sUrl) {
        this.sUrl = sUrl;
    }
}
