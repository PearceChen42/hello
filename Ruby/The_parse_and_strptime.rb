require "time"

puts Time.parse("2023-01-01")

puts Time.parse("-03-04-2023")

puts

puts Time.strptime("03-04-2023","%m-%d-%Y")