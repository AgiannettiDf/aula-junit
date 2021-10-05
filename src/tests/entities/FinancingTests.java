package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(fin.getTotalAmount(), 100000.00);
		Assertions.assertEquals(fin.getIncome(), 2000.00);
		Assertions.assertEquals(fin.getMonths(), 80);
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing fin = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		fin.setTotalAmount(90000.0);
		Assertions.assertEquals(fin.getTotalAmount(), 90000.00);
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setTotalAmount(200000.0);
		});
	}
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		fin.setIncome(3000.0);
		Assertions.assertEquals(fin.getIncome(), 3000.00);
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setIncome(1000.0);
		});
	}
	
	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		fin.setMonths(90);
		Assertions.assertEquals(fin.getMonths(), 90);
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setMonths(70);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(fin.entry(), 20000.00);
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(fin.quota(), 1000.00);
	}

}
