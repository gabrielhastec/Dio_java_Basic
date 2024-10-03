public class Main {
    public static void main(String[] args) {
        
        SmartTV minhaTV = new SmartTV();

        minhaTV.ligar();
        minhaTV.aumentarVolume();
        minhaTV.mudarCanal(5);
        minhaTV.mudarCanal(); // Mudando para o próximo canal
        minhaTV.diminuirVolume();
        minhaTV.desligar();
    }
}
