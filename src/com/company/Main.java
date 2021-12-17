package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Main {

    public static void main(String[] args) {

        //cria uma lista
        ArrayList lista = new ArrayList();

        //adiciona valores a lista
        lista.add("B");
        lista.add("A");
        lista.add("E");

        //Mostra o conteúdo da lista:
        System.out.print("Lista original: ");
        Iterator itr = lista.iterator();
        while (itr.hasNext()) {
            Object el = itr.next();
            System.out.print(el + " ");
        }
        System.out.println();

        //Modificando elementos da lista:
        ListIterator list_tr = lista.listIterator();
        while(list_tr.hasNext()) {
            Object el = list_tr.next();
            list_tr.set(el + "+");
        }
        System.out.print("Lista modificada: ");
        itr = lista.iterator();
        while(itr.hasNext()) {
            Object el = itr.next();
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.print("Lista de trás para a frente: ");

        //percorrendo a lista de trás para a frente:
        while(list_tr.hasPrevious()) {
            Object el = list_tr.previous();
            System.out.print(el + " "); }

    }
}
