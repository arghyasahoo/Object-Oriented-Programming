public class CharacterFilter implements StringFilter{

	@Override
	public String filter(String inputString, String illegalCharacters) {
		String outputString = "";

		for (char character : inputString.toCharArray()) {
			if (!doesExist(character, illegalCharacters))
				outputString += character;
		}

		return outputString;
	}

	private boolean doesExist(char character, String illegalCharacters) {
		for (char illegal : illegalCharacters.toCharArray()) {
			if (character == illegal) {
				return true;
			}
		}
		return false;
	}
}