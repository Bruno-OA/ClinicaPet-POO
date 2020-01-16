package CadastroPet;

//class Pet, e os tipos de variaveis para atributos
public class Pet {

    //private priva uma variavel do acesso
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String cor;
    private Responsavel dono;
    private String tipoCuidado;

    //getter e setter para travar e dar acesso as variaveis
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Responsavel getDono() {
        return dono;
    }

    public void setDono(Responsavel dono) {
        this.dono = dono;
    }

    public String getTipoCuidado() {
        return tipoCuidado;
    }

    public void setTipoCuidado(String tipoCuidado) {
        this.tipoCuidado = tipoCuidado;
    }

    //cria o metodo construtor Alt+inserte => constructor
    public Pet(String nome,
               String especie,
               String raca,
               int idade,
               String cor,
               Responsavel dono,
               String tipoCuidado) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.dono = dono;
        this.tipoCuidado = tipoCuidado;
    }

    //enum é um conjunto estatico
    public enum TiposCuidado{
        BanhoETosa,
        Vacina,
        Fisioterapia
    }

    //Alt+insert => toString() cria metodo com as variaveis em String que imprimi todos os dados do pet
    public String retornarTodosDadosPet() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", dono=" + dono +
                ", tipoCuidado='" + tipoCuidado + '\'' +
                '}';
    }
}

