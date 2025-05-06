package br.org.catolicasc.aula10.questao5;

    public class ContaCorrente extends ContaBancaria {

        public void depositar(double valor) {
            this.saldo += valor;
        }

        public void sacar(double valor) {
            this.saldo -= valor;
        }

}
