package es.datautil;

public enum Meses { 
	JANEIRO(1), 
	FEVEREIRO(2), 
	MAR�O(3), 
	ABRIL(4),
	MAIO(5), 
	JUNHO(6), 
	JULHO(7), 
	AGOSTO(8), 
	SETEMBRO(9),
	OUTUBRO(10),
	NOVEMBRO(11),
	DEZEMBRO(12);
	
	private int numeroMes;
	
	private Meses( int n)
	{
		numeroMes = n;
	}
	
	
	
	/**
	 * Devolve o n�mero do m�s associado ao objecto do enumerado.
	 * Ex: O objecto Meses.JANEIRO devolve 1, o objecto Meses.DEZEMBRO devolve 12 
	 * @return Um inteiro com o n�mero do m�s
	 */
	public int getNumeroMes()
	{
		return numeroMes;
	}
	
	
	/**
	 * Converte um n�mero inteiro do m�s num objecto da classe Meses
	 * 
	 * @param numeroMes inteiro com o n�mero do m�s
	 * @return objecto da classe Meses correspondente
	 * @throws IllegalArgumentException se o n�mero do m�s n�o estiver no intervalo 1 a 12
	 */
	public static Meses mesFromInt(int numeroMes )
	{
		return Meses.values()[numeroMes-1];
	}

}
