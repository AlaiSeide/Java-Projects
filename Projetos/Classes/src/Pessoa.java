public class Pessoa {
    // Atributos
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.");
    }

    public static void main(String[] args) {
        // Instanciando a classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        // Utilizando os objetos
        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}
