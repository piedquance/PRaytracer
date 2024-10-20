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

			tuple a(4.3, -4.2, 3.1, 1.0);

			Assert::AreEqual(a.x, 4.3f);
			Assert::AreEqual(a.y, -4.2f);
			Assert::AreEqual(a.z, 3.1f);
			Assert::AreEqual(a.w, 1.0f);

			tuple b(4.3, -4.2, 3.1, 0.0);
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
