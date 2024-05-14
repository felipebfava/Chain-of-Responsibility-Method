
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Pessoa pessoa = new Pessoa();
        pessoa.setCPF("123456");
        pessoa.setRendaMensal(3500);

        Server server = new Server();
        server.setMiddleware(Middleware.link(
            new CheckCreditoMiddleware(banco),
            new CheckRendaMiddleware(),
            new CheckSPCMiddleware()
        ));

        boolean aprovado = server.verificar(pessoa.getRendaMensal(), pessoa.getCPF());
        if(aprovado) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado!");
        }
    }
}
