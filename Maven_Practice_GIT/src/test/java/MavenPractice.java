import org.testng.annotations.Test;

public class MavenPractice {
		@Test(groups="smoke")
		public void delete() {
			System.out.println("Deleted");
		}
		@Test
		public void deleted() {
			System.out.println("Successfully deleted");
		}

	}


