package es.datautil;

public class Data {

	
	/**
	 * Diz se um determinado ano � bissexto ou n�o
	 * 
	 * @param ano Inteiro com o valor do ano a avaliar
	 * @return true ou false consoante o ano for bissexto ou n�o
	 */
	public static boolean anoBissexto(int ano)
	{
		if (ano % 4 == 0) {
			if (ano % 100 == 0) {
				if (ano % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	
	
	/**
	 * Diz quantos dias um determinado m�s tem 
	 * 
	 * @param mes Valor do enumerado Meses com o m�s a avaliar
	 * @return Devolve o n�mero de dias do m�s
	 * @throws IllegalArgumentException se o m�s passado for Fevereiro, � necess�rio usar a outra assinatura do m�todo
	 */
	public static int diasMes( Meses mes)
	{
		if (mes == Meses.FEVEREIRO) {
			throw new IllegalArgumentException("Se for fevereiro tem que passar o ano");
		}
		
		if ((mes.getNumeroMes() <= 7 && mes.getNumeroMes() % 2 != 0) || (mes.getNumeroMes() >= 8 && mes.getNumeroMes() % 2 == 0)) {
			return 31;
		} else {
			return 30;
		}

	}
	

	
	/**
	 * Diz quantos dias um determinado m�s tem. 
	 * esta assinatura com 2 argumentos � adequada quando � o m�s 2 (Fevereiro)
	 * 
	 * @param mes  Valor do enumerado Meses com o m�s a avaliar
	 * @param ano  Valor inteiro representando o ano 
	 * @return Devolve o n�mero de dias do m�s
	 */
	public static int diasMes( Meses mes, int ano)
	{
			if (mes == Meses.FEVEREIRO) {
				if (anoBissexto(ano)) {
					return 29;
				} else {
					return 28;
				}
			} else {
			return diasMes(mes);
		} 
	
			
		// Testa se o ano � bisseexto caso o mes seja Meses.FEVEREIRO
		
			
		
		// Se n�o for Meses.FEVEREIRO, ignora o ano e chama o m�todo diasMes(mes)
		
		
		
		
	}

	
	
	
	
	
	
}
