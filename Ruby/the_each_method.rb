3.times { |loop_number| p " I am currently iterating on loop number #{loop_number}"}

4.times do |number|
    square = number * number
    puts "The current number is #{number} and its square #{square}"
end

puts

names = ["bro","moe","joe"]
names.each { |name| p name.upcase }

[1,2,3,4,5].each do |current_number|
    calculation = current_number * current_number
    p "The square of #{current_number} is #{calculation}"
end
=begin

=end