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

    def to_s
            
    end
end

class Manger < Employee
    def yell
            "Who's the boss? I'm the boss!"
    end

    def introduce
            "My name is #{name} and I am manager!"
    end
end

class Worker < Employee
  def clock_in(time)
        "Starting my shift at #{time}"
  end

  def yell
        "I'm Working! I'm Working!"
  end
end
sally = Manger.new("Sally",42)
puts sally.yell
puts sally.introduce
puts
chuck = Worker.new("Chuck",53)
puts chuck.clock_in("8:30AM")
puts chuck.yell
puts chuck.introduce