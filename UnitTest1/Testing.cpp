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
		TEST_METHOD(tuples5) {
			//Scenario: Adding two tuples
			tuple a1(3, -2, 5, 1);
			tuple a2(-2, 3, 1, 0);
			Assert::IsTrue(a1 + a2 == tuple(1, 1, 6, 1));
		}
		TEST_METHOD(tuples6) {
			//Scenario: Substracting two points
			point p1(3, 2, 1);
			point p2(5, 6, 7);

			Assert::IsTrue(p1 - p2 == vector(-2, -4, -6));
		}
		TEST_METHOD(tuples7) {
			//Scenario: Subtracting two vectors
			vector v1(3, 2, 1);
			vector v2(5, 6, 7);

			Assert::IsTrue(v1 - v2 == vector(-2, -4, -6));
		}
		TEST_METHOD(tuples8) {
			//Scenario: Substracting a vector from the zero vector
			vector zero(0, 0, 0);
			vector v(1, -2, 3);

			Assert::IsTrue(zero - v == vector(-1, 2, -3));
		}
		TEST_METHOD(tuples9) {
			//Scenario: Negating a tuple
			tuple a(1, -2, 3, -4);

			Assert::IsTrue(-a == tuple(-1, 2, -3, 4));
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
