require "date"

puts Date.new
puts Date.new(1991,4,30)

birthday = Date.new(1991,4,12)
p birthday
p birthday.class
p birthday.year
p birthday.month

p birthday.monday?