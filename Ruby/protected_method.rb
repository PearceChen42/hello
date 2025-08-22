class Car 
    def initialize(age,miles)
            base_value = 20_000
            age_deduction = age * 1000
            miles_deduction = miles / 10
            @value = base_value - age_deduction - miles_deduction

    end


    def compare_car_with(car)
          p self.value
          p car.value
          p (self.value / car.value.to_f )      
          self.value > car.value ? "You car is worse" : "Your car is better!"
    end

    protected
    def value
            @value
    end

end

civic = Car.new(3,30_000)
fiat = Car.new(1,20_000)


puts civic.compare_car_with fiat