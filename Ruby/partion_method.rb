foods = ["Steak","Vegetables","Steak Burger","Tofu","Tuna Steaks"]

# good_foods = foods.select { |food| food.include?("Steak")}
# bad_foods = foods.reject { |food| food.include? ("Steak")}

# p good_foods
# p bad_foods


good_foods, bad_foods = foods.partition { |food|  food.include?("Steak")}
p good_foods
p bad_foods