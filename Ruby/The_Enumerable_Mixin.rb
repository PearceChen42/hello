class Refirgerator
  include Enumerable
    attr_reader :snacks, :drinks

    def initialize(snacks:, drinks:)
            @snacks = snacks
            @drinks = drinks
    end

    def items
            snacks + drinks
    end

    def each
            items.each { |item| yield item}
    end
end


fridge = Refirgerator.new(snacks: ["Doritos", "Jolly Ranchers", "Ben & Jerry's Ice Cream"],
  drinks: ["Pepsi", "Coke", "Gatorade" ]

)
  
p fridge.items
puts
fridge.each {|item| puts "#{item} is delicious"}
puts
p fridge.sort #Need include Enumerable
print "\n"
p fridge.any? { |item| item.length > 10}  #Need include Enumerable
puts
p fridge.map { |item| item.upcase} #Need include Enumerable