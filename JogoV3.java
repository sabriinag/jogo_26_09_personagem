import java.util.Random;

public class JogoV3 {
    public static void main(String[] args) throws Exception {
        var cacador = new Personagem("Silas");
        var gerador = new Random();

        for( ; ;){ // loop infinito
            //sortear um numero entre 1, 2 e 3
            int oQueFazer = gerador.nextInt(3) + 1; //[0, 3[



            //se for 1, o personagem caça
            //se for 2, o personagem dorme
            //se for 3, o personagem come

            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    break;

                case 2:
                    cacador.dormir();
                    break;
                
                case 3:
                    cacador.comer();
                    break;

                default:
                    System.out.println("ERRO!");
                    break;
                }
                cacador.exibirEstado();
                System.out.println("_________________________________");
                Thread.sleep(1500);
            }
        
    }
}