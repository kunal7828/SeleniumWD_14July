package testNGExamples;



class JunitExample18 {

//	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
	}

//	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll");
	}

//	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
	}

//	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach");
	}

//	@Test
	void test1() {
		System.out.println("@Test1");
	}

	
	//@Test
	void test2() {
		System.out.println("@Test2");
	}
}
