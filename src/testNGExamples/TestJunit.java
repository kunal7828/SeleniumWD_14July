package testNGExamples;

import static org.testng.Assert.fail;


import org.testng.annotations.Test;

class TestJunit {

//	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

//	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

//	@BeforeEach
	void setUp() throws Exception {
	}

//	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
