
public class Api {
	try {
	      File db = new File("Cadastro.txt");
	      if (db.createNewFile()) {
	        System.out.println("Ficheiro criado: " + db.getName());
	      } else {
	        System.out.println("Ficheiro existente.");
	      }
	    } catch (IOException e) {
	      System.out.println("Ocorreu um erro.");
	      e.printStackTrace();
	    }
}
