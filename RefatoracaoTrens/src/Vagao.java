public class Vagao extends CarroFerroviario{
    private int capacidadeCarga;

    public Vagao(int idProprio, String idTremAcoplado, int capacidadeCarga){
        super(idProprio, idTremAcoplado);
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public int getCapacidadeCarga(){
        return this.capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Vagao [IdProprio=" + getIdProprio() + 
        ", IdTremAcoplado=" + getidTremAcoplado() +
        ", CapacidadeCarga=" + getCapacidadeCarga() + "]";

    }

    
}