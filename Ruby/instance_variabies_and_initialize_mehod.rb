title = "1984"

class Guitar
    def initialize
            puts "A new object is being created"
            @type = "Acoustic"
            @wood = "Alder"
            @stings = 6
            @colors = ["Black", "Gold"]
    end
end

Guitar_1 = Guitar.new

p Guitar_1