# next - move automatically to the next iteration of a loop
#break - terminate the loop
money_sentece = "I love $ in the morning , $ in the afternoon, and $ at night!"

current_index = 0
final_index = money_sentece.length - 1 # 40
first_money_index = nil

# while current_index <= final_index

#     if money_sentece[current_index] == "$"
#         puts "Found $ at index #{current_index}"
#     end

#     current_index += 1
# end


# while current_index <= final_index

#     if money_sentece[current_index] != "$"
#         current_index += 1
#         next
#     end
#     puts "Found $ at index #{current_index}"
#     current_index += 1
# end


while current_index <= final_index

    if money_sentece[current_index] == "$"
        first_money_index = current_index
        puts "Found $ at index #{current_index}" 
        break 
    end
    
    current_index += 1
end

puts first_money_index