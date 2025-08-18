def calculate_test_grade(grade)
    case grade

    when 90..100
        "A"
    when 80..89
        "B"
    when 70..79
        "C"
    when 60..69 then "D"
    else
        if grade.class == Integer
            return "F" 
        else
            return "Error Value"
        end
    end 
end

puts calculate_test_grade(90)
puts calculate_test_grade(80)
puts calculate_test_grade(76)
puts calculate_test_grade(62)
puts calculate_test_grade(54)
p catculate_test_grade("Hello World!")