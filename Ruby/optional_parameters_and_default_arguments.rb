def title_assigner(name,suffix = "the Great")

    "#{name} #{suffix}"

end

puts title_assigner("Boris","asd")
puts title_assigner "Dave"

def calculate_meal_cost(amount, tip_percentage = 0.25)
    amount + (amount * tip_percentage)
end

p calculate_meal_cost(20,0.05)
p calculate_meal_cost 20
p calculate_meal_cost 100,0.12

def string_adder(a = "",b = "")
    "#{a} #{b}"
end

p string_adder "Hello","World"
p string_adder
