package com.company;

public class TestaErro {

    public static void main(String[] args) {
        System.out.println("inicio do main");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro: " + e);
        }

        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        System.out.println("fim do metodo1");
        metodo2();
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }
    }
}
//=================> RESOLUÇÃO FICHA 09 <============================
/*
==============>[1] output:
inicio do main
inicio do metodo1
inicio do metodo2
0
1
2
3
4
5
6
7
8
9
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
	at com.company.TestaErro.metodo2(TestaErro.java:21)
	at com.company.TestaErro.metodo1(TestaErro.java:13)
	at com.company.TestaErro.main(TestaErro.java:7)

Process finished with exit code 1

==============>[2] output:
inicio do main
inicio do metodo1
inicio do metodo2
0
1
2
3
4
5
6
7
8
9
erro: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
fim do metodo1
fim do main

Process finished with exit code 0

==============>[3] output:
inicio do main
inicio do metodo1
inicio do metodo2
0
1
2
3
4
5
6
7
8
9
erro: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
erro: java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10
erro: java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
erro: java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 10
erro: java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 10
erro: java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 10
fim do metodo1
fim do main

Process finished with exit code 0

==============>[4] output:
inicio do main
inicio do metodo1
fim do metodo1
inicio do metodo2
0
1
2
3
4
5
6
7
8
9
erro: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
fim do main

Process finished with exit code 0

==============>[5] output:
inicio do main
inicio do metodo1
fim do metodo1
inicio do metodo2
0
1
2
3
4
5
6
7
8
9
erro: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
fim do main

Process finished with exit code 0

*/
