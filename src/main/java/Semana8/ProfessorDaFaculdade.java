package Semana8;

public class ProfessorDaFaculdade extends EmpregadosFaculdade	{
    private int	horasDeAula;
    public	double	getGastos() {
        return this.getSalario()  +	this.horasDeAula	*	10;
    }
    public	String	getInfo() {
        String	informacaoBasica	=	super.getinfo();
        String	informacao	=	informacaoBasica	+	"	horas	de	aula:	"
                +	this.horasDeAula;
        return	informacao;
    }


    public int getHoraDeAula() {
        return horasDeAula;
    }

    public void setHoraDeAula(int horaDeAula) {
        this.horasDeAula = horaDeAula;
    }

}
