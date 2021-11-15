
import java.time.LocalDate;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {

	/**
	 * Cenário: Deve executar especificação
	 */
	@Dado("que eu criei o arquivo corretamento")
	public void que_eu_criei_o_arquivo_corretamento() {
	}

	@Quando("executa-lo")
	public void executa_lo() {
	}

	@Entao("a especificalçao deve finalizar com sucesso")
	public void a_especificalcao_deve_finalizar_com_sucesso() {
	}

	/**
	 * Cenário: Deve incrementar contador
	 */

	private int contador = 0;

	@Dado("o valor do contador e {int}")
	public void oValorDoContadorÉ(Integer int1) {
		this.contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void euIncrementarEm(Integer int1) {
		this.contador = this.contador + int1;
	}

	@Entao("o valor do contador sera {int}")
	public void oValorDoContadorSerá(Integer int1) {
		Assert.assertEquals(int1, this.contador, 0.1);
	}

	/**
	 * Cenário: Deve calcular atraso no prazo de entrega
	 */

	private LocalDate prazo = null;

	@Dado("que o prazo de entrega em dia {int}\\/{int}\\/{int}")
	public void queOPrazoEDia(Integer dia, Integer mes, Integer ano) {
		prazo = LocalDate.of(ano, mes, dia);
	}

	@Quando("a entrega atrasar em {int} {string}")
	public void aEntregaAtrasarEmDias(Integer int1, String tempo) {
		condicaoNovoPrazoEntrega(int1, tempo);
	}

	private void condicaoNovoPrazoEntrega(Integer int1, String tempo) {
		if (tempo.equals("dias")) {
			prazo = prazo.plusDays(int1+1);
		} else {
			prazo = prazo.plusMonths(int1);
		}
	}

	@Entao("a entrega sera efetuada em {int}\\/{int}\\/{int}")
	public void aEntregaSeraEfetuadaEm(Integer dia, Integer mes, Integer ano) {
		Assert.assertEquals(0, prazo.compareTo(LocalDate.of(ano, mes, dia)));
		prazo = null;
	}

	// Cenário: Deve calcular atraso no prazo de entrega da china

	@Entao("a entrega deve ser efetuada em {int}\\/{int}\\/{int}")
	public void aEntregaDeveSerEfetuadaEm(Integer dia, Integer mes, Integer ano) {
		Assert.assertEquals(0, prazo.compareTo(LocalDate.of(ano, mes, dia)));
		prazo = null;
	}
}
