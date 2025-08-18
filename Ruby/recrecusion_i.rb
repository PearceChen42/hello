# recuresion is when a method calls itself
# base case - condition that tells the recursion to stop
# factorials
#5! = 5 *4 *3 *2 *1 =120

def something
    puts "Here"
end

def facotrial(number)
    if number == 1
        return 1
    end
    number * facotrial(number-1)
end

puts facotrial(5)