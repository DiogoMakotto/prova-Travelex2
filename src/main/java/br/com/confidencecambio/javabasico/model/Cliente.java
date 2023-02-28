package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.common.CommonName;

public class Cliente implements CommonName {
    String nome;

    public Cliente (String nome){
        if (nome.isEmpty())
            throw new IllegalArgumentException("O campo nome é obrigatorio, não pode estar vazio");

        if(nome == null)
            throw new IllegalArgumentException("O campo nome é obrigatorio, não pode ser nulo");

        this.nome = nome.trim();
    }
    @Override
    public String getPrimeiroNome() {
        var PrimeiroNome = this.nome.split("");
        return PrimeiroNome[0];
    }

    @Override
    public String getUltimoNome() {
        var ultimoNome = this.nome.split("");

        if(ultimoNome.length > 1){
            var contador = "";
            for (int i = 1; i < ultimoNome.length;i++){
                contador += ultimoNome[i] + "";
            }
            return contador.trim();
        }else
            return ultimoNome[ultimoNome.length -1 ];
    }

    @Override
    public String getNomeCompleto() {
        return this.nome.toUpperCase();
    }

    @Override
    public String getNomeAbreviado() {
        var nomeAbreviado = this.nome.split("");
        return nomeAbreviado[0] + "" + nomeAbreviado[1].charAt(0) + "." + "" + nomeAbreviado[nomeAbreviado.length - 1];
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
