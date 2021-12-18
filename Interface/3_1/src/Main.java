public class Main {
	public static void main(String[] args) {
		NumberFilter nf = new NumberFilter();
		CharacterFilter cf = new CharacterFilter();
		
		String s = "Th1s 1s 4 t3st str!ng :);";


		System.out.println(cf.filter(s, ":!);"));
		System.out.println(nf.filter(s, "123"));
	}
}
