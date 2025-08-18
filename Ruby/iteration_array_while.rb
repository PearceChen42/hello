animals = ["Lion","Zebra","Baboon","Cheetah"]

i = 0

while i < animals.length #0< 4
    puts "The index is #{i} and the animal is #{animals[i]}"
    i +=1
end
puts 

i = 0

until i == animals.length # 0== 4
   puts "The index is #{i} and the animal is #{animals[i]}" 
   i += 1
end