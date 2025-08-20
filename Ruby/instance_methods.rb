
class Guitar
    def initialize
            puts "A new object is being created"
            @type = "Acoustic"
            @wood = "Alder"
            @stings = 6
            @colors = ["Black", "Gold"]
    end

    def information
            "An #{@type} #{@wood} guitar with #{@stings} strings."
    end

    def to_s
        "Whatever This is a Guitar"          
    end

end

Guitar_1 =  Guitar.new
puts
p Guitar_1.information
puts Guitar_1.class
puts Guitar_1.to_s

