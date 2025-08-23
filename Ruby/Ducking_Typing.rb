class IceCream
  attr_reader :flavor, :calories, :price
    def initialize(flavor:,calories:,price:)
            @flavor = flavor
            @price = price
            @calories = calories
    end

    def ==(other)
            self.calories == other.calories && price == other.price
    end
end

class Candy
    attr_reader :calories, :price
    
    def initialize(calories:, price:)
            @calories = calories
            @price = price
    end
end

cookies_and_cream = IceCream.new(flavor: "Cookies and Cream", calories: 300, price: 3.99)
rum_raisin = IceCream.new(flavor: "Rum Raisin", calories: 300, price: 3.99)
p cookies_and_cream == rum_raisin
p cookies_and_cream == cookies_and_cream
p cookies_and_cream ==  cookies_and_cream = IceCream.new(flavor: "Cookies and Cream", calories: 300, price: 3.99)
puts

p cookies_and_cream == snickers