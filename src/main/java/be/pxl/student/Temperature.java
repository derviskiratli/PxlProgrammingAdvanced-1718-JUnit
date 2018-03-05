package be.pxl.student;

public class Temperature {

	private float temp;

	public Temperature (float temp) {
		this.temp = temp;
	}

	public float getValue () {
		return temp;
	}

	public void setValue (float temp) {
		this.temp = temp;
	}

	public boolean isBoiling () {
		return false;
	}

	public boolean isFreezing () {
		return false;
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