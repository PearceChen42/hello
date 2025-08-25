puts Comparable.class

class OlympicMedal
  include Comparable

    attr_reader :type

    def initialize(type:)
            @type = type
    end

    def <=>(other)
            medal_values = { gold: 3, silver: 2, bronze: 1 }
            current_medal_value = medal_values[type]
            other_medal_value = medal_values[other.type]
            if current_medal_value < other_medal_value
                            return -1
            elsif current_medal_value = other_medal_value
                            return 0
            elsif current_medal_value > other_medal_value
                            return 1
            
            end
    end
end

bronze = OlympicMedal.new(type: :bronze)
silver = OlympicMedal.new(type:  :silver)
gold = OlympicMedal.new(type: :gold)

p bronze <=> silver
p gold > silver
p silver.between?(bronze,gold)