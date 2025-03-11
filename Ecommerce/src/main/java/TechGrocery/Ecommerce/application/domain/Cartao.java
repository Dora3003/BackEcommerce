package TechGrocery.Ecommerce.application.domain;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Cartao {
    @Id
    String sNumeroCartao;
    Date dtValidade;
    String sBandeira;
    String sBanco;
    String sTipo;

    public String getsNumeroCartao() {
        return sNumeroCartao;
    }

    public void setsNumeroCartao(String sNumeroCartao) {
        this.sNumeroCartao = sNumeroCartao;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getsBandeira() {
        return sBandeira;
    }

    public void setsBandeira(String sBandeira) {
        this.sBandeira = sBandeira;
    }

    public String getsBanco() {
        return sBanco;
    }

    public void setsBanco(String sBanco) {
        this.sBanco = sBanco;
    }

    public String getsTipo() {
        return sTipo;
    }

    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }
}
