#include "pch.h"
#include "CppUnitTest.h"
#include "../Pragmatic Raytracer/Pragmatic Raytracer.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace Testing
{
	TEST_CLASS(tuples)
	{
	public:
		
		TEST_METHOD(tuples1)
		{

			//Scenario: A tuple with w = 1.0 is a point
			tuple a(4.3, -4.2, 3.1, 1.0);

			Assert::AreEqual(a.x, 4.3f);
			Assert::AreEqual(a.y, -4.2f);
			Assert::AreEqual(a.z, 3.1f);
			Assert::AreEqual(a.w, 1.0f);
	
		}
		TEST_METHOD(tuples2)
		{
			//Scenario: A tuple with w=0 is a vector
			tuple a(4.3, -4.2, 3.1, 0.0);

			Assert::AreEqual(a.x, 4.3f);
			Assert::AreEqual(a.y, -4.2f);
			Assert::AreEqual(a.z, 3.1f);
			Assert::AreEqual(a.w, 0.0f);
		}

		TEST_METHOD(tuples3) {
			//Scenario: point() creates tuples with w=1
			point p(4, -4, 3);
			Assert::AreEqual(p == tuple(4, -4, 3, 1), true);
		}

		TEST_METHOD(tuples4) {
			//Scenario: vector() creates tuples with w=0
			vector v(4, -4, 3);
			Assert::AreEqual(v == tuple(4, -4, 3, 0), true);
		}
	};

	TEST_CLASS(Testing2)
	{
	public:

		TEST_METHOD(T21)
		{
			Assert::AreEqual(1.0f, 1.0f);
		}

		TEST_METHOD(T22)
		{
			Assert::AreEqual(1.0f, 1.0f);
		}
	};
}
