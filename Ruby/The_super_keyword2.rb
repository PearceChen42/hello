class Car
  attr_reader :maker
    def initialize(maker)
            @maker = maker
    end
    def drive
            "Room Room!"
    end
end


class Firetuck < Car
    def initialize(maker,sirens)
      super(maker)
      @sirens = sirens
            
    end
    def drive(speed)
            super() + "BEEP! at #{speed} mph"
    end
end

ft = Firetuck.new("Ford",4)
p ft.drive 50