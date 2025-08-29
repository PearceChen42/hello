def sum(a,b)
    begin
      a + b
    rescue TypeError => e
      puts "Class Name: #{e.class}"
      puts "Message: #{e.message}"
      a = a.to_i
      b = b.to_i
      retry
    rescue NoMethodError => e
      puts "This is Second error"

      puts "Class Name: #{e.class}"
      puts "Message: #{e.message}"
      a = 0
      b = 0
      retry
    ensure
      puts "I'm always going to run"
    end

end

puts sum(3,5)
puts
puts sum(3,"5")
puts
puts sum(nil,nil)