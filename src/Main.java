import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Construir balões
        Balao b1 = new Balao();
        String resultado = b1.voar();
        System.out.println(resultado);

       Pessoa p1 = new Pessoa();
       String nome = p1.nome;
        System.out.println(nome);
}}