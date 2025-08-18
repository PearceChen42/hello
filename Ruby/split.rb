sentences = "Hi, my name is Boris, My favorite hobby is coding!"

p sentences.split
p sentences.split(" ")
p sentences.split(",")
sentences.split(" ").each { |word| puts "Currently, I'm on the word #{word}" }
