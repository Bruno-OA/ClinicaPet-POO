package CadastroPet;

public class App {
    public static void main(String[] args) {
        //objeto pessoa e seus atributos
        Responsavel pessoa = new Responsavel(
                "Bruno",
                "Oliveira",
                "04849-008",
                "37-A",
                18,
                "brunooliveiraalves78@Gmail.com",
                "98499-6010"
        );


        //objeto animal e seus atributos
        Pet animal = new Pet(
                "Rodorfo",
                "Porco",
                "Domestico",
                5,
                "rosa",
                pessoa,
                Pet.TiposCuidado.BanhoETosa.toString()
        );

        //teste dos metodos

        //retorna apenas dados basicos com um condição
        pessoa.retornarDadosBasicos();

        //imprimi metodo retornarTodosDados
        System.out.println(animal.getDono().retornarTodosDados());

        //imprimi metodo verificarMaioridade
        System.out.println(pessoa.verificarMaioridade(pessoa.getIdade()));

        //imprimi metodo retornarTodosDadosPet
        System.out.println(animal.retornarTodosDadosPet());

    }

}