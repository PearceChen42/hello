class OvenIsOffError < StandardError
    
end

class Oven
    attr_accessor :state
  def initialize
        @state = "off"

  end

  def turn_on
        self.state = "on"

  end

  def bake(item)
        if self.state == "off"
              raise  OvenIsOffError ,"please turn the oven on first!"
        else
          puts "Baking #{item}"
        end
  end
end
oven = Oven.new

begin
oven.bake("Pepperoni Pizza")
rescue OvenIsOffError => e
  puts e.message
  puts "I'll turn the oven on for you and try again!"
  oven.turn_on
  retry
end