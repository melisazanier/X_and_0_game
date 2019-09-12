package dev.codenmore.firstGame.multyPlayer;

public class SinglePlayerAI extends Single {

	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~TESTS HERE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public static void validPotentionalWinning() {
		int i,j,l,c,l1,c1;
		int sumaDiagP=0,sumaDiagS=0,sumaLinie,sumaColoana,diagPL=-1,diagPC=-1,diagSL=-1,diagSC=-1;
		
		for(i=0;i<=2;i++)
		{  sumaLinie=0;
		   sumaColoana=0;
		   l=-1; l1=-1;
		   c=-1; c1=-1;
			for(j=0;j<=2;j++)
			{
				sumaLinie=sumaLinie+matrix1[i][j];
				sumaColoana=sumaColoana+matrix1[j][i];
				if(matrix1[i][j]==0)
				{
					l=i;
					c=j;
				}
				if(matrix1[j][i]==0)
				{
					l1=j;
					c1=i;
				}
				if(i==j)
				{
					sumaDiagP=sumaDiagP+matrix1[i][j];
					if(matrix1[i][j]==0)
					{
						diagPL=i;
						diagPC=j;
					}
						
				}
				
				if(2-i==j)
				{
					sumaDiagS=sumaDiagS+matrix1[i][j];
					if(matrix1[i][j]==0)
					{
						diagSL=i;
						diagSC=j;
					}
						
				}
				
			}
			if(sumaLinie==4 && l!=-1 && c!=-1)
			{
				linie=l;
				coloana=c;
			}
			if(sumaColoana==4 && l1!=-1 && c1!=-1)
			{
				linie=l1;
				coloana=c1;
			}
		}
		
		
		if(sumaDiagP==4 && diagPL!=-1 && diagPC!=-1)
		{
			linie=diagPL;
			coloana=diagPC;
		}
		
		if(sumaDiagS==4 && diagSL!=-1 && diagSC!=-1)
		{
			linie=diagSL;
			coloana=diagSC;
		}
		
		
	}
	
	
	public  static void verifyPotentionalLost() {
		
		int i,j,sumaLinie,sumaColoana,k1,k2,l=-1,l1=-1,c=-1,c1=-1,sumaDiagP=0,sumaDiagS=0,diagPL=-1,diagPC=-1,diagSL=-1,diagSC=-1;
		
		for(i=0;i<=2;i++)
		{  sumaLinie=0; 
		   sumaColoana=0;
		   k1=0;k2=0;l=-1;l1=-1;c=-1;c1=-1;
			for(j=0;j<=2;j++)
			{
				sumaLinie=sumaLinie+matrix1[i][j];
				sumaColoana=sumaColoana+matrix1[j][i];
			   	if(matrix1[i][j]==2)
			   		k1=1;
			   	if(matrix1[j][i]==2)
			   		k2=1;
			   	if(matrix1[i][j]==0)
			   	{
			   		l=i;
			   		c=j;
			   	}
			   	if(matrix1[j][i]==0)
			   	{
			   		l1=j;
			   		c1=i;
			   	}
			   	
			   	if(i==j && matrix1[i][j]!=2)
				{
					sumaDiagP=sumaDiagP+matrix1[i][j];
					if(matrix1[i][j]==0)
					{
						diagPL=i;
						diagPC=j;
					}
						
				}
				
				if(2-i==j && matrix1[i][j]!=2)
				{
					sumaDiagS=sumaDiagS+matrix1[i][j];
					if(matrix1[i][j]==0)
					{
						diagSL=i;
						diagSC=j;
					}
						
				}
			
			
			if(sumaLinie==2 && k1==0 && l!=-1 && c!=-1 )
			{
				linie=l;
				coloana=c;
			}
			
			if(sumaColoana==2 && k2==0 && l1!=-1 && c1!=-1 )
			{
				linie=l1;
				coloana=c1;
			}
		}
			
			
	  }
		if(sumaDiagP==2 && diagPL!=-1 && diagPC!=-1)
		{
			linie=diagPL;
			coloana=diagPC;
		}
		if(sumaDiagS==2 && diagSL!=-1 && diagSC!=-1)
		{
			linie=diagSL;
			coloana=diagSC;
		}
	}
	
	public static void thinkMelisaThink() {
		
		
		//linie=(int) (Math.random() * (2 ) + 0);
		//coloana=(int) (Math.random() * (2 ) + 0);
		
		for(int i=0;i<=2;i++)
			for(int j=0;j<=2;j++)
				if(matrix1[i][j]==0)
				{
					linie=i;
					coloana=j;
				}

	
		verifyPotentionalLost();
		validPotentionalWinning();		
		
		
		SinglePlayer.setValue();	

	
		
	}
	public static int getLinie() {
		return linie;
	}
	public static int getColoana() {
		return coloana;
	}
}
