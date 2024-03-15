package Comparador;

import java.util.*;
public class Agenda{
    public List<Pessoa> pessoas;

    public Agenda(){
        pessoas = new ArrayList<>();
    }

    public void adicionar(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void imprimir(){
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
    public void ordenar(){
        Collections.sort(pessoas);
    }
}
