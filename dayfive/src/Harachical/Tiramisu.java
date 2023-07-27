package Harachical;

public class Tiramisu extends Android{
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + "]";
	}

	public Tiramisu(int version) {
		super(brand ,slotType);
		this.version = version;
	}
	

}
