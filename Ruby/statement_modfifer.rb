number = 10000
verified = true

if number > 5000
    puts "That's a huge number!"
end

puts "That's a huge number!" if number > 5000 && verified

another_number = 0

unless another_number > 10 
    puts "Not greater than 10"
end

 puts "Not greater than 10" unless another_number>10