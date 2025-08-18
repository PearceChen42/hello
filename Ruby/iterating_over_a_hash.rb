salarles = { director: 1000, producer: 2000, ceo: 3000 }

salarles.each { |position, salarle| puts "The #{position} earns #{salarle}" }
puts

salarles.each_key { |position| puts " The next position is #{position}"}

p salarles.keys
p salarles.values

cars = { toyota: "Camry", chevrolet: "Aveo", ford: "F150", kia: "Soul"}
p cars.include?(:toyota)
p cars.include?("Camry")

p cars.key?(:toyota)
p cars.has_key?("Camry")
puts
p cars.has_value?("Camry")