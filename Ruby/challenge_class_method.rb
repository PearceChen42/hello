class Computer
    def initialize
      @cpu = 'Intel i7'
      @memory  =  64
      @storage = '2 TB'
    end

    def to_s
            "A pwoerful #{@cpu} computer with #{@memory}GB memory and #{@storage} of storage"
    end
end

computer = Computer.new
puts computer