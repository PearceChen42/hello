class Guitar
  attr_reader :typer, :wood, :price
  attr_writer :price
  attr_accessor :strings
    def initialize(type, wood,strings,price)
            @type = type
            @wood = wood
            @strings = strings
            @price = price
    end

    def to_s
            "An #{@type} guitar with #{@strings} strings"
    end

    def type
            @type
    end
end

guitar = Guitar.new("Acoustic","Mahogany",6,1000)
p guitar.type
p guitar.wood
p guitar.strings
p guitar.price