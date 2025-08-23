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

class Manger < Employee
    
end

class Worker < Employee
    
end

puts Manger.superclass
puts Worker.superclass
puts Employee.superclass
p Employee.subclasses
puts
puts Manger < Employee
puts Manger < BasicObject