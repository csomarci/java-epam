public class StringFunctions {

	public static void main(String[] args){
		System.out.println(capitalizeFirstLetter("legyenNagyBetu"));
		System.out.println(transformIntoEnglish("árvíztűrőtükörfúrógép"));
	}
	
	public static String capitalizeFirstLetter (String stringArgument){
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < stringArgument.length(); i++){
			if (i == 0){
				str.append(Character.toUpperCase(stringArgument.charAt(i)));
			} else {
			str.append(stringArgument.charAt(i));
			}
		}
		return str.toString();
	}
	
	public static String transformIntoEnglish (String stringArgument){
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < stringArgument.length(); i++){
			char currentLetter = stringArgument.charAt(i);
			if (currentLetter == 'á') {
				str.append('a');
			} else if (currentLetter == 'é') {
				str.append('e');
			} else if (currentLetter == 'í') {
				str.append('i');
			} else if (currentLetter == 'ó' || currentLetter == 'ő' currentLetter == 'ö') {
				str.append('o');
			} else if (currentLetter == 'ú' || currentLetter == 'ü' currentLetter == 'ű') {
				str.append('u');
			} else {
				str.append(stringArgument.charAt(i));
			}
		}
		return str.toString();
	}

}