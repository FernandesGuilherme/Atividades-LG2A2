package Semana8;

public class ProfessorDaFaculdade extends EmpregadosFaculdade {
    private int horaDeAula;
    public  double getGastos(){
        return this.getSalario() + this.horaDeAula * 10;
    }
    public String getInfo (){
        String infoBasica = super.getinfo();
        String informacao = infoBasica + " Total de horas " + this.horaDeAula;
        return informacao;
    }

    public int getHoraDeAula() {
        return horaDeAula;
    }

    public void setHoraDeAula(int horaDeAula) {
        this.horaDeAula = horaDeAula;
    }
}
