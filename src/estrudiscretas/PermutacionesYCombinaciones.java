package estrudiscretas;

import javax.swing.JOptionPane;

public class PermutacionesYCombinaciones {
	
	public static int factorial(int x){
		int i,f;
		f=1;
		for(i=1;i<=x;i++)
		            f=f*i;
		        return f;
		}
		
		public static int permuta(int n, int r){
			int w;
		    w=(int)Math.pow(n, r);
			return w;
		}
		public static int permutasinrep(int n){
			int a;
			a= factorial(n);
			return a;
		}
		
		public static int permutarepetcio(int n,int r1,int r2,int r3) {
			int result;
			result=factorial(r1)*factorial(r2)*factorial(r3);
			int resp= factorial(n)/result;
			return resp;
			
		}
		
		public static int combina(int n, int r){
			int c;
			c=factorial(n+r-1)/(factorial(r)*factorial(n-1));
			return c;
		}
		public static int combinasinrep(int n, int r) {
			int f;
			f=factorial(n)/(factorial(r)*factorial(n-r));
			return f;
		}
		
		public static int variacion(int n,int r){
			int w;
		     w=(int)Math.pow(n, r);
		     
			return w;
		}
		public static int variacionsinrep(int n, int r) {
			int z;
			z=factorial(n)/factorial(n-r);
			return z;
		}
		
	
		    public static void main(String[] args) {
		    	int n,r1,r2,r3,opcion,opcion1,Comb1,Comb2,Perm1,Perm2,Var1,Var2,per4;
		    	
		    	n=Integer.parseInt(JOptionPane.showInputDialog("introduzca el valor de n : "));
		    	r1=Integer.parseInt(JOptionPane.showInputDialog("introduzca el primer valor de r : "));
		    	r2=Integer.parseInt(JOptionPane.showInputDialog("introduzca el segundo valor de r : "));
		    	r3=Integer.parseInt(JOptionPane.showInputDialog("introduzca el tercero valor de r : "));
		    	
		    	Comb1=combina(n,r1);
		        Comb2=combinasinrep(n,r1);
		        Perm1=permuta(n,r1);
		        Perm2=permutasinrep(n);
		        Var1=variacion(n,r1);
		        Var2=variacionsinrep(n,r1);
		        per4=permutarepetcio(n,r1,r2,r3);

		        opcion1 = JOptionPane.showConfirmDialog(null, "Desea seguir 			ejecutando la aplicaci�n?", "Seleccione una opci�n", 				JOptionPane.YES_NO_OPTION);
				while (opcion1 == 0)
				{
					
		        opcion=Integer.parseInt(JOptionPane.showInputDialog("seleccione el resultado que desea:\n "
		    			+ "1-combinacion con repeticion\n"
		    			+ "2-combinacion sin repeticion\n" 
		    			+ "3-permutacion con repeticion\n"
		    			+ "4-permutacion sin repeticion\n"
		    			+ "5-variacion con repeticion\n"
		    			+ "6-variacion sin repeticion\n"
		    			+"7-Permutacion con repeticion con m�s numeros"));
		        switch (opcion)
		        {
		    	case 1: JOptionPane.showMessageDialog(null, "EL resultado de la combinacion con repeticion es : " +Comb1); break;
		    	case 2: JOptionPane.showMessageDialog(null, "EL resultado de la combinacion sin repeticion es : " +Comb2); break;
		    	case 3: JOptionPane.showMessageDialog(null, "EL resultado de la permutacion con repeticion es : " +Perm1); break;
		    	case 4: JOptionPane.showMessageDialog(null, "EL resultado de la permutacion sin repeticion es : " +Perm2); break;
		    	case 5: JOptionPane.showMessageDialog(null, "EL resultado de la variacion con repeticion es : " +Var1); break;
		    	case 6: JOptionPane.showMessageDialog(null, "EL resultado de la variacion sin repeticion es : " +Var2); break;
		    	case 7: JOptionPane.showMessageDialog(null, "EL resultado de la permutacion con repeticion : " +per4); break;
		    	default: JOptionPane.showMessageDialog(null,  "NO HAY OPCION DISPONIBLE ");
		        }
		        opcion = JOptionPane.showConfirmDialog(null, "Desea seguir 			ejecutando la aplicaci�n?", "Seleccione una opci�n", 				JOptionPane.YES_NO_OPTION);
		      
		}	
		if(opcion1== 1) {
			System.exit(0);	
		}
	}
}
