def even_or_odd_operations(number)
    if number.even?
      return  number + 2
    end
    number - 3
    
end

puts even_or_odd_operations(2)
puts even_or_odd_operations(13)
