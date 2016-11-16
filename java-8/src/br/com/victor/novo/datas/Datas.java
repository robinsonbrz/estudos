package br.com.victor.novo.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	// Trabalhando com novas APIs de Data - Java 8
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate olimpiadasRio = LocalDate.of(2018, Month.JUNE, 5);
		System.out.println(olimpiadasRio);

		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);

		// Trabalhando com periodo
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo);

		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());

		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(2));
		System.out.println(hoje.minusDays(10));

		// Apis mutaveis
		olimpiadasRio.plusYears(4);
		System.out.println(olimpiadasRio);

		/*
		 * No caso acima, quanto executado será exibido a data atual, isto por
		 * que não será modificado a instancia armazenada na variavel
		 * olimpiadasRio, mais sim será criado uma nova referecia, que precisa
		 * ser armazenada em outro local.
		 * 
		 * LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		 * System.out.println(proximasOlimpiadas);
		 */

		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);

		// Formatando datas

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);

		// Medida de tempo

		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(agora.format(formatadorComHoras));
		
	}
}
