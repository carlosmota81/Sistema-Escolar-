package cursojava;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String text = "Carlos , Java , 90 , 85 , 75 , 60";

		String[] valoresArray = text.split(" , ");

		System.out.println(valoresArray[1]);

		List<String> list = Arrays.asList(valoresArray);

		for (String valorString : list) {
			System.out.println(valorString);
		}
		String[] conversaoArray = list.toArray(new String[6]);
		for( int pos=0; pos< conversaoArray.length;pos++) {
			System.out.println(conversaoArray);
		}
	}

}
