import java.util.Scanner;

public class CPU {
	
	public static final Integer CLOCK = 3;
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	System.out.println("------------------------- Escalonadores ----------------------------------");
        System.out.println("Escolha o Escalonador: " + "\n(1) Robin Round" + "\n(2) SJF" + "\n(3) FCFS");
        System.out.println("--------------------------------------------------------------------------");
        int tipo = sc.nextInt();
        Escalonador escalonador = tipoEscalonador(tipo);
        Process processo = escalonador.escalona();
        int quantum = 0;
        int cont = 0;
        do {
        	//escalonador escolhido é um Robin Round?
            if (escalonador instanceof RR) {
                if (quantum == escalonador.getQuantun() || ( processo != null && processo.finished())) {
                    processo = escalonador.escalona();
                    quantum = 0;
                }
                quantum++;
            } else {
                if (cont == CLOCK) {
                    processo = escalonador.escalona();
                    cont = 0;
                }
                cont++;
            }
            if (processo != null && !processo.finished()) {
                processo.finish();
            }
        } while (true);
    }
    //pega o tipo de escalonador 
    private static Escalonador tipoEscalonador(int tipo) {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        Escalonador escalonador = null;
        switch (tipo) {
            case 1:
                System.out.println("Quantum: ");
                int quantum = sc.nextInt();
                escalonador = new RR(quantum);
            case 2:
            	escalonador = new SJF();
                break;
            case 3:
                escalonador = new FCFS();
        }
        return escalonador;
    }
}
