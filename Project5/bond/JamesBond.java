
public class JamesBond {
	public Boolean bondRegex(String input){
		return input.matches("^[0-9,(,)]*\\(+[0-9,(,)]*007[0-9,(,)]*\\)+[0-9,(,)]*$");
	}
}
