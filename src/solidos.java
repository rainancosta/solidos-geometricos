package area;
import javax.swing.JOptionPane;
public class solidos {
	int r,l,b1,h1,b2,h2,B,b3,h3,D,d;
	double area_cir,area_quad,area_ret,area_pi,area_tra, area_lo;
	
	void circulo() {
		r=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do raio do círculo: "));
		area_cir= (3.14*(r*r));
		JOptionPane.showMessageDialog(null,"A área do círculo é: "+area_cir + "M2");
	}
	void quadrado() {
		l=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do lado do quadrado: "));
		area_quad= (l*l);
		JOptionPane.showMessageDialog(null,"A área do quadrado é: "+area_quad + "M2");
	}
	void retangulo() {
		b1=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base do retângulo: "));
		h1=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura do retângulo: "));
		area_ret= (b1*h1);
		JOptionPane.showMessageDialog(null,"A área do retângulo é: "+area_ret + "M2");	
	}
	void piramide() {
		b2=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base da pirâmide: "));
		h2=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura da pirâmide: "));
		area_pi= (b2*h2)/2;
		JOptionPane.showMessageDialog(null,"A área da pirâmide é: "+area_pi + "M2");	
	}	
	void trapezio() {
		B=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base maior do trapézio: "));
		b3=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base menor do trapézio: "));
		h3=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura do trapézio: "));
		area_tra= ((B+b3)*h3)/2;
		JOptionPane.showMessageDialog(null,"A área do trapézio é: "+area_tra + "M2");	
	}
	void losango() {
		D=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da diagonal maior do losango: "));
		d=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da diagnal menor do losango: "));
		area_lo= (D*d)/2;
		JOptionPane.showMessageDialog(null,"A área do losango é: "+area_lo + "M2");
	}
		
}
