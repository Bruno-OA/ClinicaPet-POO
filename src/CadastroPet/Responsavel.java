package CadastroPet;

//class responsavel, e os tipos de variaveis para atributos privados
public class Responsavel {

    //private priva uma variavel do acesso
    private String nome;
    private String sobrenome;
    private String cep;
    private String numeroResidencial;
    private int idade;
    private String telefone;
    private String email;

    //getter: leitura e setter: modifica para travar e dar acesso as variaveis
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResidencial() {
        return numeroResidencial;
    }

    public void setNumeroResidencial(String numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //cria o metodo construtor Alt+inserte => constructor
    public Responsavel(String nome,
                       String sobrenome,
                       String cep,
                       String numeroResidencial,
                       int idade,
                       String email,
                       String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    //retorna apenas dados basicos com um condição
    public void retornarDadosBasicos(){
        if(nome == "Bruno"){
            System.out.println("Esse cara é do bem");
        }
        System.out.println("Nome: " + nome + "\n" + "E-mail " + email);
    }

    //Alt+insert => toString() cria metodo com as variaveis em String que imprimi todos os dados do usuario
    public String retornarTodosDados() {
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //metodo boolean de true/false
    public boolean verificarMaioridade(int idade){
        if(idade >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}