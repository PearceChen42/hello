class Guitar
  attr_reader :typer, :wood, :price
  attr_writer :price
  attr_accessor :strings
    def initialize
            @type = "Acoustic"
            @wood = "Alder"
            @strings = 6
            @price = 1500
    end

    def to_s
            "An #{@type} guitar with #{@strings} strings"
    end

    def type
            @type
    end
end

guitar = Guitar.new
p guitar.price
p guitar.wood
p guitar.strings
p guitar.type
guitar.price = 5000
p guitar.price
guitar.strings = 8
p guitar.strings
