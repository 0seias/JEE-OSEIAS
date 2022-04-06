package beans;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class IndexController implements Serializable {
    private Integer idade=null;
    private Double altura=null;
    private Double peso=null;
    private Double resultado= null;
	private String diagnostico= null;

    @Inject
    private IMC calculo;

    public IndexController() {
    }

    public IndexController(Integer idade, Double altura, Double peso, Double resultado, String Diagnostico) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.resultado = resultado;
        this.diagnostico = diagnostico;
    }

    public void submit(){
        this.resultado = calculo.calculoIMC(altura, peso);
        this.diagnostico = calculo.diagnosticoIMC(resultado);
    }
    
    public void clear() {
        this.idade = null;
        this.altura = null;
        this.peso = null;
        this.resultado = null;
        this.diagnostico = "";
    }


    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

}
