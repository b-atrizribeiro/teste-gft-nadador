public class Carro {
    public static class Carro{
        double precoFinal, valorParcela, valor;
        int qtdParcela;

        public Carro() {}

        public Carro( double valor, int qtdParcela) {
            super();
            this.valor = valor;
            this.qtdParcela = qtdParcela;
        }

        public void mostrarParcelas() {
            System.out.println("Valor: R$" + this.getPrecoFinal());
            System.out.println("Valor por parcela: R$" + this.getValorParcela());
            System.out.println("Parcelas: " + this.getQtdParcela());
        }

        public void comprar(int qtdParcela) {
            if(qtdParcela == 1)
            {
                this.setPrecoFinal(getValor() - (getValor() * 0.20));
            }
            else if(qtdParcela == 6)
            {
                this.setPrecoFinal(getValor() + (getValor() * 1.03));
                this.setValorParcela(this.getPrecoFinal() / 6);
            }
            else if(qtdParcela == 12)
            {
                this.setPrecoFinal(getValor() + (getValor() * 1.06));
                this.setValorParcela(this.getPrecoFinal() / 12);
            }
            else if(qtdParcela == 18)
            {
                this.setPrecoFinal(getValor() + (getValor() * 1.09));
                this.setValorParcela(this.getPrecoFinal() / 18);
            }
        }

        public double getValor() {
            return valor;
        }
        public void setValor(double valor) {
            this.valor = valor;
        }
        public double getPrecoFinal() {
            return precoFinal;
        }
        public void setPrecoFinal(double precoFinal) {
            this.precoFinal = precoFinal;
        }
        public double getValorParcela() {
            return valorParcela;
        }
        public void setValorParcela(double valorParcela) {
            this.valorParcela = valorParcela;
        }
        public int getQtdParcela() {
            return qtdParcela;
        }
        public void setQtdParcela(int qtdParcela) {
            this.qtdParcela = qtdParcela;
        }
    }
}
