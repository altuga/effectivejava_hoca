
package org.effectivejava.examples.chapter02.item05.kodcu.fastversion;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

class Calisan {
	private final Date birthDate;

	public Calisan(Date birthDate) {

		this.birthDate = new Date(birthDate.getTime());
	}

	// Other fields, methods

	/**
	 * The starting and ending dates of the baby boom.
	 */
	private static final Date BOOM_START;
	private static final Date BOOM_END;

	static { // key point
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));// olusturulması maliyetli nesneler
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}

	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0
				&& birthDate.compareTo(BOOM_END) < 0;
	}
}
