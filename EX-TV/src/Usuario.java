public class Usuario {
    public static void main(String[] args) throws Exception {

        // assim que se faz uma chamada de metodos ( funçoes em C)
        SmartTv smartTv = new SmartTv();


        smartTv.mudarCanal(13);
        System.out.println("Canal atual e : " + smartTv.canal);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Alteração - TV ligada?? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Alteração - TV ligada?? " + smartTv.ligada);

    }
}
