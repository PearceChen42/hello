def same_first_and_last_letter(text)
    text[0] == text[-1]
end

p same_first_and_last_letter("Hello")

def three_number_sum(text)
    text[0].to_i + text[1].to_i + text[2].to_i

end

p three_number_sum("a12")