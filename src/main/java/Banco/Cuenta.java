package Banco;

public class Cuenta {

        private int saldo;

        public Cuenta(int saldoInicial){
                this.saldo = saldoInicial;
        }

    public Cuenta() {
    }

    public int getsaldoInicial() {
            return saldo;
        }
        public void setsaldoInicial(int saldoInicial) {
            this.saldo = saldoInicial;
        }


    @Override
    public String toString() {
        return String.valueOf(saldo);
    }


}






