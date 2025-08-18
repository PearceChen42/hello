colors = ["Red","Blue","Green","Yellow"]

colors.each_with_index { |color, index| puts "The Value of index position #{index} is #{color}" }

[5,10,15].each_with_index do |number,index|
    p "The numberis #{number} and index is #{index}"
end
