def divisible_by_three_and_four(number)
    divisible_by_three = number % 3 ==0
    divisible_by_four = number %4 ==0
    divisible_by_four && divisible_by_three
end

p divisible_by_three_and_four(3)
p divisible_by_three_and_four(12)

def string_theory(text)
    text.length > 4 || text.include?("B")

end

p string_theory("Big Mac")
p string_theory("Bank")
p string_theory("refrigerator")