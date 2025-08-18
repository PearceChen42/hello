def numeric_energy(number)
    if number > 0
        "Positive"
    elsif number < 0
        "Negative"        
    else
        "Zero Hero"
    end
end


p numeric_energy(5)
p numeric_energy(10)

p numeric_energy(-10)