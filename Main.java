class Produto {
    private String nome;
    private double Preco;
    private double Und;
    
    public Produto(String nome, double preco, double und) {
        this.nome = nome;
        this.Preco = preco;
        this.Und = und;
    }
    
    //Getters e Setters do Nome
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
}
public class Main {
    public static void main(String[] args)
    {
        Produto p1 = new Produto("Tomate", 2.90, 3);
        p1.setNome("Pizza");
        System.out.println(p1.getNome());
    }
}