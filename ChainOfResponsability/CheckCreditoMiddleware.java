
public class CheckCreditoMiddleware extends Middleware {
    private Banco banco;

    public CheckCreditoMiddleware(Banco banco) {
        this.banco = banco;
    }

    @Override
    public boolean checar(double rendaMensal, double historicoCredito) {
        double creditoDisponivel = banco.getCredito();
        return rendaMensal >= creditoDisponivel && checarProximo(rendaMensal, historicoCredito);
    }
}