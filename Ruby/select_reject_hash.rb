recipe = { sugar: 3, flour: 10, slt:1, pepper: 8}

p recipe.select { |ingredient, teaspoons| teaspoons >= 5 }
p recipe.select {| ingredient, teaspoons| ingredient.length == 5 }
puts
p recipe.reject { |ingredient, teaspoons| teaspoons >= 5 }
p recipe.reject {| ingredient, teaspoons| ingredient.length == 5 }

