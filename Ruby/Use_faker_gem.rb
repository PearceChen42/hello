require "faker"

puts Faker.class 
puts Faker::Name.class
puts Faker::Name.name
puts Faker::Name.last_name

puts

p Faker.constants.sort
puts
puts Faker::Music.instrument