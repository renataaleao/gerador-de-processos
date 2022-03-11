public class Process implements Comparable<Process>{
	
    private long id;
    private long quantidadeInstrucoes;

    public Process(long id,long quantidadeInstrucoes) {
        this.id = id;
        this.quantidadeInstrucoes = quantidadeInstrucoes;
    }

    public void finish() {
    	System.out.println("------------------- FINALIZANDO INSTRUÇÃO -----------------------");
        System.out.println("Id da instrução que foi finalizada: " + id + "\nO que restou: " + getQuantidadeInstrucoes());
        quantidadeInstrucoes--;
    }

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQuantidadeInstrucoes() {
		return quantidadeInstrucoes;
	}

	public void setQuantidadeInstrucoes(long quantidadeInstrucoes) {
		this.quantidadeInstrucoes = quantidadeInstrucoes;
	}

	public long time() {
        return 1000 * quantidadeInstrucoes;
    }

    public boolean finished() {
        return quantidadeInstrucoes == 0;
    }

    @Override
    public int compareTo(Process process) {
        return 0;
    }
    
    @Override
    public String toString() {
    	String info = "Processo(" + "Id: "+ id 
        		+" Tempo: " + time()+")";
        return info;
    }
}
