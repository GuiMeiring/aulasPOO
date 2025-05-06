package br.org.catolicasc.aula10.questao5;

    public class ContaPoupanca extends ContaBancaria {

        public void depositar(double valor) {
            this.saldo += valor;
        }

        public void sacar(double valor) {
            this.saldo -= valor;
        }

}
