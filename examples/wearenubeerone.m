function main(){

	
	Speed 200;

	
	Instrument 4;

	Vol 70;

	BassI = Note F 2;

	BassVI = Note C # 2;

	BassV = Note C 2;

	Imin = Chord(BassI, BassI(+3), BassI(+7));

	VIM = Chord(BassVI, BassVI(+4), BassVI(+7));

	V7 = Chord(BassV, BassV(+4), BassV(+7), BassV(+10));





	Lead = Melody (60 F 3.4* C 4.8 B 3.16 C 4.16 B 3.16 C 4.16 B 3.8 C 4.8
			  A b 3.4 F 3.4 Z.8 F 3.8 A b 3.8 C 4.8
	
		 	  D b 4.4 A b 3.4 E b 4.4  D b 4.4

			  C 4.8 D b 4.8 C 4.8 D b 4.8 C 4.8 Z.4*);



	Comp = Melody (4 BassI.8 Imin.8 BassI.8 Imin.8 BassI.8 Imin.8 BassI.8 Imin.8

			 BassI.8 Imin.8 BassI.8 Imin.8 BassI.8 Imin.8 BassI.8 Imin.8

			 BassVI.8 VIM.8 BassVI.8 VIM.8 BassVI.8 VIM.8 BassVI.8 VIM.8

			 BassV.8 V7.8 BassV.8 V7.8 BassV.8 V7.8 BassV.8 V7.8);



	We = Poli {

		Lead |
 
		Comp |

        };

    Lead;

    Z.16;

	We;

	We;

}