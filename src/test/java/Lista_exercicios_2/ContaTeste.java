package Lista_exercicios_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta conta1;

        @BeforeEach
        public void beforeEach() {
            conta1 = new Conta();
            conta1.setNumero(1);
            conta1.setSaldo(100.0);
        }

        @AfterEach
        public void afterEach() {
            conta1 = null;
        }

        @Test
        public void criarObjetoConta() {
            assertNotNull(conta1);
        }

        @Test
        public void presencaAtributos() {
            assertNotNull(conta1.getNumero());
            assertNotNull(conta1.getSaldo());
        }

        @Test
        public void metodoDepositar() {
            conta1.depositar(50.0);
        }

        @Test
        public void metodoDepositarValorInvalido() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.depositar(0.0));
            assertEquals("Valor deve ser maior que zero.", exception.getMessage());
        }

        @Test
        public void metodoSacar() {
            conta1.sacar(50.0);
        }

    /*
    @Test
        public void metodoSacarValorInvalido() {
            if ((conta1.valorSacado < 0) && (conta1.valorSacado > 5000.0)) {
                System.out.printf("Valor inválido");
            }
        }
    */

        @Test
        public void metodoSacarSaldoInsuficiente() {
            conta1.sacarSaldoInsuficiente(800.0);

        }

        @Test
        public void metodoTransferir() {
            conta1.transferir(conta1,50.0);
        }

        @Test
        public void metodoTransferirValorInvalido() {
            conta1.metodoTransferirValorInvalido(100.00);
        }

        @Test
        public void metodoTransferirSaldoInsuficiente() {
            conta1.metodoTransferirValorInvalido(0);

        }
        @Test
        public void depositarValorInvalido (){
            conta1.depositarValorInvalido(0);
        }
    }
