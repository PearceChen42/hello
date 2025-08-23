class Employee
  attr_reader :name
  attr_accessor :age
    def initialize(name,age)
            @name = name
            @age = age
    end

    def introduce
            "Hi, my name is #{name} and I am #{age} years old"
    end
end
ken = Employee.new("Ken",35)
puts ken.class
puts ken.introduce

class Manger < Employee
    
end

class Worker < Employee
    
end
bob = Manger.new("Bob",48)
dan = Worker.new("Daniel",26)

p bob.class
p dan.class
p bob.introduce
p dan.introduce
bob.age = 52
p bob.age