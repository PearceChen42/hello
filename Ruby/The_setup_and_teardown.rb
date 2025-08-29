require "minitest/autorun"

class InvalidAttackError < StandardError
          
end

class Pokemon
    attr_reader :name, :type, :attacks

    def initialize(name, type)
            @name = name
            @type = type
            @attacks = []
    end

    def add_attack(attack)
        raise InvalidAttackError unless attack.is_a? String
        attacks << attack  
    end
end


class TestPokemon < Minitest::Test
    def setup
       @pikachu = Pokemon.new("Pikachu", :electric)
    end
    
    def teardown
            puts "Test is done. Deleting Pokemon from database"
    end

    def test_name
           
            assert_equal("Pikachu",@pikachu.name, "The Pokemon Object did not assign name valid")
            
    end

    def test_type
           
            assert_equal(:electric, @pikachu.type)
    end

    def test_adding_new_power
              @pikachu.add_attack("Electric Shock")
              assert_includes(@pikachu.attacks, "Electric Shock")
    end

    def test_adding_fake_power
        assert_raises(InvalidAttackError,"Adding a non-string attack should have triggered an error") {
                @pikachu.add_attack(15)
        }
              
    end
end