public class App {
  public static void main(String[] args) {

    Locadora locadora = new Locadora("New Car");

    Carro monza = new Carro("Monza", 1990, "Chevrolet");
    Carro fusca = new Carro("Fusca", 1970, "Volkswagen");
    Carro kombi = new Carro("kombi", 1970, "Volkswagen");
    Carro fiat = new Carro("Fiat Uno", 1990, "Fiat");

    locadora.addCarro(monza);
    locadora.addCarro(fusca);
    locadora.addCarro(kombi);
    locadora.addCarro(fiat);

    System.out.println(locadora.getCarro());

  }
}
