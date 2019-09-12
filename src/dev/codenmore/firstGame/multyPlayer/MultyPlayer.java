package dev.codenmore.firstGame.multyPlayer;



public class MultyPlayer {


		public static int [][] matrix = new int[3][3];
		private static int jeton,contor=0;
		private static int linie,coloana;
		private static int nrMutare=0;
		public static boolean r=false;
		
		

		
		public static void verificationPosition(float pozitieX,float pozitieY)
		{
	
			if((pozitieX > 0) && (pozitieX < 100) && (pozitieY > 50) && (pozitieY < 150))
				if(matrix[0][0]==0)
				       	 {
					      linie=0;
				       	  coloana=0; 	
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }

			
			if((pozitieX > 100) && (pozitieX < 200) && (pozitieY > 50) && (pozitieY < 150))
				if(matrix[0][1]==0)
				       	 {
					      linie=0;
				       	  coloana=1;
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }
	
			
			if((pozitieX >200) && (pozitieX < 300) && (pozitieY > 50) && (pozitieY < 150))
				if(matrix[0][2]==0)
				       	 {
					      linie=0;
				       	  coloana=2;				       	 
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }

			
			if((pozitieX > 0) && (pozitieX < 100) && (pozitieY > 150) && (pozitieY < 250))
				if(matrix[1][0]==0)
				       	 {
					      linie=1;
				       	  coloana=0;			       	
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }

			
			if((pozitieX > 100) && (pozitieX < 200) && (pozitieY > 150) && (pozitieY < 250))
				if(matrix[1][1]==0)
				       	 {
					      linie=1;
				       	  coloana=1;
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }

					
			if((pozitieX >200) && (pozitieX < 300) && (pozitieY > 150) && (pozitieY < 250))
				if(matrix[1][2]==0)
				       	 {
					      linie=1;
				       	  coloana=2;				       	 
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }
			
			
			if((pozitieX > 0) && (pozitieX < 100) && (pozitieY > 250) && (pozitieY < 350))
				if(matrix[2][0]==0)
				       	 {
					      linie=2;
				       	  coloana=0;				       	
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }

			
			if((pozitieX > 100) && (pozitieX < 200) && (pozitieY > 250) && (pozitieY < 350))
				if(matrix[2][1]==0)
				       	 {
					      linie=2;
				       	  coloana=1;				       	 
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }
			
			
			if((pozitieX >200) && (pozitieX < 300) && (pozitieY > 250) && (pozitieY < 350))
				if(matrix[2][2]==0)
				       	 {
					      linie=2;
				       	  coloana=2;				       	 
					      setValue();
					      setNrMutare(getNrMutare() + 1);
				       	 }
			
			
			if((pozitieX >0) && (pozitieX < 300) && (pozitieY > 0) && (pozitieY < 50))
				jeton=1;
			
			
			
	       	  if(findSolution()==1)
	       	  {
	       		 
                 r=true;
 
	       	  }
	       	  contor=0;
	       	  for(int i=0;i<=2;i++)
	       		  for(int j=0;j<=2;j++)
	       			  if(matrix[i][j]!=0)
	       				  {contor++;
	       	              }
	       	  if(contor==9)
	       		  r=true;
			}

		

		public static int getContor()
		{
			return contor;
		}
	
		public static void setValue() {

			if(getNrMutare()%2==0 )
			
			   jeton=1;
			
			else
				jeton =2;
			
			matrix[linie][coloana]=jeton;
			}
		
			
	
		
		public static int getVar(){
			return jeton;
		}
		public static void setVar(int newJeton){
			 jeton=newJeton;
		}
		
		public static int getLinie(){
			return linie;
		}
		public static int getColoana(){
			return coloana;
		}


				
		public static int findSolution() {
			
			int countDiagP=0;
			int countDiagS=0;
			
			for(int i = 0 ;i < 3; i++)
			{
				int count1=0;
				int count2=0;
				
				for(int j = 0 ; j < 3 ;j++)
				{
					if(matrix[i][j] == jeton)
						count1++;
					
					if(matrix[j][i] == jeton)
						count2++;
					
					if(i == j && matrix[i][j] == jeton)
						countDiagP++;
					
					if(i + j == 2 && matrix[i][j] == jeton)
						countDiagS++;
				}
				
				if(count1==3 || count2==3)
					return 1;
			}
			
			if(countDiagP==3 ||countDiagS==3)
				return 1;
			
			return 0;
		}



		public static int getNrMutare() {
			return nrMutare;
		}



		public static void setNrMutare(int nrMutare) {
			MultyPlayer.nrMutare = nrMutare;
		}
	}
		

		


	
	

