package com.mycompany.aula05;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status; 
    
    public void estadoAtual(){
       System.out.println("-----------------------------------------");
       System.out.println("Conta: " + this.getNumConta());
       System.out.println("Tipo: " + this.getTipo());
       System.out.println("Dono: " + this.getDono());
       System.out.println("Saldo: " + this.getSaldo());
       System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP" ) {
            this.setSaldo(150);       
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo()  < 0){
            System.out.println("Conta em debito");   
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de "+ this.dono);
        } else {
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo()  >= v) {
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque realizado na conta de "+ this.dono);

            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
               System.out.println("Mensalidade paga na conta de "+ this.dono);
        } else {
            System.out.println("Impossivel pagar");
        }
    }

    //public ContaBanco(float saldo, boolean status) {
       // this.saldo = 0;
        //this.status = false;
    //}

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
