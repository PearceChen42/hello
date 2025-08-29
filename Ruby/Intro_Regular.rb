phrase = "The Ruby Programing Language is amazing!"


p phrase.include?("Pro")
p phrase.start_with?("The")
p phrase.end_with?("zing")

puts 

p /T/.class
p phrase =~ /T/
p /P/ =~ phrase
p /R/ =~ phrase
p /!/ =~ phrase