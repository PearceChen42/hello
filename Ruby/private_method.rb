class SmartPhone
  attr_reader :username, :production_number
  attr_writer :password
    def initialize(username,password)
            @username = username
            @password = password
            @production_number = self.generate_production_number
    end

    private
    def generate_production_number
            random_number = rand(10_000..99_999)
            another_random_number = rand(10_000..99_999)
            "2023-#{random_number}-#{another_random_number}"
    end
end

phone = SmartPhone.new("rubyfan123","topsecret")
p phone.production_number
p phone.generate_production_number