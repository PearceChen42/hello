class Employee
  attr_reader :name
  attr_accessor :age
    def initialize(name,age)
            @name = name
            @age = age
    end

    def introduce
            "Hi, my name is #{name} and I am #{age} years old!"
    end

    def to_s
            
    end
end

class Manger < Employee
  attr_reader :rank
    def initialize(name,age,rank)
            super(name,age)
            @rank = rank
    end
  
    def yell
            "Who's the boss? I'm the boss!"
    end

    def introduce
       result = super
      result + " My name is #{name} and I am manager!"
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

sally = Manger.new("Sally",42,"Senior Vice President")
puts sally.introduce
p sally.rank