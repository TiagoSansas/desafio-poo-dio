public class Carro {

  private String nome;
  private Integer ano;
  private String fabricante;

  public Carro(String nome, Integer ano, String fabricante) {
    this.nome = nome;
    this.ano = ano;
    this.fabricante = fabricante;
  }

  public String getNome() {
    return nome;
  }

  public Integer getAno() {
    return ano;
  }

  public String getFabricante() {
    return fabricante;
  }

  @Override
  public String toString() {
    return "Carro [nome=" + nome + ", ano=" + ano + ", fabricante=" + fabricante + "]";
  }

}
