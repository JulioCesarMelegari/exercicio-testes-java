package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjectValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			@SuppressWarnings("unused")
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	//TotalAmount - deve atualizar o valor quando os dados forem validos
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}
	
	//TotalAmount - deve lançar exception quendo os dados não forem válidos
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
	}
	
	//income - deve atualizar o valor quando os dados forem validos
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		f.setIncome(2100.0);
		
		Assertions.assertEquals(2100.0, f.getIncome());
	}
	
	//income -deve lançar exception quandos os vados não forem validos
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1900.0);
		});
	}
	
	//Months - deve atualizar valor quando os dados forem validos
	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		f.setMonths(81);
		Assertions.assertEquals(81, f.getMonths());
	}
	
	//Months - deve lançar exception quando os dados não forem validos
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(79);
		});
	}
	
	//deve calcular corretamente o valor da entrada
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(20000.0, f.entry());
	}
	
	//deve calcular corretamente o valor da prestacao
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(1000.0, f.quota());
	}
	
}
