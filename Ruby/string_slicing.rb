def first_three_characters(text)
    text.slice(0,3)

    text
end

p first_three_characters("dynasty")

def five_from_the_end(text)
    text.slice(-5,5)
end

puts five_from_the_end("dynasty")