public class App {
    public static void main(String[] args) throws Exception {
        Garagem g = new Garagem();
        Locomotiva l1 = new Locomotiva(01, null, 15,150);
        g.insereNaListaLocomotiva(l1);
        Locomotiva l2 = new Locomotiva(02, null, 13,130);
        g.insereNaListaLocomotiva(l2);
        Locomotiva l3 = new Locomotiva(03, null, 12,120);
        g.insereNaListaLocomotiva(l3);
        Locomotiva l4 = new Locomotiva(04, null, 10,100);
        g.insereNaListaLocomotiva(l4);
        Locomotiva l5 = new Locomotiva(05, null, 15,150);
        g.insereNaListaLocomotiva(l5);
        Locomotiva l6 = new Locomotiva(06, null, 17,170);
        g.insereNaListaLocomotiva(l6);
        Vagao v1 = new Vagao(01, null, 15);
        g.insereNaListaVagoes(v1);
        Vagao v2 = new Vagao(02, null, 15);
        g.insereNaListaVagoes(v2);
        Vagao v3 = new Vagao(03, null, 15);
        g.insereNaListaVagoes(v3);
        Vagao v4 = new Vagao(04, null, 15);
        g.insereNaListaVagoes(v4);
        Vagao v5 = new Vagao(05, null, 15);
        g.insereNaListaVagoes(v5);
        Vagao v6 = new Vagao(06, null, 15);
        g.insereNaListaVagoes(v6);
        g.printaListaVagoesLivres();
        g.criaTrem();
    }
}
