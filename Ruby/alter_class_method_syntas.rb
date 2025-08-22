class Vehicle
  p self
  attr_reader :wheels, :passengers

  def initialize(wheels, passengers)
        @wheels = wheels
        @passengers = passengers
  end
  class <<  self
     def car
        new(4,6)
    end

    def truck
        new(18,2)
    end

    def hello
    puts "I'm a class method"       
    end
  end
end

Vehicle.hello
car = Vehicle.car
p car.wheels
p car.passengers
truck = Vehicle.truck
p truck.wheels