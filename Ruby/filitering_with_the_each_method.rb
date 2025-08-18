fives = [5,10,15,20,25,30,35,40]
evens = []
# fives.each do |value|
#     if value.even?
#         puts value
#     end
# end
fives.each do |number|
    if number.even?
        evens << number 
    end
end

p fives
p evens