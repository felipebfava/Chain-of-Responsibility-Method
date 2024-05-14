
public class CheckRendaMiddleware extends Middleware {

    //Parcela não pode ser superior a 25% da renda mensal
    @Override
    public boolean checar(double rendaMensal, double historicoCredito) {
        return rendaMensal * 0.25 >= historicoCredito && checarProximo(rendaMensal, historicoCredito);
    }
}