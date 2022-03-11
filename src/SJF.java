public class SJF extends Escalonador {
	
	@Override
    public Process escalona() {
        gerarProcesso();
        Process processo = null;
        if (isNotNull()) {
            processo = pegarProcesso();
            if (processo.finished()) {
                remove();
                if(isNotNull()) {
                	pegarProcesso();
                } else {
                	return null;
                }
            }
            System.out.println("Existem: " + totalProcessos() + " processos.");
        }
        return processo;
    }

    @Override
    public int getQuantun() {
        return 0;
    }
}
