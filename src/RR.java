public class RR extends Escalonador {
	
	private int quantum;

    public RR(int quantum) {
        this.quantum = quantum;
    }

    @Override
    public Process escalona() {
        gerarProcesso();
        Process processo = null;
        if (isNotNull()) {
            processo = pegarProcesso();
            remove();
            if(!processo.finished()) {
                addProcess(processo);
            }
            if(isNotNull()) {
            	pegarProcesso();
            } else {
            	return null;
            }
            System.out.println("Existem: " + totalProcessos() + " processos.");
        }

        return processo;
    }

    @Override
    public int getQuantun() {
        return this.quantum;
    }

}
