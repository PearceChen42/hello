class Rectangle
    attr_accessor :height, :width
    

    def initialize(height, width)
            @height = height
            @width = width  
    end

    def area
            height * width
            
    end
end

r = Rectangle.new(3,5)
p r.area