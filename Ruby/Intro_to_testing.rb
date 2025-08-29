require "minitest/autorun"

def sum(a,b)
  a + b
end

class TestMathematics < Minitest::Test
  def test_sum_method
      assert_equal(5,sum(2,3))
  end
  def test_sum_method_two
      assert_equal(7,sum(4,3))
  end
  def test_sum_method_third
      assert_equal(8,sum(4,3))
  end
end