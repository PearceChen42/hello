p "hello".class

class String
    def count_vowels
            self.downcase.count("aeiou")
    end
end

p "Hello".count_vowels

puts
p [1].class
class Array
  def sorted?
        self == self.sort
  end
end

p [1,2,3].sorted?
p [1,3,2].sorted?