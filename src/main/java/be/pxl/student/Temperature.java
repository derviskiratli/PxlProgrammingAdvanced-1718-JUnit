package be.pxl.student;

public class Temperature {

	private static final float MINIMUM_TEMPERATURE = -273.15F;
	private float temp;

	public Temperature (float temp) {
		this.setValue (temp);
	}

	public float getValue () {
		return temp;
	}

	public void setValue (float temp) {
		if (temp <= MINIMUM_TEMPERATURE) {
			throw new InvalidTemperatureException ();
		}
		this.temp = temp;
	}

	public boolean isBoiling () {
		return this.temp >= 100;
	}

	public boolean isFreezing () {
		return this.temp < 0;
	}


	@Override
	public boolean equals (Object o) {
		if ( this == o ) { return true; }
		if ( o == null || getClass () != o.getClass () ) { return false; }

		Temperature that = (Temperature) o;

		return Float.compare (that.temp, temp) == 0;
	}

	@Override
	public int hashCode () {
		return (temp != +0.0f ? Float.floatToIntBits (temp) : 0);
	}
}
