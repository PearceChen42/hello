#OR
# ||
entree = "Steak"
price = 19.99

food_is_delicuious = entree == "Steak"
meal_is_affordable = price < 29.99

if food_is_delicuious || meal_is_affordable || false
    puts "At least one of the conditions is true,purchasing meal"
end