def custom_each(elements)
    i = 0

    while i <elements.length
            yield(elements[i])
            i += 1
    end
end

custom_each( [10,20,30] ) { |number| puts "The square of #{number} is #{number*number}" }