import java.util.ArrayList;
import java.util.List;

public class Locadora {

  private String name;

  private List<Carro> carro = new ArrayList<>();

  public Locadora() {
  }

  public Locadora(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Carro> getCarro() {
    return new ArrayList<>(carro);
  }

  public void addCarro(Carro carro) {
    this.carro.add(carro);
  }

  public void removeCarro(Carro carro) {
    this.carro.remove(carro);
  }

  @Override
  public String toString() {
    return "Locadora [name=" + name + "]";
  }

}
