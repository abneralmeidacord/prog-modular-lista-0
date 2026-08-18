import java.util.*;

public class App {

    public static void main(String[] args) {
            Habitante joao = new Habitante();
            joao.sexo = "Masculino";
            joao.corOlhos = "Castanhos";
            joao.corCabe = "Preto";
            joao.idade = 25;

            Habitante maria = new Habitante();
            maria.sexo = "Feminino";
            maria.corOlhos = "Azuis";
            maria.corCabe = "Loiro";
            maria.idade = 30;
            
            Habitante pedro = new Habitante();
            pedro.sexo = "Masculino";
            pedro.corOlhos = "verdes";
            pedro.corCabe = "Castanho";
            pedro.idade = 20;

            Habitante ana = new Habitante();
            ana.sexo = "Feminino";
            ana.corOlhos = "Castanhos";
            ana.corCabe = "Preto";
            ana.idade = 22;

            Habitante lucas = new Habitante();
            lucas.sexo = "Masculino";
            lucas.corOlhos = "Azuis";
            lucas.corCabe = "Loiro";
            lucas.idade = 28;

            Habitante carla = new Habitante();
            carla.sexo = "Feminino";
            carla.corOlhos = "verdes";
            carla.corCabe = "Castanho";
            carla.idade = 35;

            Habitante bruno = new Habitante();
            bruno.sexo = "Masculino";
            bruno.corOlhos = "Castanhos";
            bruno.corCabe = "Preto";
            bruno.idade = 40;

            Habitante julia = new Habitante();
            julia.sexo = "Feminino";
            julia.corOlhos = "Azuis";
            julia.corCabe = "Loiro";
            julia.idade = 27;

            Habitante rafael = new Habitante();
            rafael.sexo = "Masculino";
            rafael.corOlhos = "verdes";
            rafael.corCabe = "Castanho";
            rafael.idade = 32;

            Habitante camila = new Habitante();
            camila.sexo = "Feminino";
            camila.corOlhos = "Castanhos";
            camila.corCabe = "Preto";
            camila.idade = 29;

            Habitante zilda = new Habitante();
            zilda.sexo = "Feminino";
            zilda.corOlhos = "verdes";
            zilda.corCabe = "loiro";
            zilda.idade = 29;

        Habitante[] habitantes = {joao, maria, pedro, ana, lucas, carla, bruno, julia, rafael, camila, zilda};

        int idadeMaior = 0;
        int idadeMenor = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < habitantes.length; i++) {
            Habitante habitante = habitantes[i];
            idadeMaior = habitante.idade > idadeMaior ? habitante.idade : idadeMaior;
            idadeMenor = habitante.idade < idadeMenor ? habitante.idade : idadeMenor;

            if (habitante.sexo == "Feminino" && habitante.idade >= 18 && habitante.idade <= 35 && habitante.corOlhos == "verdes" && habitante.corCabe == "loiro") {
                count++;
            }
        }

        System.out.println("A maior idade é: " + idadeMaior);
        System.out.println("A menor idade é: " + idadeMenor);
        System.out.println("A quantidade de mulheres com idade entre 18 e 35 anos, olhos verdes e cabelo loiro é: " + count);
    }

}