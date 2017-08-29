import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame g;
	
	@Before
	public void setup() {
		g = new BowlingGame();
	}
	
	@Test
	public void shouldScoreGutterGame() {
		int numberOfTimes = 20;
		int pins = 0;
		for(int i = pins; i < numberOfTimes; i++) {
			g.roll(pins);
		}
		
		assertEquals("should be zero score", pins, g.score);
	}
	
	private void rollMany(int numberOfTimes, int pins) {
		for(int i = 0; i < numberOfTimes; i++) {
			g.roll(pins);
		}
	}

	@Test
	public void shouldScoreOneSpare() {
		g.roll(5);
		g.roll(5);
		g.roll(3);
		rollMany(17,0);
		
		int score = g.score();
		assertThat(score, is(16));
	}

	private Matcher is(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
