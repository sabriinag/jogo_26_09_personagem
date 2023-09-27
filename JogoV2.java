public class JogoV2 {
  public static void main(String[] args) throws Exception{
    Personagem p = new Personagem();
    p.nome = "John";

    var soneca = new Personagem(0,3,10);
    var fominha = new Personagem(1,9,4);
    
    while(true){
      p.cacar();
      p.comer();
      p.dormir();
      p.exibirEstado();
      System.out.println("******************");
      Thread.sleep(8000);
    }
  }
}
