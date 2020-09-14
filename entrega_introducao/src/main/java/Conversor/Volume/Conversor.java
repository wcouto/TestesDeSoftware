package Conversor.Volume;

public class Conversor {
	
	public static void main(String[] args) {

	}
	
	public static float convertVolume(float volume) {
		if(volume == 0) {
			return 0;
		}
		return volume * 1000;
	}
}
