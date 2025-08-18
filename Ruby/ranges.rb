inclusive_nums = 1..5
exclusive_nums = 1...5

puts inclusive_nums.class
puts exclusive_nums.class

puts inclusive_nums.first
puts exclusive_nums.first

puts inclusive_nums.last
puts exclusive_nums.last

p inclusive_nums.last(5)
p exclusive_nums.last(5)

p inclusive_nums.first(5)
p exclusive_nums.first(5)

puts 

p (2...10).last

puts

alphabet = "A".."z"
p alphabet.first(58)

puts
alphabet = "a".."z"

puts alphabet.include?("i")
puts alphabet.member?("i")

puts 

p alphabet === "i"