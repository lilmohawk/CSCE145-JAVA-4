import javax.swing.JOptionPane;
public class Program4CampbellMarcus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal mammal = new Mammal();
		Animal [] Animals = {new Animal(),new Mammal(), new Bird(), new Fish()};
		
		for (int i = 0; i < Animals.length; i++) {
			JOptionPane.showMessageDialog(null, Animals[i].getMessage());
		}
	}

}
