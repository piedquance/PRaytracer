#include "pch.h"
#include "../Pragmatic Raytracer/Pragmatic Raytracer.cpp"

TEST(TestCaseName, TestName) {
  EXPECT_EQ(1, 1);
  EXPECT_TRUE(true);

  tuple a(4.3, -4.2, 3.1, 1.0);

  EXPECT_EQ(a.x, 4.3);
  EXPECT_EQ(a.y, -4.2);
  EXPECT_EQ(a.z, 3.1);
  EXPECT_EQ(a.w, 0.0);

}