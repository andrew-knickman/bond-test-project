import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {

	//Generated JUnit test for test case 1: (
	@Test
	public void testCase1() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 2: ( (
	@Test
	public void testCase2() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("((");
		assertFalse(result);
	}

	//Generated JUnit test for test case 3: ( ( (
	@Test
	public void testCase3() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(((");
		assertFalse(result);
	}

	//Generated JUnit test for test case 4: ( ( )
	@Test
	public void testCase4() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(()");
		assertFalse(result);
	}

	//Generated JUnit test for test case 5: ( ( 0 0 7 )
	@Test
	public void testCase5() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("((007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 6: ( ( 0 7 )
	@Test
	public void testCase6() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("((07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 7: ( ( 7 )
	@Test
	public void testCase7() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("((7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 8: ( )
	@Test
	public void testCase8() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("()");
		assertFalse(result);
	}

	//Generated JUnit test for test case 9: ( ) (
	@Test
	public void testCase9() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("()(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 10: ( ) )
	@Test
	public void testCase10() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("())");
		assertFalse(result);
	}

	//Generated JUnit test for test case 11: ( ) 0 0 7 )
	@Test
	public void testCase11() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("()007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 12: ( ) 0 7 )
	@Test
	public void testCase12() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("()07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 13: ( ) 7 )
	@Test
	public void testCase13() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("()7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 14: ( 0 (
	@Test
	public void testCase14() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 15: ( 0 ( (
	@Test
	public void testCase15() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0((");
		assertFalse(result);
	}

	//Generated JUnit test for test case 16: ( 0 ( )
	@Test
	public void testCase16() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0()");
		assertFalse(result);
	}

	//Generated JUnit test for test case 17: ( 0 ( 0 0 7 )
	@Test
	public void testCase17() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0(007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 18: ( 0 ( 0 7 )
	@Test
	public void testCase18() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0(07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 19: ( 0 ( 7 )
	@Test
	public void testCase19() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0(7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 20: ( 0 )
	@Test
	public void testCase20() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 21: ( 0 ) (
	@Test
	public void testCase21() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0)(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 22: ( 0 ) )
	@Test
	public void testCase22() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0))");
		assertFalse(result);
	}

	//Generated JUnit test for test case 23: ( 0 ) 0 0 7 )
	@Test
	public void testCase23() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0)007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 24: ( 0 ) 0 7 )
	@Test
	public void testCase24() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0)07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 25: ( 0 ) 7 )
	@Test
	public void testCase25() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0)7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 26: ( 0 0 (
	@Test
	public void testCase26() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 27: ( 0 0 ( (
	@Test
	public void testCase27() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00((");
		assertFalse(result);
	}

	//Generated JUnit test for test case 28: ( 0 0 ( )
	@Test
	public void testCase28() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00()");
		assertFalse(result);
	}

	//Generated JUnit test for test case 29: ( 0 0 ( 0 0 7 )
	@Test
	public void testCase29() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00(007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 30: ( 0 0 ( 0 7 )
	@Test
	public void testCase30() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00(07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 31: ( 0 0 ( 7 )
	@Test
	public void testCase31() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00(7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 32: ( 0 0 )
	@Test
	public void testCase32() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 33: ( 0 0 ) (
	@Test
	public void testCase33() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00)(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 34: ( 0 0 ) )
	@Test
	public void testCase34() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00))");
		assertFalse(result);
	}

	//Generated JUnit test for test case 35: ( 0 0 ) 0 0 7 )
	@Test
	public void testCase35() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00)007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 36: ( 0 0 ) 0 7 )
	@Test
	public void testCase36() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00)07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 37: ( 0 0 ) 7 )
	@Test
	public void testCase37() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00)7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 38: ( 0 0 0 (
	@Test
	public void testCase38() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(000(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 39: ( 0 0 0 )
	@Test
	public void testCase39() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(000)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 40: ( 0 0 0 0 0 7 )
	@Test
	public void testCase40() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(000007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 41: ( 0 0 0 0 7 )
	@Test
	public void testCase41() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 42: ( 0 0 0 7 )
	@Test
	public void testCase42() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 43: ( 0 0 1 (
	@Test
	public void testCase43() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(001(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 44: ( 0 0 1 )
	@Test
	public void testCase44() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(001)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 45: ( 0 0 1 0 0 7 )
	@Test
	public void testCase45() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(001007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 46: ( 0 0 1 0 7 )
	@Test
	public void testCase46() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00107)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 47: ( 0 0 1 7 )
	@Test
	public void testCase47() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0017)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 48: ( 0 0 2 (
	@Test
	public void testCase48() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(002(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 49: ( 0 0 2 )
	@Test
	public void testCase49() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(002)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 50: ( 0 0 2 0 0 7 )
	@Test
	public void testCase50() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(002007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 51: ( 0 0 2 0 7 )
	@Test
	public void testCase51() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00207)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 52: ( 0 0 2 7 )
	@Test
	public void testCase52() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0027)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 53: ( 0 0 3 (
	@Test
	public void testCase53() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(003(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 54: ( 0 0 3 )
	@Test
	public void testCase54() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(003)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 55: ( 0 0 3 0 0 7 )
	@Test
	public void testCase55() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(003007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 56: ( 0 0 3 0 7 )
	@Test
	public void testCase56() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00307)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 57: ( 0 0 3 7 )
	@Test
	public void testCase57() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0037)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 58: ( 0 0 4 (
	@Test
	public void testCase58() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(004(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 59: ( 0 0 4 )
	@Test
	public void testCase59() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(004)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 60: ( 0 0 4 0 0 7 )
	@Test
	public void testCase60() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(004007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 61: ( 0 0 4 0 7 )
	@Test
	public void testCase61() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00407)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 62: ( 0 0 4 7 )
	@Test
	public void testCase62() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0047)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 63: ( 0 0 5 (
	@Test
	public void testCase63() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(005(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 64: ( 0 0 5 )
	@Test
	public void testCase64() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(005)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 65: ( 0 0 5 0 0 7 )
	@Test
	public void testCase65() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(005007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 66: ( 0 0 5 0 7 )
	@Test
	public void testCase66() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00507)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 67: ( 0 0 5 7 )
	@Test
	public void testCase67() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0057)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 68: ( 0 0 6 (
	@Test
	public void testCase68() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(006(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 69: ( 0 0 6 )
	@Test
	public void testCase69() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(006)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 70: ( 0 0 6 0 0 7 )
	@Test
	public void testCase70() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(006007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 71: ( 0 0 6 0 7 )
	@Test
	public void testCase71() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00607)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 72: ( 0 0 6 7 )
	@Test
	public void testCase72() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0067)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 73: ( 0 0 7 (
	@Test
	public void testCase73() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 74: ( 0 0 7 ( (
	@Test
	public void testCase74() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007((");
		assertFalse(result);
	}

	//Generated JUnit test for test case 75: ( 0 0 7 ( )
	@Test
	public void testCase75() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007()");
		assertTrue(result);
	}

	//Generated JUnit test for test case 76: ( 0 0 7 ( 0 0 7 )
	@Test
	public void testCase76() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007(007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 77: ( 0 0 7 ( 0 7 )
	@Test
	public void testCase77() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007(07)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 78: ( 0 0 7 ( 7 )
	@Test
	public void testCase78() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007(7)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 79: ( 0 0 7 )
	@Test
	public void testCase79() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 80: ( 0 0 7 ) (
	@Test
	public void testCase80() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 81: ( 0 0 7 ) ( (
	@Test
	public void testCase81() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)((");
		assertTrue(result);
	}

	//Generated JUnit test for test case 82: ( 0 0 7 ) ( )
	@Test
	public void testCase82() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)()");
		assertTrue(result);
	}

	//Generated JUnit test for test case 83: ( 0 0 7 ) ( 0 0 7 )
	@Test
	public void testCase83() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)(007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 84: ( 0 0 7 ) ( 0 7 )
	@Test
	public void testCase84() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)(07)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 85: ( 0 0 7 ) ( 7 )
	@Test
	public void testCase85() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)(7)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 86: ( 0 0 7 ) )
	@Test
	public void testCase86() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007))");
		assertTrue(result);
	}

	//Generated JUnit test for test case 87: ( 0 0 7 ) ) (
	@Test
	public void testCase87() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007))(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 88: ( 0 0 7 ) ) )
	@Test
	public void testCase88() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)))");
		assertTrue(result);
	}

	//Generated JUnit test for test case 89: ( 0 0 7 ) ) 0 0 7 )
	@Test
	public void testCase89() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007))007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 90: ( 0 0 7 ) ) 0 7 )
	@Test
	public void testCase90() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007))07)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 91: ( 0 0 7 ) ) 7 )
	@Test
	public void testCase91() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007))7)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 92: ( 0 0 7 ) 0 (
	@Test
	public void testCase92() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)0(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 93: ( 0 0 7 ) 0 )
	@Test
	public void testCase93() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)0)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 94: ( 0 0 7 ) 0 0 0 7 )
	@Test
	public void testCase94() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)0007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 95: ( 0 0 7 ) 0 0 7 )
	@Test
	public void testCase95() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 96: ( 0 0 7 ) 0 7 )
	@Test
	public void testCase96() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)07)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 97: ( 0 0 7 ) 1 (
	@Test
	public void testCase97() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)1(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 98: ( 0 0 7 ) 1 )
	@Test
	public void testCase98() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)1)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 99: ( 0 0 7 ) 1 0 0 7 )
	@Test
	public void testCase99() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)1007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 100: ( 0 0 7 ) 1 0 7 )
	@Test
	public void testCase100() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)107)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 101: ( 0 0 7 ) 1 7 )
	@Test
	public void testCase101() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)17)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 102: ( 0 0 7 ) 2 (
	@Test
	public void testCase102() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)2(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 103: ( 0 0 7 ) 2 )
	@Test
	public void testCase103() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)2)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 104: ( 0 0 7 ) 2 0 0 7 )
	@Test
	public void testCase104() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)2007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 105: ( 0 0 7 ) 2 0 7 )
	@Test
	public void testCase105() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)207)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 106: ( 0 0 7 ) 2 7 )
	@Test
	public void testCase106() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)27)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 107: ( 0 0 7 ) 3 (
	@Test
	public void testCase107() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)3(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 108: ( 0 0 7 ) 3 )
	@Test
	public void testCase108() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)3)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 109: ( 0 0 7 ) 3 0 0 7 )
	@Test
	public void testCase109() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)3007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 110: ( 0 0 7 ) 3 0 7 )
	@Test
	public void testCase110() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)307)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 111: ( 0 0 7 ) 3 7 )
	@Test
	public void testCase111() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)37)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 112: ( 0 0 7 ) 4 (
	@Test
	public void testCase112() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)4(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 113: ( 0 0 7 ) 4 )
	@Test
	public void testCase113() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)4)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 114: ( 0 0 7 ) 4 0 0 7 )
	@Test
	public void testCase114() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)4007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 115: ( 0 0 7 ) 4 0 7 )
	@Test
	public void testCase115() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)407)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 116: ( 0 0 7 ) 4 7 )
	@Test
	public void testCase116() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)47)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 117: ( 0 0 7 ) 5 (
	@Test
	public void testCase117() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)5(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 118: ( 0 0 7 ) 5 )
	@Test
	public void testCase118() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)5)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 119: ( 0 0 7 ) 5 0 0 7 )
	@Test
	public void testCase119() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)5007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 120: ( 0 0 7 ) 5 0 7 )
	@Test
	public void testCase120() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)507)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 121: ( 0 0 7 ) 5 7 )
	@Test
	public void testCase121() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)57)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 122: ( 0 0 7 ) 6 (
	@Test
	public void testCase122() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)6(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 123: ( 0 0 7 ) 6 )
	@Test
	public void testCase123() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)6)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 124: ( 0 0 7 ) 6 0 0 7 )
	@Test
	public void testCase124() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)6007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 125: ( 0 0 7 ) 6 0 7 )
	@Test
	public void testCase125() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)607)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 126: ( 0 0 7 ) 6 7 )
	@Test
	public void testCase126() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)67)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 127: ( 0 0 7 ) 7 (
	@Test
	public void testCase127() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)7(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 128: ( 0 0 7 ) 7 )
	@Test
	public void testCase128() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)7)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 129: ( 0 0 7 ) 7 0 0 7 )
	@Test
	public void testCase129() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)7007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 130: ( 0 0 7 ) 7 0 7 )
	@Test
	public void testCase130() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)707)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 131: ( 0 0 7 ) 7 7 )
	@Test
	public void testCase131() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)77)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 132: ( 0 0 7 ) 8 (
	@Test
	public void testCase132() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)8(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 133: ( 0 0 7 ) 8 )
	@Test
	public void testCase133() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)8)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 134: ( 0 0 7 ) 8 0 0 7 )
	@Test
	public void testCase134() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)8007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 135: ( 0 0 7 ) 8 0 7 )
	@Test
	public void testCase135() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)807)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 136: ( 0 0 7 ) 8 7 )
	@Test
	public void testCase136() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)87)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 137: ( 0 0 7 ) 9 (
	@Test
	public void testCase137() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)9(");
		assertTrue(result);
	}

	//Generated JUnit test for test case 138: ( 0 0 7 ) 9 )
	@Test
	public void testCase138() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)9)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 139: ( 0 0 7 ) 9 0 0 7 )
	@Test
	public void testCase139() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)9007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 140: ( 0 0 7 ) 9 0 7 )
	@Test
	public void testCase140() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)907)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 141: ( 0 0 7 ) 9 7 )
	@Test
	public void testCase141() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007)97)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 142: ( 0 0 7 0 (
	@Test
	public void testCase142() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0070(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 143: ( 0 0 7 0 )
	@Test
	public void testCase143() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0070)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 144: ( 0 0 7 0 0 0 7 )
	@Test
	public void testCase144() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0070007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 145: ( 0 0 7 0 0 7 )
	@Test
	public void testCase145() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 146: ( 0 0 7 0 7 )
	@Test
	public void testCase146() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00707)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 147: ( 0 0 7 1 (
	@Test
	public void testCase147() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0071(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 148: ( 0 0 7 1 )
	@Test
	public void testCase148() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0071)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 149: ( 0 0 7 1 0 0 7 )
	@Test
	public void testCase149() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0071007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 150: ( 0 0 7 1 0 7 )
	@Test
	public void testCase150() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007107)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 151: ( 0 0 7 1 7 )
	@Test
	public void testCase151() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00717)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 152: ( 0 0 7 2 (
	@Test
	public void testCase152() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0072(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 153: ( 0 0 7 2 )
	@Test
	public void testCase153() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0072)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 154: ( 0 0 7 2 0 0 7 )
	@Test
	public void testCase154() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0072007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 155: ( 0 0 7 2 0 7 )
	@Test
	public void testCase155() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007207)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 156: ( 0 0 7 2 7 )
	@Test
	public void testCase156() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00727)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 157: ( 0 0 7 3 (
	@Test
	public void testCase157() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0073(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 158: ( 0 0 7 3 )
	@Test
	public void testCase158() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0073)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 159: ( 0 0 7 3 0 0 7 )
	@Test
	public void testCase159() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0073007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 160: ( 0 0 7 3 0 7 )
	@Test
	public void testCase160() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007307)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 161: ( 0 0 7 3 7 )
	@Test
	public void testCase161() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00737)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 162: ( 0 0 7 5 (
	@Test
	public void testCase162() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0075(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 163: ( 0 0 7 5 )
	@Test
	public void testCase163() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0075)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 164: ( 0 0 7 5 0 0 7 )
	@Test
	public void testCase164() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0075007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 165: ( 0 0 7 5 0 7 )
	@Test
	public void testCase165() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007507)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 166: ( 0 0 7 5 7 )
	@Test
	public void testCase166() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00757)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 167: ( 0 0 7 6 (
	@Test
	public void testCase167() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0076(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 168: ( 0 0 7 6 )
	@Test
	public void testCase168() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0076)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 169: ( 0 0 7 6 0 0 7 )
	@Test
	public void testCase169() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0076007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 170: ( 0 0 7 6 0 7 )
	@Test
	public void testCase170() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007607)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 171: ( 0 0 7 6 7 )
	@Test
	public void testCase171() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00767)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 172: ( 0 0 7 7 (
	@Test
	public void testCase172() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0077(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 173: ( 0 0 7 7 )
	@Test
	public void testCase173() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0077)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 174: ( 0 0 7 7 0 0 7 )
	@Test
	public void testCase174() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0077007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 175: ( 0 0 7 7 0 7 )
	@Test
	public void testCase175() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007707)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 176: ( 0 0 7 7 7 )
	@Test
	public void testCase176() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00777)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 177: ( 0 0 7 8 (
	@Test
	public void testCase177() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0078(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 178: ( 0 0 7 8 )
	@Test
	public void testCase178() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0078)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 179: ( 0 0 7 8 0 0 7 )
	@Test
	public void testCase179() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0078007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 180: ( 0 0 7 8 0 7 )
	@Test
	public void testCase180() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007807)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 181: ( 0 0 7 8 7 )
	@Test
	public void testCase181() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00787)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 182: ( 0 0 7 9 (
	@Test
	public void testCase182() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0079(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 183: ( 0 0 7 9 )
	@Test
	public void testCase183() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0079)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 184: ( 0 0 7 9 0 0 7 )
	@Test
	public void testCase184() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0079007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 185: ( 0 0 7 9 0 7 )
	@Test
	public void testCase185() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(007907)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 186: ( 0 0 7 9 7 )
	@Test
	public void testCase186() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00797)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 187: ( 0 0 8 (
	@Test
	public void testCase187() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(008(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 188: ( 0 0 8 )
	@Test
	public void testCase188() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(008)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 189: ( 0 0 8 0 0 7 )
	@Test
	public void testCase189() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(008007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 190: ( 0 0 8 0 7 )
	@Test
	public void testCase190() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00807)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 191: ( 0 0 8 7 )
	@Test
	public void testCase191() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0087)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 192: ( 0 0 9 (
	@Test
	public void testCase192() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(009(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 193: ( 0 0 9 )
	@Test
	public void testCase193() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(009)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 194: ( 0 0 9 0 0 7 )
	@Test
	public void testCase194() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(009007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 195: ( 0 0 9 0 7 )
	@Test
	public void testCase195() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(00907)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 196: ( 0 0 9 7 )
	@Test
	public void testCase196() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0097)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 197: ( 0 1 (
	@Test
	public void testCase197() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(01(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 198: ( 0 1 )
	@Test
	public void testCase198() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(01)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 199: ( 0 1 0 0 7 )
	@Test
	public void testCase199() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(01007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 200: ( 0 1 0 7 )
	@Test
	public void testCase200() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0107)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 201: ( 0 1 7 )
	@Test
	public void testCase201() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(017)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 202: ( 0 2 (
	@Test
	public void testCase202() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(02(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 203: ( 0 2 )
	@Test
	public void testCase203() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(02)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 204: ( 0 2 0 0 7 )
	@Test
	public void testCase204() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(02007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 205: ( 0 2 0 7 )
	@Test
	public void testCase205() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0207)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 206: ( 0 2 7 )
	@Test
	public void testCase206() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(027)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 207: ( 0 3 (
	@Test
	public void testCase207() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(03(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 208: ( 0 3 )
	@Test
	public void testCase208() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(03)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 209: ( 0 3 0 0 7 )
	@Test
	public void testCase209() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(03007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 210: ( 0 3 0 7 )
	@Test
	public void testCase210() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0307)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 211: ( 0 3 7 )
	@Test
	public void testCase211() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(037)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 212: ( 0 4 (
	@Test
	public void testCase212() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(04(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 213: ( 0 4 )
	@Test
	public void testCase213() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(04)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 214: ( 0 4 0 0 7 )
	@Test
	public void testCase214() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(04007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 215: ( 0 4 0 7 )
	@Test
	public void testCase215() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0407)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 216: ( 0 4 7 )
	@Test
	public void testCase216() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(047)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 217: ( 0 5 (
	@Test
	public void testCase217() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(05(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 218: ( 0 5 )
	@Test
	public void testCase218() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(05)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 219: ( 0 5 0 0 7 )
	@Test
	public void testCase219() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(05007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 220: ( 0 5 0 7 )
	@Test
	public void testCase220() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0507)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 221: ( 0 5 7 )
	@Test
	public void testCase221() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(057)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 222: ( 0 6 (
	@Test
	public void testCase222() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(06(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 223: ( 0 6 )
	@Test
	public void testCase223() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(06)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 224: ( 0 6 0 0 7 )
	@Test
	public void testCase224() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(06007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 225: ( 0 6 0 7 )
	@Test
	public void testCase225() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0607)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 226: ( 0 6 7 )
	@Test
	public void testCase226() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(067)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 227: ( 0 7 (
	@Test
	public void testCase227() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(07(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 228: ( 0 7 )
	@Test
	public void testCase228() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 229: ( 0 7 0 0 7 )
	@Test
	public void testCase229() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(07007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 230: ( 0 7 0 7 )
	@Test
	public void testCase230() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0707)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 231: ( 0 7 7 )
	@Test
	public void testCase231() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(077)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 232: ( 0 8 (
	@Test
	public void testCase232() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(08(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 233: ( 0 8 )
	@Test
	public void testCase233() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(08)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 234: ( 0 8 0 0 7 )
	@Test
	public void testCase234() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(08007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 235: ( 0 8 0 7 )
	@Test
	public void testCase235() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0807)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 236: ( 0 8 7 )
	@Test
	public void testCase236() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(087)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 237: ( 0 9 (
	@Test
	public void testCase237() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(09(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 238: ( 0 9 )
	@Test
	public void testCase238() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(09)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 239: ( 0 9 0 0 7 )
	@Test
	public void testCase239() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(09007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 240: ( 0 9 0 7 )
	@Test
	public void testCase240() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(0907)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 241: ( 0 9 7 )
	@Test
	public void testCase241() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(097)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 242: ( 1 (
	@Test
	public void testCase242() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(1(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 243: ( 1 )
	@Test
	public void testCase243() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(1)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 244: ( 1 0 0 7 )
	@Test
	public void testCase244() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(1007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 245: ( 1 0 7 )
	@Test
	public void testCase245() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(107)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 246: ( 1 7 )
	@Test
	public void testCase246() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(17)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 247: ( 2 (
	@Test
	public void testCase247() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(2(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 248: ( 2 )
	@Test
	public void testCase248() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(2)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 249: ( 2 0 0 7 )
	@Test
	public void testCase249() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(2007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 250: ( 2 0 7 )
	@Test
	public void testCase250() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(207)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 251: ( 2 7 )
	@Test
	public void testCase251() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(27)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 252: ( 3 (
	@Test
	public void testCase252() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(3(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 253: ( 3 )
	@Test
	public void testCase253() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(3)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 254: ( 3 0 0 7 )
	@Test
	public void testCase254() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(3007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 255: ( 3 0 7 )
	@Test
	public void testCase255() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(307)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 256: ( 3 7 )
	@Test
	public void testCase256() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(37)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 257: ( 4 (
	@Test
	public void testCase257() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(4(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 258: ( 4 )
	@Test
	public void testCase258() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(4)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 259: ( 4 0 0 7 )
	@Test
	public void testCase259() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(4007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 260: ( 4 0 7 )
	@Test
	public void testCase260() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(407)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 261: ( 4 7 )
	@Test
	public void testCase261() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(47)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 262: ( 5 (
	@Test
	public void testCase262() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(5(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 263: ( 5 )
	@Test
	public void testCase263() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(5)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 264: ( 5 0 0 7 )
	@Test
	public void testCase264() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(5007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 265: ( 5 0 7 )
	@Test
	public void testCase265() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(507)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 266: ( 5 7 )
	@Test
	public void testCase266() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(57)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 267: ( 6 (
	@Test
	public void testCase267() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(6(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 268: ( 6 )
	@Test
	public void testCase268() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(6)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 269: ( 6 0 0 7 )
	@Test
	public void testCase269() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(6007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 270: ( 6 0 7 )
	@Test
	public void testCase270() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(607)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 271: ( 6 7 )
	@Test
	public void testCase271() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(67)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 272: ( 7 (
	@Test
	public void testCase272() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(7(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 273: ( 7 )
	@Test
	public void testCase273() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 274: ( 7 0 0 7 )
	@Test
	public void testCase274() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(7007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 275: ( 7 0 7 )
	@Test
	public void testCase275() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(707)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 276: ( 7 7 )
	@Test
	public void testCase276() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(77)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 277: ( 8 (
	@Test
	public void testCase277() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(8(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 278: ( 8 )
	@Test
	public void testCase278() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(8)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 279: ( 8 0 0 7 )
	@Test
	public void testCase279() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(8007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 280: ( 8 0 7 )
	@Test
	public void testCase280() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(807)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 281: ( 8 7 )
	@Test
	public void testCase281() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(87)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 282: ( 9 (
	@Test
	public void testCase282() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(9(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 283: ( 9 )
	@Test
	public void testCase283() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(9)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 284: ( 9 0 0 7 )
	@Test
	public void testCase284() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(9007)");
		assertTrue(result);
	}

	//Generated JUnit test for test case 285: ( 9 0 7 )
	@Test
	public void testCase285() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(907)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 286: ( 9 7 )
	@Test
	public void testCase286() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("(97)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 287: )
	@Test
	public void testCase287() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex(")");
		assertFalse(result);
	}

	//Generated JUnit test for test case 288: ) (
	@Test
	public void testCase288() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex(")(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 289: ) )
	@Test
	public void testCase289() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("))");
		assertFalse(result);
	}

	//Generated JUnit test for test case 290: ) 0 0 7 )
	@Test
	public void testCase290() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex(")007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 291: ) 0 7 )
	@Test
	public void testCase291() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex(")07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 292: ) 7 )
	@Test
	public void testCase292() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex(")7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 293: 0 (
	@Test
	public void testCase293() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("0(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 294: 0 )
	@Test
	public void testCase294() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("0)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 295: 0 0 0 7 )
	@Test
	public void testCase295() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("0007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 296: 0 0 7 )
	@Test
	public void testCase296() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 297: 0 7 )
	@Test
	public void testCase297() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("07)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 298: 1 (
	@Test
	public void testCase298() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("1(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 299: 1 )
	@Test
	public void testCase299() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("1)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 300: 1 0 0 7 )
	@Test
	public void testCase300() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("1007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 301: 1 0 7 )
	@Test
	public void testCase301() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("107)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 302: 1 7 )
	@Test
	public void testCase302() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("17)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 303: 2 (
	@Test
	public void testCase303() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("2(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 304: 2 )
	@Test
	public void testCase304() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("2)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 305: 2 0 0 7 )
	@Test
	public void testCase305() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("2007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 306: 2 0 7 )
	@Test
	public void testCase306() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("207)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 307: 2 7 )
	@Test
	public void testCase307() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("27)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 308: 3 (
	@Test
	public void testCase308() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("3(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 309: 3 )
	@Test
	public void testCase309() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("3)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 310: 3 0 0 7 )
	@Test
	public void testCase310() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("3007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 311: 3 0 7 )
	@Test
	public void testCase311() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("307)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 312: 3 7 )
	@Test
	public void testCase312() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("37)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 313: 4 (
	@Test
	public void testCase313() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("4(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 314: 4 )
	@Test
	public void testCase314() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("4)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 315: 4 0 0 7 )
	@Test
	public void testCase315() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("4007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 316: 4 0 7 )
	@Test
	public void testCase316() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("407)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 317: 4 7 )
	@Test
	public void testCase317() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("47)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 318: 5 (
	@Test
	public void testCase318() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("5(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 319: 5 )
	@Test
	public void testCase319() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("5)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 320: 5 0 0 7 )
	@Test
	public void testCase320() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("5007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 321: 5 0 7 )
	@Test
	public void testCase321() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("507)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 322: 5 7 )
	@Test
	public void testCase322() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("57)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 323: 6 (
	@Test
	public void testCase323() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("6(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 324: 6 )
	@Test
	public void testCase324() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("6)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 325: 6 0 0 7 )
	@Test
	public void testCase325() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("6007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 326: 6 0 7 )
	@Test
	public void testCase326() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("607)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 327: 6 7 )
	@Test
	public void testCase327() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("67)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 328: 7 (
	@Test
	public void testCase328() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("7(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 329: 7 )
	@Test
	public void testCase329() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("7)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 330: 7 0 0 7 )
	@Test
	public void testCase330() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("7007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 331: 7 0 7 )
	@Test
	public void testCase331() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("707)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 332: 7 7 )
	@Test
	public void testCase332() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("77)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 333: 8 (
	@Test
	public void testCase333() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("8(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 334: 8 )
	@Test
	public void testCase334() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("8)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 335: 8 0 0 7 )
	@Test
	public void testCase335() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("8007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 336: 8 0 7 )
	@Test
	public void testCase336() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("807)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 337: 8 7 )
	@Test
	public void testCase337() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("87)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 338: 9 (
	@Test
	public void testCase338() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("9(");
		assertFalse(result);
	}

	//Generated JUnit test for test case 339: 9 )
	@Test
	public void testCase339() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("9)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 340: 9 0 0 7 )
	@Test
	public void testCase340() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("9007)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 341: 9 0 7 )
	@Test
	public void testCase341() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("907)");
		assertFalse(result);
	}

	//Generated JUnit test for test case 342: 9 7 )
	@Test
	public void testCase342() throws Exception{
		JamesBond fixture = new JamesBond();
		Boolean result = fixture.bondRegex("97)");
		assertFalse(result);
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}
	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JamesBond.class);
	}
}
