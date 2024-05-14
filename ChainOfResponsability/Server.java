import java.util.Map;
import java.util.HashMap;

public class Server {
    private Map<String, Double> historicoCredito = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean verificar(double rendaMensal, String CPF) {
        if(middleware != null) {
            System.out.println("Verificação aceita!");
            return middleware.checar(rendaMensal, historicoCredito.getOrDefault(CPF, 0.0));
            
        }
        return false;
    }

    public void adicionarHistoricoCredito(String CPF, double valorHistorico) {
        historicoCredito.put(CPF, valorHistorico);
    }
}