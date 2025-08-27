module Purchaseable
    def purchase(item)
            "#{item} has been purchased!"
    end
end

class Bookstore
  prepend Purchaseable
    def purchase(item)
            "You bought a cop of #{item} at the bookstore!"
    end
end

BN = Bookstore.new
p BN.purchase "GooseBumps"

p Bookstore.ancestors