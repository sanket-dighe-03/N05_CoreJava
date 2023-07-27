package Harachical;

public class Snowcone extends Android{
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + "]";
	}

	public Snowcone(String brand,String Slot,int version) {
		super(brand,slot);
		this.version = version;
	}
}
