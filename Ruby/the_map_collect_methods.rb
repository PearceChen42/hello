birds = ["eagle","sparrow","pigeon","hawk","penguin"]


# lengths = []

# birds.each { |bird| lengths << bird.length}
# p lengths

# map/collect create new arry and reutn value 
lengths = birds.map { |bird| bird.length }
p lengths

lengths = birds.collect { |bird| bird.length}
p lengths

p birds.map {|bird| bird.upcase}