package music.live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Veena veena = new Veena();
        veena.play();
        
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        
        /*
         * Up- Casting
         */
        Playable playable = veena;
        playable.play();
        
        Playable playable2 = saxophone;
        playable2.play();
        
        /*
         * We can not create instance of interface
         */
        
//        Playable playable1 = new Playable();
//        playable1 = veena;
//        playable1.play();
	}

}
