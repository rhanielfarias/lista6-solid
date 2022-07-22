    public class Estagiario extends  Funcionario {
    private double bolsa;
    private String nomeEstagiario;


        public Estagiario(String nome, String cpf, int nr, int ol, double salario, double bolsa, String nomeEstagiario) {
            super(nome, cpf, nr, ol, salario);
            this.bolsa = bolsa;
            this.nomeEstagiario = nomeEstagiario;
        }

        @Override
        public double calculaReembolso() {
            return 0;
        }

        public double getBolsa() {
    return bolsa;
    }

    public void setBolsa(double bolsa) {
    this.bolsa= bolsa;
    }


    public String getNomeEstagiario () {
    return nomeEstagiario;
    }
    public void setnomeEstagiario (String nomeEstagiario) {
    this.nomeEstagiario = nomeEstagiario;
    }
}
