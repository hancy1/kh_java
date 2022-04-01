package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {

		SmartPhone[] sp = new SmartPhone[2];
		
		sp[0] = new GalaxyNote9();
		sp[1] = new V40();
		
		for(int i = 0 ; i < sp.length; i++) {
			sp[i].printMaker();
			sp[i].makeaCall();
			sp[i].takeaCall() ;
			sp[i].touch() ;
			sp[i].charge() ;
			sp[i].picture();
			System.out.println();
		}
		
		
	}

}
