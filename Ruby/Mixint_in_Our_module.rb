module Puchaseable
    p self
    def purchase(item)
            "#{item} has been purchased!"
    end
end

class Bookstore
    include Puchaseable
end

class Supermarket
    include Puchaseable
end

class Bodega < Supermarket
    
end

bookstore = Bookstore.new
supermarket = Supermarket.new
bodega = Bodega.new

puts bookstore.purchase("Animal Farm")
puts supermarket.purchase("Ice Cream")
puts bodega.purchase("Slim Jim")

puts

p Bookstore.ancestors
p Puchaseable.class
p Object.class
p Kernel.class
p BasicObject.class