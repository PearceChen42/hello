class Guitar
    def initialize
            @type = "Acoustic"
            @wood = "Alder"
            @strings = 6
            @price = 1500
    end

    def to_s
            "An #{@type} guitar with #{@strings} strings"
    end

    def details
            self.nil_details
            class_details
    end

    def nil_details
        puts "Is it nil? #{nil?}"
    end

    def class_details
        puts "It is made from the #{self.class} class."
    end
    def type
            @type
    end
    
    def wood
            @wood
    end

    def strings
            @strings
    end

    def price
            @price
    end

    def price=(new_price)
      @price = new_price
    end
end

guitar = Guitar.new
p guitar.price
puts
guitar.price = 5000
p guitar.price