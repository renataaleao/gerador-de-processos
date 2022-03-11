import java.util.ArrayList;
import java.util.List;


public abstract class Escalonador {
	
	public List<Process> processos = new ArrayList<Process>();
    public abstract int getQuantun();

    protected void gerarProcesso() {
        System.out.println(processos);
        Process processo = GeradorDeProcessos.build();
        if (processo != null) {
            processos.add(processo);
        }
    }

    public abstract Process escalona();
    
    public int totalProcessos() {
    	return processos.size();
    }

    public boolean isNotNull() {
        return !processos.isEmpty();
    }

    public Process pegarProcesso() {
        return processos.get(0);
    }

    public void remove() {
        processos.remove(0);
    }

    public void addProcess(Process processo) {
        processos.add(processo);
    }
	
	
}
