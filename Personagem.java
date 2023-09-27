public class Personagem{
  //variáveis de instância
  //instância é sinônimo de objeto
  String nome;
  private boolean vida = true;
  private int item = 0;
  private int energia = 10;
  private int fome = 0;
  private int sono = 0;

  
  //construtor padrão (lista de parâmetros vazia)
  Personagem(){
    System.out.println("Construindo um personagem...");
  }

  Personagem(String nome){
    this.nome = nome;
  }

  Personagem(int energia, int fome, int sono){
    if(energia >= 0 && energia <= 10){
      this.energia = energia;
    }
    this.fome = fome < 10 && fome > 0 ? fome : this.fome ;
    this.sono = sono > 10 && sono < 0 ? this.sono : sono;
  }


  //tipo de retorno
  //nome
  //lista de parâmetros
  //corpo


  void cacar(){
    if(vida){
      if(fome < 10 && sono < 10){
        if (energia >= 2){
          energia = energia - 2; // energia -= 2;
          System.out.println(nome + " cacando");
          ++item;
          if(energia == -1){
            vida = false;
          }
        }
        else{
          System.out.println(nome + " sem energia para cacar");
        }
      }
      else{
        vida = false;
        System.out.println(nome + " morreu !!");
      }
    }
    else{
      vida = false;
      System.out.println(nome + " morreu !!");
    }
    fome = Math.min(fome + 1, 10);
    sono = sono + 1 > 10 ? 10 : sono + 1;

    // if(fome == 10 && sono == 10){
    //   vida = false;
    // }
    
  }


  void comer(){
    if(vida){
      if (fome >= 1){
        if(item > 0){
          System.out.printf("%s comendo\n", nome);
          --fome;
          energia = Math.min(energia + 1, 10);
          --item;
        }else{
          System.out.println("nao tem o que comer");
        }
      }
      else{
        System.out.println(nome + " sem fome");
      }
    }
    else if(fome == 10 && sono == 10){
      System.out.println(nome + " morreu !!");
    }
  }












  
  void dormir(){
    if(vida){
      if (sono >= 1){
        System.out.print(nome + " dormindo\n");
        sono--;
        energia = energia + 1 <= 10 ? energia + 1 : 10;
      }
      else{
        System.out.println(nome + " sem sono");
      }
    }
    else if(fome == 10 && sono == 10){
      System.out.println(nome + " morreu !!");
    }
  }






















  void exibirEstado(){
    System.out.printf(
      "Estado: e: %d, f: %d, s: %d, i: %d\n",
      energia,
      fome,
      sono,
      item
    );
  }
}




