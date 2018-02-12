package global;

import org.junit.Test;

public class TestSubstring {

	@Test
	public void test() {
		String cd = "form-data; name=\"photo\"; fileName=\"C:User/Ian/pictures/r1.jpg\"";
		String useravater = cd.substring(cd.lastIndexOf("/") + 1, cd.length() - 1);
		System.out.println(useravater);
	}

}
