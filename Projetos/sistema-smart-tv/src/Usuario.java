public class Usuario {
    public static void main(String[] args) {
        
        SmartTV minhaTV = new SmartTV();

        minhaTV.ligar();
        minhaTV.aumentarVolume();
        minhaTV.mudarCanal(5);
        minhaTV.canalProximo(); // Mudando para o próximo canal
        minhaTV.canalAnterior(); // Voltando para o canal anterior
        minhaTV.diminuirVolume();
        minhaTV.estadoAtual(); // Mostra o estado atual da TV
        minhaTV.desligar();
    }
}
