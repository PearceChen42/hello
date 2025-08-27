module Announceable
    def who_am_i
            "The name of this class is #{self}"
    end
end

class Dog
    extend Announceable

end

class Cat
    extend Announceable

end

puts Dog.who_am_i
puts Cat.who_am_i

Watson = Dog.new
# p Watson.who_am_i #Not in instance