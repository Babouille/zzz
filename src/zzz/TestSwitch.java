package zzz;

public class TestSwitch {

	static enum Enumeration {
		rouge,
		bleu,
		vert
	}


	public static void main (String [] args){


	Enumeration enu = null ;
	enu = enu.rouge ;

	switch (enu) {

	case rouge :
		System.out.println(enu);

	default :
		System.out.println("default");
		break;

	case bleu :
		System.out.println(enu);
		break;

	case vert :
		System.out.println(enu);
		break;


	}

	}

}
