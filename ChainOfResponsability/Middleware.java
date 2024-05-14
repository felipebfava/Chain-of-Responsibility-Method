public abstract class Middleware {
    private Middleware proximo;

    public abstract boolean checar(double rendaMensal, double historicoCredito);

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for(Middleware nextInChain: chain) {
            head.proximo = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    protected boolean checarProximo(double rendaMensal, double historicoCredito) {
        if(proximo == null) {
            return true;
        }
        return proximo.checar(rendaMensal, historicoCredito);
    }
}