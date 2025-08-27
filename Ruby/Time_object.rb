puts Time.new
puts Time.now

puts Time.new(2023)
puts Time.new(2023,5,12,18,30,59,-7700)

some_day = Time.new(2023,5,12,18,30,59,-7700)

p some_day.sec
p some_day.mday
p some_day.yday
p some_day.wday
p some_day.friday?