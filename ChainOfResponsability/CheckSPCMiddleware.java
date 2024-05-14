
public class CheckSPCMiddleware extends Middleware {

    @Override
    public boolean checar(double rendaMensal, double historicoCredito) {
        return rendaMensal >= historicoCredito && checarProximo(rendaMensal, historicoCredito);
    }
}