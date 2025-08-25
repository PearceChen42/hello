p ARGV.class
ARGV.each { |argument| puts argument}
ARGV.each do |argument|
    square = argument.to_i ** 2
    puts "The square of #{argument} is #{square}"
end