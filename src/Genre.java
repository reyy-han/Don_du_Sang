
public abstract class Genre {
	protected int DonMax;
	public Genre(int max){
			DonMax=max;
	}
	public abstract String toString();
	public int getDonMax(){return DonMax;}
	public abstract void reinitialise();
	public void moins1(){DonMax--;}
	public abstract boolean getEnceinte();

}
