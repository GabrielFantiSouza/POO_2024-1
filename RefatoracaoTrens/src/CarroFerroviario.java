abstract class CarroFerroviario{
    private int idProprio;
    private String idTremAcoplado;

    public CarroFerroviario(int idProprio, String idTremAcoplado){
        this.idProprio = idProprio;
        this.idTremAcoplado = idTremAcoplado;
    }

    public int getIdProprio(){
        return this.idProprio;
    }
    
    public String getidTremAcoplado(){
        return this.idTremAcoplado;
    }

    public void setIdTremAcoplado(String idTrem){
        this.idTremAcoplado = idTrem;
    }
}