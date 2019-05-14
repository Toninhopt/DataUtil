package es.datautil;

public class Data {

	
	/**
	 * Diz se um determinado ano é bissexto ou não
	 * 
	 * @param ano Inteiro com o valor do ano a avaliar
	 * @return true ou false consoante o ano for bissexto ou não
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
	 * Diz quantos dias um determinado mês tem 
	 * 
	 * @param mes Valor do enumerado Meses com o mês a avaliar
	 * @return Devolve o número de dias do mês
	 * @throws IllegalArgumentException se o mês passado for Fevereiro, é necessário usar a outra assinatura do método
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
	 * Diz quantos dias um determinado mês tem. 
	 * esta assinatura com 2 argumentos é adequada quando é o mês 2 (Fevereiro)
	 * 
	 * @param mes  Valor do enumerado Meses com o mês a avaliar
	 * @param ano  Valor inteiro representando o ano 
	 * @return Devolve o número de dias do mês
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
	
			
		// Testa se o ano é bisseexto caso o mes seja Meses.FEVEREIRO
		
			
		
		// Se não for Meses.FEVEREIRO, ignora o ano e chama o método diasMes(mes)
		
		
		
		
	}

	
	
	
	
	
	
}
