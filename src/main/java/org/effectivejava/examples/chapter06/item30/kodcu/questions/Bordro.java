
package org.effectivejava.examples.chapter06.item30.kodcu.questions;

enum Bordro {
	PAZARTESI(PayType.HAFTA_ICI), SALI(PayType.HAFTA_ICI), CARSAMBA(
			PayType.HAFTA_ICI), PERSEMBE(PayType.HAFTA_ICI), CUMA(PayType.HAFTA_ICI), CUMARTESI(
			PayType.HAFTA_SONU), PAZAR(PayType.HAFTA_SONU);

	private final PayType payType;

    Bordro(PayType payType) {
		this.payType = payType;
	}

	double pay(double hoursWorked, double payRate) {
		return payType.pay(hoursWorked, payRate);
	}

	// The strategy enum type
	private enum PayType {
		HAFTA_ICI {
			double overtimePay(double hours, double payRate) {
				return hours * payRate * 2;
			}
		},
		HAFTA_SONU {
			double overtimePay(double hours, double payRate) {
				return hours * payRate / 2;
			}
		};
		private static final int HOURS_PER_SHIFT = 8;

		abstract double overtimePay(double hrs, double payRate);

		double pay(double hoursWorked, double payRate) {
			double basePay = hoursWorked * payRate;
			return basePay + overtimePay(hoursWorked, payRate);
		}
	}

    public static void main(String[] args) {
        System.out.println(Bordro.CUMA.pay(40, 100));
    }
}
