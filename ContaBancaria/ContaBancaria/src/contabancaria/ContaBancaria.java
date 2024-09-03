
package contabancaria;



public class ContaBancaria {
  
    private String titular;
    private double saldo;
    private String numeroDaConta;

   
    public ContaBancaria(String titular, double saldo, String numeroDaConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

   
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

   
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    
    public void exibirDetalhes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroDaConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("Ana", 1000.00, "12345-6");

        
        conta.exibirDetalhes();

        
        conta.depositar(500.00);
        conta.sacar(200.00);
        conta.sacar(1500.00); 

        
        conta.exibirDetalhes();
    }
}



