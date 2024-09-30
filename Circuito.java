public class Circuito {

	public static void main(String[] args) {
//		declaração contadores
		int volta, abdominal, abd;
		abd=0;
	for(volta = 0; volta<3; volta ++ ) {
		for(abdominal=1; abdominal<=5;abdominal++) {
			System.out.print(abdominal +" ");
			abd++;
		}System.out.print("\n");
		
	}System.out.println("Total de voltas: "+volta + "\nTotal de abdominais: "+ abd);
	}
}
