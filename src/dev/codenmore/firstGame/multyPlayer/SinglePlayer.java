package dev.codenmore.firstGame.multyPlayer;



public class SinglePlayer extends Single {

			
			
			

			
			public static void verificationPosition(float pozitieX,float pozitieY)
			{
		
				if((pozitieX > 0) && (pozitieX < 100) && (pozitieY > 50) && (pozitieY < 150))
					if(matrix1[0][0]==0)
					       	 {
						      linie=0;
					       	  coloana=0; 	
						      setValue();
						      nrMutare++;
					       	 }

				
				if((pozitieX > 100) && (pozitieX < 200) && (pozitieY > 50) && (pozitieY < 150))
					if(matrix1[0][1]==0)
					       	 {
						      linie=0;
					       	  coloana=1;
						      setValue();
						      nrMutare++;
					       	 }
		
				
				if((pozitieX >200) && (pozitieX < 300) && (pozitieY > 50) && (pozitieY < 150))
					if(matrix1[0][2]==0)
					       	 {
						      linie=0;
					       	  coloana=2;				       	 
						      setValue();
						      nrMutare++;
					       	 }

				
				if((pozitieX > 0) && (pozitieX < 100) && (pozitieY > 150) && (pozitieY < 250))
					if(matrix1[1][0]==0)
					       	 {
						      linie=1;
					       	  coloana=0;			       	
						      setValue();
						      nrMutare++;
					       	 }

				
				if((pozitieX > 100) && (pozitieX < 200) && (pozitieY > 150) && (pozitieY < 250))
					if(matrix1[1][1]==0)
					       	 {
						      linie=1;
					       	  coloana=1;
						      setValue();
						      nrMutare++;
					       	 }

						
				if((pozitieX >200) && (pozitieX < 300) && (pozitieY > 150) && (pozitieY < 250))
					if(matrix1[1][2]==0)
					       	 {
						      linie=1;
					       	  coloana=2;				       	 
						      setValue();
						      nrMutare++;
					       	 }
				
				
				if((pozitieX > 0) && (pozitieX < 100) && (pozitieY > 250) && (pozitieY < 350))
					if(matrix1[2][0]==0)
					       	 {
						      linie=2;
					       	  coloana=0;				       	
						      setValue();
						      nrMutare++;
					       	 }

				
				if((pozitieX > 100) && (pozitieX < 200) && (pozitieY > 250) && (pozitieY < 350))
					if(matrix1[2][1]==0)
					       	 {
						      linie=2;
					       	  coloana=1;				       	 
						      setValue();
						      nrMutare++;
					       	 }
				
				
				if((pozitieX >200) && (pozitieX < 300) && (pozitieY > 250) && (pozitieY < 350))
					if(matrix1[2][2]==0)
					       	 {
						      linie=2;
					       	  coloana=2;				       	 
						      setValue();
						      nrMutare++;
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
		       			  if(matrix1[i][j]!=0)
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

				if(nrMutare%2==0 )
				
				   jeton=1;
				
				else
					jeton =2;
				
				matrix1[linie][coloana]=jeton;

				}
			
				
		
			
			public static int getVar(){
				return jeton;
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
						if(matrix1[i][j] == jeton)
							count1++;
						
						if(matrix1[j][i] == jeton)
							count2++;
						
						if(i == j && matrix1[i][j] == jeton)
							countDiagP++;
						
						if(i + j == 2 && matrix1[i][j] == jeton)
							countDiagS++;
					}
					
					if(count1==3 || count2==3)
						return 1;
				}
				
				if(countDiagP==3 ||countDiagS==3)
					return 1;
				
				return 0;
			}



			public static int getLinie() {
				// TODO Auto-generated method stub
				return linie;
			}

			public static int getColoana() {
				// TODO Auto-generated method stub
				return coloana;
			}



			public static int getNrMutare() {
				// TODO Auto-generated method stub
				return nrMutare;
			}



			public static void setNrMutare(int i) {
				// TODO Auto-generated method stub
				nrMutare=i;
			}


			
				}
		
			

			


		
		



