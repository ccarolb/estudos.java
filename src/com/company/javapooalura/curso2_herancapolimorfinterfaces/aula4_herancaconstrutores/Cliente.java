package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula4_herancaconstrutores;

public class Cliente {
   private String nomeCompleto;
    private String cpf;
    private String profissao;

    public String getNomeCompleto() {
        return this.nomeCompleto;
    };

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    };

    public String getCpf() {
        return this.cpf;
    };

    public void setCpf(String cpf) {
        this.cpf = cpf;
    };

    public String getProfissao() {
        return profissao;
    };

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    };
}
