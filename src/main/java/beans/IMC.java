package beans;

import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless
public class IMC implements Serializable {

	

	
	public double calculoIMC(Double altura, Double peso) {
		Double resultado;
		resultado = peso/(altura*altura);
		
		return resultado;
    }

	

public String diagnosticoIMC(double resultado) {
		
		String diagnostico;
		
		if(resultado<18.5)
		{
			diagnostico = "Abaixo do peso";
		}
		else {
			
			if((resultado>=18.5) && (resultado<=25))
			{
					diagnostico = "Peso Normal";
			}
			else 
			{
				if((resultado>25) && (resultado<=30))
				{
					diagnostico = "Peso Normal";						
				}
				else
				{
					diagnostico = "Obeso";												
				}
			}
		}
				
		return diagnostico;
    }	

}
