class Guitar
  puts "Inside Guitar class: #{self}"
    def initialize
            @type = "Acoustic"
            @wood = "Alder"
            @strings = 6
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
end

guitar = Guitar.new
guitar.details
puts guitar.class
puts guitar.nil?
