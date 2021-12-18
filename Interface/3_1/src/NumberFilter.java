public class NumberFilter implements StringFilter{

	@Override
	public String filter(String inputString, String illegalNumbers) {
		String outputString = "";

		for (char character : inputString.toCharArray()) {
			if (!doesExist(character, illegalNumbers))
				outputString += character;
		}

		return outputString;
	}

	private boolean doesExist(char character, String illegalNumbers) {
		for (char illegal : illegalNumbers.toCharArray()) {
			if (character == illegal) {
				return true;
			}
		}
		return false;
	}
}