import java.math.BigDecimal;

public class ContaTerminal {
        
    // Atributos Número (int), Agência (String), Nome Cliente (String) e Saldo (decimal)
    private int numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    // Getters and Setters:
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(final int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
}
