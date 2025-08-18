vehicle = "Spaceship"
characters = vehicle.split("")
p characters

characters = vehicle.chars
p characters
puts

vehicle.each_char { |character| p "#{character} is awesome" }
