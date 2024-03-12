import java.time.LocalDate;

public class Carro implements CalculadoraDeVenda {

  private String nome;
  private Integer anoFabricacao;
  private String fabricante;

  static final double VALOR_MOEDA = 5.50;

  public Carro(String nome, Integer anoFabricacao, String fabricante) {
    this.nome = nome;
    this.anoFabricacao = anoFabricacao;
    this.fabricante = fabricante;
  }

  public String getNome() {
    return nome;
  }

  public Integer getAnoFabricacaoo() {
    return anoFabricacao;
  }

  public String getFabricante() {
    return fabricante;
  }

  @Override
  public String toString() {
    return "Carro [nome=" + nome + ", ano fabricacao=" + anoFabricacao + ", fabricante=" + fabricante
        + ", valor de Venda="
        + calcularValorDeVenda() + "]";
  }

  @Override
  public Double calcularValorDeVenda() {
    int anos = LocalDate.now().getYear();
    return (anos - anoFabricacao) * VALOR_MOEDA;
  }

}
