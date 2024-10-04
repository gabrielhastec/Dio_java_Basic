public class SmartTV {
    
    private boolean statusTv;
    private int volume;
    private int canal;
    private final int VOLUME_MAXIMO = 100;
    private final int CANAL_MAXIMO = 30;

    public SmartTV() {
        this.statusTv = false;
        this.volume = 10; // Volume inicial
        this.canal = 1;   // Canal inicial
    }

    public void ligar() {
        statusTv = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        statusTv = false;
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (statusTv) {
            if (volume < VOLUME_MAXIMO) {
                volume++;
                System.out.println("Volume aumentado para: " + volume);
            } else {
                System.out.println("Volume já está no máximo.");
            }
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void diminuirVolume() {
        if (statusTv) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume diminuído para: " + volume);
            } else {
                System.out.println("Volume já está no mínimo.");
            }
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (statusTv) {
            if (novoCanal > 0 && novoCanal <= CANAL_MAXIMO) {
                canal = novoCanal;
                System.out.println("Canal mudado para: " + canal);
            } else {
                System.out.println("Canal inválido. Por favor, insira um número entre 1 e " + CANAL_MAXIMO + ".");
            }
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void canalProximo() {
        if (statusTv) {
            if (canal < CANAL_MAXIMO) {
                canal++;
                System.out.println("Mudando para o próximo canal: " + canal);
            } else {
                System.out.println("Canal já está no máximo.");
            }
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void canalAnterior() {
        if (statusTv) {
            if (canal > 1) {
                canal--;
                System.out.println("Mudando para o canal anterior: " + canal);
            } else {
                System.out.println("Canal já está no mínimo.");
            }
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void estadoAtual() {
        String estado = statusTv ? "ligada" : "desligada";
        System.out.println("Estado da TV: " + estado + ", Canal: " + canal + ", Volume: " + volume);
    }
}
