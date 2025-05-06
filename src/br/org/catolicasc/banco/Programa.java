package br.org.catolicasc.banco;

public class Programa {
    public static void main(String[] args) {
        
        ControleBonificacao controleBonificacao = new ControleBonificacao();

        Funcionario gerente = new Gerente();

        gerente.setNome("Manuel");
        gerente.setCpf("555.555.555-55");
        gerente.setSalario(20000);

        Funcionario diretor = new Diretor();

        diretor.setNome("Joaquim");
        diretor.setCpf("555.555.555-44");
        diretor.setSalario(10000);

        controleBonificacao.registra(gerente);
        controleBonificacao.registra(diretor);


        Funcionario presidente = new Presidente();

        presidente.setNome("Afife");
        presidente.setCpf("555.555.555-44");
        presidente.setSalario(10000);

        controleBonificacao.registra(presidente);

        //Secretaria secretaria = new SecretariaAgencia();
        //Secretaria secretariaAdm = new SecretariaAdministrativa();


        System.out.println("\nTotal: " + controleBonificacao.getBonificacao());
    }
}