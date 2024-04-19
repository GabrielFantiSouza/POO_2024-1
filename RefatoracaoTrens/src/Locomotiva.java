public class Locomotiva extends CarroFerroviario{
    private int nroMaxVagoesAcoplados, pesoQueSuporta;
    
    public Locomotiva(int idProprio, String idTremAcoplado, int nroMaxVagoesAcoplados, int pesoQueSuporta){
        super(idProprio, idTremAcoplado);
        this.nroMaxVagoesAcoplados = nroMaxVagoesAcoplados;
        this.pesoQueSuporta = pesoQueSuporta;
    }

    public int getNroMaxVagoesAcoplados(){
        return this.nroMaxVagoesAcoplados;
    }

    public int getPesoQueSuporta(){
        return this.pesoQueSuporta;
    }

    @Override
    public String toString() {
        return "Locomotiva [IdProrio= " + getIdProprio() + ", IdTremAcoplado= " + getidTremAcoplado() + ", nroMaxVagoesAcoplados= " + nroMaxVagoesAcoplados + ", pesoQueSuporta= " + pesoQueSuporta
                + "]";
    }

    
}