package Comparador;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Agenda agenda = new Agenda();

        agenda.adicionar(new Pessoa("Joao", "Silva",LocalDate.of(1990, 1, 1), "49 999999999"));
        agenda.adicionar(new Pessoa("Joao", "Silva", LocalDate.of(1980, 1, 1), "49 988888888"));
        agenda.adicionar(new Pessoa("Joao", "Santos",LocalDate.of(1991, 1, 1), "49 989162456"));
        agenda.adicionar(new Pessoa("Ana", "Paula",LocalDate.of(1989, 1, 1), "49 909564345"));
        agenda.adicionar(new Pessoa("Maria", "Silva",LocalDate.of(1990, 1, 1), "49 999999999"));
        agenda.adicionar(new Pessoa("Carla", "Sousa",LocalDate.of(1990, 1, 1), "49 99999888"));

        System.out.println("Antes: ");
        agenda.imprimir();

        agenda.ordenar();

        System.out.println("");
        System.out.println("Depois: ");
        agenda.imprimir();
    }
}
