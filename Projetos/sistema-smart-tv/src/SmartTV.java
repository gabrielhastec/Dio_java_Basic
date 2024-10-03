public class SmartTV {
    
    private boolean statusTv;
    private int volume;
    private int canal;

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
            volume++;
            System.out.println("Volume aumentado para: " + volume);
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
            if (novoCanal > 0) {
                canal = novoCanal;
                System.out.println("Canal mudado para: " + canal);
            } else {
                System.out.println("Canal inválido. Por favor, insira um número positivo.");
            }
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void mudarCanal() {
        if (statusTv) {
            canal++;
            System.out.println("Mudando para o próximo canal: " + canal);
        } else {
            System.out.println("A TV está desligada.");
        }
    }
}
