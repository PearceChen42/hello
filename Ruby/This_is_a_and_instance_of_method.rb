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
ken = Manger.new("Ken",35)
puts ken.class
puts ken.introduce
puts ken.instance_of? Manger
puts ken.instance_of? Employee
puts
puts ken.is_a? Manger
puts ken.is_a? Employee