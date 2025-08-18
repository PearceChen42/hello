def long_word(text)
    text.length > 7
end

p long_word("Ruby")
p long_word("magnificent")

puts

def first_longer_than_second(first,second)
    first.length > second.length
end

puts first_longer_than_second("Python","Ruby")