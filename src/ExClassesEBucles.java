import java.util.*;
import java.lang.*;
import java.io.*;

public class ExClassesEBucles {

        public static void main(String[] args) {

            ArrayList<String> listaPalavras = new ArrayList<String>();

            listaPalavras.add("mamão");
            listaPalavras.add("abacaxi");
            listaPalavras.add("pera");
            listaPalavras.add("maçã");
            listaPalavras.add("abacate");
            listaPalavras.add("limão");

            // listaPalavras.forEach(e => System.out.println(e));
            // listaPalavras.forEach(String e::System.out);
            System.out.println("Recorriendo la lista con un 'for normal'");
            for(int i=0 ; i < listaPalavras.size() ; i++){
                System.out.println(listaPalavras.get(i));
            }

            System.out.println("\nRecorriendo la lista con un for de Java5");
            for (String palavra: listaPalavras){
                System.out.println(palavra);
            }

            System.out.println("\nRecorriendo la lista con streams de Java8");
            listaPalavras.forEach(System.out::println);

            System.out.println("\nRecorriendo la lista con streams de Java8 modificar e imprimir");

            listaPalavras.replaceAll(String::toUpperCase);
            listaPalavras.forEach(System.out::println);


            System.out.println("***********herança***************");
            Cachorro miPerro = new Cachorro("masculino", "mamifero", "Lulo", "coker");
            System.out.println(miPerro);



            System.out.println((Animal)miPerro);

        }
    }

    class Animal{
        private String nome;
        protected String genero;
        private String especie;

        public Animal(){}
        public Animal(String genero, String especie, String nome){
            this.especie = especie;
            this.genero = genero;
            this.nome = nome;
        }

        @Override
        public String toString(){
            return "Soy un Animal" + " del  tipo " + this.genero;

        }

        public String getGenero(){
            return this.genero;
        }
        public String getEspecie(){
            return this.especie;
        }
        public String getNome(){
            return this.nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }


    }

    class Cachorro extends Animal{
        private String raza;

        public Cachorro(){}
        public Cachorro(String genero, String especie, String nome,  String raza){
            super(genero, especie, nome);
            this.raza = raza;
        }

        public String getRaza(){
            return this.raza;
        }
        @Override
        public String toString(){
            //en este caso puedo utilizar this.genero(que esta en la superclase pq es atributo protected
            // // nome esta como private x es accedo a traves de getNome)
            return "Cachorro " + this.getNome() + " es " + this.genero + " es un " + this.raza;

        }

    }

